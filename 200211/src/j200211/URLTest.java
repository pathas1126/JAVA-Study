package j200211;

import java.io.*;
import java.net.*;

public class URLTest {

	public URLTest(String s) throws Exception {
		// URl 클래스 객체 생성
		URL url = new URL(s);

		// 접속한 컴퓨터의 스트림 이용
		InputStream in = url.openStream();

		// 데이터를 가져와서 저장 후 콘솔에 출력
		String ss;
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		// 데이터를 계속 읽어들일 수 있는 상태라면 콘솔에 출력
		while ((ss = br.readLine()) != null) {
			System.out.println(ss);
			// 파일에 출력: FileOutputStream, FileWriter
		}

		// 스트림 사용 후 메모리 해제
		in.close();
		br.close();
	}

	public static void main(String[] args) throws Exception {

		// URLTest 객체 생성
		URLTest ult = new URLTest("http://www.naver.com");

	}
}
