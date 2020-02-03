package j200203;

import java.awt.*; // Frame(창)
import javax.swing.*; // JFrame(창)

// JFrame 클래스를 상속받아서 작성
public class FrameTest2 extends JFrame {

	// 생성자를 이용해서 컴포넌트 초기화, 가장 많이 사용하는 패턴 
	// 생성자는 상속이 안되기 때문에 새로 작성해야 함
	public FrameTest2(String s) {
		// JFrame클래스의 title 설정 생성자 호출
		super(s);
		// setTitle(s); 로도 작성 가능

		// 창의 위치와 크기를 한 번에 지정
		setBounds(600, 400, 600, 300);
		
		// 배경색 지정
		getContentPane().setBackground(new Color(255, 20, 141));

		// 화면에 창 출력, 기본값이 보여지지 않게 설정되어 있음
		setVisible(true);

		// X 버튼을 눌렀을 때 창이 닫히도록 함, 메모리 해제 후 프로그램 종료
		// 내부적으로 System.exit(0)을 호출함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		FrameTest2 ft2 = new FrameTest2("이런 젠~~~장!!!");
		
	}

}
