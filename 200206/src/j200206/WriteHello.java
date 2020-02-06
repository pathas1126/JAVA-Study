package j200206;

// java.io: 입출력에 필요한 package
import java.io.*;

public class WriteHello {

	public static void main(String[] args) {
		// byte: 데이터 전송 단위
		byte hello[] = { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33, 10 };
		byte a = 72;

		// System.out: 표준 출력, System.in: 표준 입력
		// 변수에 저장된 내용을 확인할때 사용(있는 그대로 출력)
		System.out.println(a);

		// hello 배열 위치 출력
		System.out.println(hello);

		// 어떤 입/출력 클래스에도 write와 read는 모두 있음
		// 버퍼(데이터 저장 영역)에 일정 용량 이상이 쌓여야 출력이 가능함
		// 입출력 성능 향상을 위한 것
		System.out.write(a);
		// 데이터를 변환해서 출력
		// 컴퓨터는 숫자로 기억하고 있지만, 출력이기 때문에 사람이 읽을 수 있는 문자 즉, H가 출력됨
		// 아스키코드를 디코딩해서 출력

		// 데이터를 쌓아두지 말고 바고 출력하도록 하는 메소드
		System.out.flush();

		try {
			System.out.write(hello); // 입출력을 할 때에는 반드시 예외처리를 해야함
			throw new IOException("에러가 발생했슴다");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
