package j200206;

// BufferedReader, InputStreamReader, FileWriter

import java.io.*;

public class Sawon {

	public static void main(String[] args) throws Exception {

		String mem_name = null; // 이름
		String mem_id = null; // 사번
		String mem_pwd = null; // 암호
		String mem_gender = null; // 성별
		String mem_age = null; // 나이
		String mem_phone = null; // 핸드폰 번호
		// 계산 목적이 아닌 경우에는 String 사용

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 한글 저장: FileWriter, 영어 저장: FileOutputStream
		File f = new File("C:/webtest/3.java/sawon.txt");

		// FileWriter 클래스 객체 생성
		FileWriter fw = new FileWriter(f, true);

		System.out.println("====회원 정보 입력====");

		// 각 변수에 데이터 입력
		System.out.println("이름?");
		mem_name = br.readLine();
		System.out.println("ID?");
		mem_id = br.readLine();
		System.out.println("암호?");
		mem_pwd = br.readLine();
		System.out.println("성별?");
		mem_gender = br.readLine();
		System.out.println("나이?");
		mem_age = br.readLine();
		System.out.println("핸드폰 번호?");
		mem_phone = br.readLine();

		fw.write(mem_name + "\r\n"); // \r\n : 윈도우에서의 줄바꿈 특수기호
		fw.write(mem_id + "\r\n");
		fw.write(mem_pwd + "\r\n");
		fw.write(mem_gender + "\r\n");
		fw.write(mem_age + "\r\n");
		fw.write(mem_phone);
		// 파일과 연결된 스트림을 닫음(메모리 해제), 출력 버퍼도 비워짐
		fw.close();
		// BufferedReader 클래스 객체 스트림도 닫아주어야 함
		br.close();

	}

}
