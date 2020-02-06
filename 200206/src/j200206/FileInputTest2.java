package j200206;

// 파일의 내용을 읽어 들여서 다른 파일로 복사해서 출력
import java.io.*;

public class FileInputTest2 {

	public static void main(String[] args) throws Exception {

		// 해당 파일을 읽어들이는 스트림 객체 생성
		FileInputStream fis = new FileInputStream("C:/webtest/SCaptureSetup121.exe");

		// 파일을 출력할 스트림 객체 생성
//		FileOutputStream fos = new FileOutputStream("C:/webtest/3.java/JAVA-Study/200206/src/j200206/Test.exe");
		FileOutputStream fos = new FileOutputStream(
				new File("C:/webtest/3.java/JAVA-Study/200206/src/j200206/Test.exe"));

		// 파일을 임시로 저장할 변수
		int read = 0;

//		while (read != -1) {
//			read = fis.read();
//			System.out.write(read);
//		}

		while (true) {
			read = fis.read();
			// read 값이 -1이 되면 탈출함
			if (read == -1)
				break;
			fos.write(read);
		}

	}

}
