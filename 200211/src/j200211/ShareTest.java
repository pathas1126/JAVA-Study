package j200211;

// ����ȭ -> �����(RandomAccessFile) + Thread
// RandomAccessFile: Ư����ġ�� �����ؼ� ������ �аų� ���� ����� Ŭ����

import java.io.*;
import java.lang.Thread;

public class ShareTest implements Runnable {

	// RandomAccessFile Ŭ������ ���� ����
	RandomAccessFile raf = null;

	public ShareTest() {
		try {
			// ���� ����, �б�/���Ⱑ �����ϵ��� rw ���� ����
			raf = new RandomAccessFile("result.txt", "rw");

			// Thread ��ü ����, this�� Runnable ���� Ŭ������ ShareTest Ŭ������ ��Ī
			Thread t1 = new Thread(this, "MJH");
			Thread t2 = new Thread(this, "TEST");

			// Thread ��ü ����
			t1.start();
			t2.start();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// synchronized ������ run() �޼ҵ忡 lock �ɱ� �� ����ȭ
	public synchronized void run() {
		// writeBytes(), raf�� ���ھ���
		try {
			for (int i = 0; i < 1000; i++) {
				// Thread �� + File Pointer ��ġ + �ٹٲ�(\r\n: ������ �ü�� �ٹٲ�)
				raf.writeBytes(Thread.currentThread().getName() + "[" + i + "]" + raf.getFilePointer() + "\r\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		// ShareTest ��ü ����
		new ShareTest();
	}

}
