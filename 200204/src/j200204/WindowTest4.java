package j200204;
// 3. Ư�� �̺�Ʈ �߻��� �̺�Ʈ�� ó���� Ŭ������ �̺�Ʈ ��� Ŭ������ ���ο� �ۼ��ؼ� ���

import java.awt.*;
import javax.swing.*;
// �̺�Ʈ ó�� ��Ű��
// awt.* ���� *�� ���ϸ� �ҷ����� ���� ������ �ҷ����� �ʱ� ������ ���� �ۼ��ؾ� ��
import java.awt.event.*;

public class WindowTest4 extends JFrame {

	public WindowTest4() {
		setTitle("��� �� �̺�Ʈ ó��");
		setBounds(600, 200, 600, 400);
		// �̺�Ʈ�� �߻����� �� ner Other() ��ü�� �̺�Ʈ�� ó����
		// ����) �̺�Ʈ�ҽ�.addXXXListener(�̺�Ʈ�� ó���� ��ü��)

		// Ŭ������ ���� ����� �Ұ����ϱ� ������ ���� Ŭ������ �ۼ�
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

		// ���� ���� â ����
		new WindowTest4();
	}

}
