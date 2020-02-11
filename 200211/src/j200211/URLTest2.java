package j200211;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class URLTest2 {

	public URLTest2(String s) throws Exception {

		// URl 클래스 객체 생성
		URL url = new URL(s);

		// 접속한 컴퓨터의 스트림 이용
		InputStream in = url.openStream();

		// 데이터를 가져와서 html 변수에 저장
		String html;
		// InputStreamReader + BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		// FileWriter
		FileWriter fw = new FileWriter("C:\\webtest\\3.java\\JAVA-Study\\200211\\url.txt");

		// 데이터를 끝까지 읽어들이면서 파일에 출력
		while (5 > 3) {
			html = br.readLine();
			fw.write(html);

			// 콘솔에도 출력
			System.out.println(html);

			// 읽어올 값이 없어지면 while문 탈출
			if (br.readLine() == null)
				break;
		}

		// 스트림 사용 후 메모리 해제
		in.close();
		br.close();
		fw.close();
	}

	public static void main(String[] args) throws Exception {

		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);

		// 문자열 입력
		System.out.println("사이트 도메인 주소를 입력하세요");
		String dom = "http://";
		dom += sc.nextLine();

		// 입력된 도메인 주소 확인
		System.out.println(dom);

		// URLTest 객체 생성
		URLTest2 ult = new URLTest2(dom);

	}
}
