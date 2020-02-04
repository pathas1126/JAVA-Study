package j200204;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// 버튼 클릭, ActionEvent -> ActionListener, actionPerformed(), 텍스트필드
public class ButtonEvent extends JFrame implements ActionListener {

	JButton b1, b2, b3, b4;
	JTextField tf1;

	// 컴포넌트 생성 방법(Frame -> Panel -> Button) ↔ 컴포넌트 부착 방법(Button -> Panel -> Frame)

	public ButtonEvent() {
		super("버튼을 이용한 이벤트처리와 객체형변환");
		setBounds(600, 200, 400, 300);
		getContentPane().setLayout(new GridLayout(5, 1, 3, 3));
		// JPanel p = new JPanel();
		// 창에 부착할 컴포넌트 생성
		b1 = new JButton("시작");
		b2 = new JButton("Go");
		b3 = new JButton("Back");
		b4 = new JButton("점프");
		tf1 = new JTextField("");
		// p.add(comp) 버튼 부착
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(tf1);
		// 종료
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		tf1.addActionListener(this);

		setVisible(true);
	}

	@Override
	// 버튼을 클릭했을 때 자동으로 호출되는 메소드
	public void actionPerformed(ActionEvent e) {
		// ActionEvent: 이벤트 발생 컴포넌트 정보를 얻어다 주는 메소드
		// 1. e.getActionCommand() 이벤트 발생 컴포넌트의 이름을 가져옴
		// 2. e.getSource() 이벤트 발생 컴포넌트 종류를 가져옴
		System.out.println(e.getActionCommand());
		String s = e.getActionCommand();
		// 시작 버튼을 눌렀다면
		if (s.contentEquals("시작")) {
			// getContentPane()은 JFrame에 색을 부여할 때만 사용
			b1.setBackground(new Color(200, 20, 40));
			System.out.println(b1.getBackground());
			this.setTitle(s);
		} else if (s.contentEquals("Go")) {
			b2.setBackground(new Color(100, 80, 60));
			this.setTitle(s);
		} else if (s.contentEquals("Back")) {
			b3.setBackground(new Color(50, 60, 200));
			this.setTitle(s);
		} else if (s.contentEquals("점프")) {
			b4.setBackground(new Color(50, 200, 60));
			this.setTitle(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEvent();
	}

}
