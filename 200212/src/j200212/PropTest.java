package j200212;

import java.io.*;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) {
		// Properties 객체 생성
		Properties pro = new Properties();

		try {
			// 파일 불러오기, 입출력이므로 예외 처리 수행
			FileInputStream fis = new FileInputStream(
					"C:\\webtest\\3.java\\JAVA-Study\\200212\\src\\j200212\\ex1.properties");

			// fis 스트림으로부터 key=value 프로퍼티 리스트를 읽어 들임
			pro.load(fis);

			// 프로퍼티 리스트 출력
			System.out.println(pro);

			// 각 key에 해당하는 value 출력
			System.out.println(pro.getProperty("a"));
			System.out.println(pro.getProperty("b"));

			// a key에 해당하는 값을 "merong"으로 설정
			pro.setProperty("a", "merong");
			System.out.println(pro.getProperty("a"));

			// 변경된 프로퍼티 리스트를 파일에 덮어 씀
			pro.store(new FileOutputStream("C:\\webtest\\3.java\\JAVA-Study\\200212\\src\\j200212\\ex1.properties"),
					"This is a comment.");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
