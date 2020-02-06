package j200206;

// 키보드로 입력을 받아서 입력받은 값을 그대로 콘솔에 출력
import java.io.*;
// System.in.read() => 키보드 자료를 읽어들여라 <=> System.in.write()

public class SimpleIn {
	// 입출력 메소드는 반드시 예외처리를 해주어야함
	// 예외가 발생하지 않는 경우에는 throws문으로 간단하게 처리
	public static void main(String[] args) throws IOException {

		// 영문자, 한글, 숫자, 특수기호 -> 컴퓨터는 모두 숫자로 읽어 들임, 따라서 숫자로 자료형을 지정함
		int charRead;
		System.out.println("아무 문자열이나 입력 하시오");
		// 얼마나 읽어들일지를 알 수 없기 때문에 while문 사용
		// 아스키코드, 유니코드는 전부 0이상의 수로 이루어져 있고,
		// System.in.read()는 파일을 읽을 수 없을 때 -1을 리턴하기 때문에 아래와 같은 조건식 작성
		while ((charRead = System.in.read()) >= 0) {
			System.out.write(charRead);
		}

	}

}
