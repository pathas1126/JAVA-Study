package j200204;
// 1. 특정 이벤트 발생시 이벤트가 발생한 클래스에서 처리 -> 상속을 받아서 처리

import java.awt.*;
import javax.swing.*;
// 이벤트 처리 패키지
// awt.* 에서 *은 파일만 불러오고 하위 폴더는 불러오지 않기 때문에 따로 작성해야 함
import java.awt.event.*;

// WindowTest -> WindowListener 인터페이스
public class WindowTest extends JFrame implements WindowListener {

	public WindowTest() {
		setTitle("상속 후 이벤트 처리");
		setBounds(600, 200, 600, 400);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 이벤트가 발생했을 때 운영체제에 신호 전달
		// 형식) 이벤트소스.addXXXListener(이벤트를 처리할 객체명)
		addWindowListener(this);
		setVisible(true);
	}

	public static void main(String[] args) {

		// 제목 없는 창 생성
		new WindowTest();
	}

	@Override // 창이 활성화되었을 때 이벤트 발생
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowActivated");
	}

	@Override // 창이 열렸을 때 호출됨
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowOpened");

	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		// 창이 아예 종료된 이후에 발생하는 이벤트, 잘 사용하지 않음
	}

	@Override // 창의 X 버튼을 누르는 동안 발생하는 이벤트
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosing");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated");
	}

	@Override // 작업 표시줄의 아이콘이 다시 창으로 돌아오는 것
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeiconified");
	}

	@Override // 작업 표시줄에 아이콘화돼서 창이 들어가 있는 것
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowIconified");
	}

}
