package j200207;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// 해당 경로/파일명.확장자를 매개변수로 받아서 File 객체 생성
		File f = new File("fileTest.txt");

		// f 객체를 비어있는 파일로 생성
		Boolean b = f.createNewFile();
		System.out.println(b);		// true

		// f가 실제 파일인지 확인
		Boolean b2 = f.isFile();
		System.out.println(b2);		// false

		// f가 폴더인지 확인
		Boolean b3 = f.isDirectory();
		System.out.println(b3);		// true

		// 파일의 이름을 가져 옴
		String name = f.getName();
		System.out.println(name);	// fileTest.txt

		// 파일의 절대 경로를 가져옴
		String absPath = f.getAbsolutePath();
		System.out.println(absPath);
		// C:\webtest\3.java\JAVA-Study\200207\fileTest.txt

		// 객체 생성시 지정된 파일 경로를 가져옴
		String path = f.getPath();
		System.out.println(path);	//fileTest.txt

		// 파일을 읽을 수 있는지 확인
		Boolean b4 = f.canRead();
		System.out.println(b4);		// true

		// 파일에 쓸 수 있는지 확인
		Boolean b5 = f.canWrite();
		System.out.println(b5);		// true

		// 파일 삭제
		Boolean b6 = f.delete();
		System.out.println(b6);		// true

	}

}
