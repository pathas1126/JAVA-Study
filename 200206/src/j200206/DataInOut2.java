package j200206;

import java.io.*;

public class DataInOut2 {

	public static void main(String[] args) throws Exception {
		// 1. 파일로 저장
		File f = new File("c:/webtest/3.java/data.txt");
		FileOutputStream fos = new FileOutputStream(f);

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

		// 자바의 자료형에 맞게 파일의 자료를 읽어오는 객체 생성
		DataInputStream dis = new DataInputStream(new FileInputStream(f));

		// 불러온 값을 새로운 변수에 저장
		char c = dis.readChar();
		byte b2 = dis.readByte();
		// readLine()은 더 이상 지원하지 않는 메소드, BufferedReader 클래스의 readLine() 메소드를 쓰도록 장려됨
		String str2 = dis.readLine();
		byte bb[] = new byte[3];
		dis.read(bb);

		System.out.println("c:" + c);
		System.out.println("b2:" + b2);
		System.out.println("str2:" + str2);
		// 문자열을 byte[]로 반환, 주소값 출력
		System.out.println("str2:" + str2.getBytes());
		System.out.println("bb:" + bb);
		// byte[]를 매개변수로 하는 생성자를 사용해서 String으로 출력
		System.out.println(new String(bb));
	
	}

}
