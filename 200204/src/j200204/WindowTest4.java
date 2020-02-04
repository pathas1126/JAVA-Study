package j200204;
// 3. 특정 이벤트 발생시 이벤트를 처리할 클래스를 이벤트 대상 클래스의 내부에 작성해서 사용

import java.awt.*;
import javax.swing.*;
// 이벤트 처리 패키지
// awt.* 에서 *은 파일만 불러오고 하위 폴더는 불러오지 않기 때문에 따로 작성해야 함
import java.awt.event.*;

public class WindowTest4 extends JFrame {

	public WindowTest4() {
		setTitle("상속 후 이벤트 처리");
		setBounds(600, 200, 600, 400);
		// 이벤트가 발생했을 때 ner Other() 객체가 이벤트를 처리함
		// 형식) 이벤트소스.addXXXListener(이벤트를 처리할 객체명)

		// 클래스는 다중 상속이 불가능하기 때문에 내부 클래스로 작성
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("windowClosing");
				System.exit(0);
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {

		// 제목 없는 창 생성
		new WindowTest4();
	}

}
