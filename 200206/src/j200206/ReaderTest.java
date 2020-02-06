package j200206;

// IO에 필요한 클래스 전부 import
import java.io.*;

public class ReaderTest {

	// 입출력 메소드 사용시 반드시 예외 처리를 해주어야 함
	public static void main(String[] args) throws IOException {

		// FileWriter 스트림 객체 생성, 작성할 파일 연결
		FileWriter fw = new FileWriter("ReadMe.txt");

		// 파일에 내용 작성
		fw.write("FileWriter 스트림으로 작성된 파일입니다.");

		// fw 스트림 사용 후 메모리에서 해제
		fw.close();

		// FileReader 스트림 객체 생성, 불러올 파일 연결
		FileReader fr = new FileReader("ReadMe.txt");

		// 불러온 자료를 임시로 저장할 변수 선언
		int i = 0; // 숫자로 불러오기 때문에 자료형은 int

		// 읽어들인 데이터 출력
		while (true) {
			i = fr.read();
			// 읽은 데이터가 없는 경우 while문 탈출
			if (i == -1)
				break;
			// 자료형이 int형이기 때문에 char형으로 형변환 후 출력
			System.out.print((char) i);
		}

		// fr 스트림 사용 후 메모리에서 해제
		fr.close();
	}

}
