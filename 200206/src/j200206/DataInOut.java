package j200206;

import java.io.*;

public class DataInOut {

	public static void main(String[] args) throws Exception {
		// 1. 파일로 저장
		FileOutputStream fos = new FileOutputStream("c:/webtest/3.java/data.txt");

		// 2. 자바의 자료형에 맞게 포장
		DataOutputStream dos = new DataOutputStream(fos);

		// 3. 메모리의 자료형에 맞게 저장
		char han = '한'; // 유니코드 0~65535
		System.out.println((int) han);
		byte b = 21;
		String str = "bg\n";
		byte ba[] = { 65, 66, 67 }; // A, B, C 변환

		// DataOutputStream 메소드를 사용해야 함
		dos.writeChar(han);
		dos.writeByte(b);
		dos.writeBytes(str);
		dos.write(ba);

		// 파일에 자료 출력 후 스트림 메모리 해제
		dos.close();
		fos.close();

	}

}
