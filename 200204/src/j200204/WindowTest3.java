package j200204;
// 3. Ư�� �̺�Ʈ �߻��� �̺�Ʈ�� ó���� Ŭ������ �̺�Ʈ ��� Ŭ������ ���ο� �ۼ��ؼ� ���

import java.awt.*;
import javax.swing.*;
// �̺�Ʈ ó�� ��Ű��
// awt.* ���� *�� ���ϸ� �ҷ����� ���� ������ �ҷ����� �ʱ� ������ ���� �ۼ��ؾ� ��
import java.awt.event.*;

public class WindowTest3 extends JFrame {

	public WindowTest3() {
		setTitle("��� �� �̺�Ʈ ó��");
		setBounds(600, 200, 600, 400);
		// �̺�Ʈ�� �߻����� �� ner Other() ��ü�� �̺�Ʈ�� ó����
		// ����) �̺�Ʈ�ҽ�.addXXXListener(�̺�Ʈ�� ó���� ��ü��)
		addWindowListener(new Inner());
		setVisible(true);
	}

	// Ŭ������ ���� ����� �Ұ����ϱ� ������ ���� Ŭ������ �ۼ�
	public class Inner extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowClosing");
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		// ���� ���� â ����
		new WindowTest3();
	}

}
