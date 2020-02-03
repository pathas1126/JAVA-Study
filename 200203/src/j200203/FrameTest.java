package j200203;

import java.awt.*; // Frame(창)
import javax.swing.*; // JFrame(창)

//main() 메소드에 바로 창을 생성하는 코드 작성

public class FrameTest {

	public static void main(String[] args) {
		// 1. 창 생성, 창 제목 설정
		JFrame f = new JFrame("제목입니다.");

		// 2. 창 크기 지정
		f.setSize(600, 400);

		// 3. 창 위치 지정
		f.setLocation(600, 300);

		// 4. 화면에 창 출력, 기본값이 보여지지 않게 설정되어 있음
		f.setVisible(true);

		// 5. X 버튼을 눌렀을 때 창이 닫히도록 함, 메모리 해제 후 프로그램 종료
		// 내부적으로 System.exit(0)을 호출함
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
