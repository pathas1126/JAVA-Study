package j200213;

import java.awt.*;
import javax.swing.*;

// MVC 모델
// Model: 데이터 저장 영역(배열로 선언)
// View: 화면에 출력하는 영역, JTable, JScrollPane 등
// Controller: Model 내부의 데이터를 View에 출력하는 방식을 결정

public class JTableTest extends JFrame {

	// 부착 컴포넌트
	JTable table;

	public JTableTest() {
		setTitle("JTable 구조 연습");
		// ====== Model =======
		String header[] = { "이름", "주소", "전화번호" };
		String cells[][] = { { "홍길동", "서울", "02-123-1241" }, { "이순신", "경남", "010-2532-1231" },
				{ "유성룡", "한양", "010-2313-1236" } };

		// JTable(Object[][] rowData, Object[] columnNames)
		table = new JTable(cells, header);
		JScrollPane jp = new JScrollPane(table);
		add(jp);	// add() 앞에 this.getContentPane() 생략
		// =================

		setBounds(300, 300, 300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTableTest();
	}

}
