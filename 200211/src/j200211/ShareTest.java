package j200211;

// 동기화 -> 입출력(RandomAccessFile) + Thread
// RandomAccessFile: 특정위치에 접근해서 파일을 읽거나 쓰는 입출력 클래스

import java.io.*;
import java.lang.Thread;

public class ShareTest implements Runnable {

	// RandomAccessFile 클래스형 변수 선언
	RandomAccessFile raf = null;

	public ShareTest() {
		try {
			// 파일 생성, 읽기/쓰기가 가능하도록 rw 모드로 설정
			raf = new RandomAccessFile("result.txt", "rw");

			// Thread 객체 생성, this는 Runnable 구현 클래스인 ShareTest 클래스를 지칭
			Thread t1 = new Thread(this, "MJH");
			Thread t2 = new Thread(this, "TEST");

			// Thread 객체 실행
			t1.start();
			t2.start();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// synchronized 예약어로 run() 메소드에 lock 걸기 → 동기화
	public synchronized void run() {
		// writeBytes(), raf에 글자쓰기
		try {
			for (int i = 0; i < 1000; i++) {
				// Thread 명 + File Pointer 위치 + 줄바꿈(\r\n: 윈도우 운영체제 줄바꿈)
				raf.writeBytes(Thread.currentThread().getName() + "[" + i + "]" + raf.getFilePointer() + "\r\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		// ShareTest 객체 생성
		new ShareTest();
	}

}
