package j200204;
// 2. Ư�� �̺�Ʈ �߻��� �̺�Ʈ�� ó���� Ŭ������ ���� ���� �� ����� �޾Ƽ� ó��

import java.awt.*;
import javax.swing.*;
// �̺�Ʈ ó�� ��Ű��
// awt.* ���� *�� ���ϸ� �ҷ����� ���� ������ �ҷ����� �ʱ� ������ ���� �ۼ��ؾ� ��
import java.awt.event.*;

// �̺�Ʈ ������ Ŭ����
class Other implements WindowListener {

	@Override // â�� Ȱ��ȭ�Ǿ��� �� �̺�Ʈ �߻�
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowActivated");
	}

	@Override // â�� ������ �� ȣ���
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowOpened");

	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		// â�� �ƿ� ����� ���Ŀ� �߻��ϴ� �̺�Ʈ, �� ������� ����
	}

	@Override // â�� X ��ư�� ������ ���� �߻��ϴ� �̺�Ʈ
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

	@Override // �۾� ǥ������ �������� �ٽ� â���� ���ƿ��� ��
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeiconified");
	}

	@Override // �۾� ǥ���ٿ� ������ȭ�ż� â�� �� �ִ� ��
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowIconified");
	}
}

public class WindowTest2 extends JFrame {

	public WindowTest2() {
		setTitle("��� �� �̺�Ʈ ó��");
		setBounds(600, 200, 600, 400);
		// �̺�Ʈ�� �߻����� �� ner Other() ��ü�� �̺�Ʈ�� ó����
		// ����) �̺�Ʈ�ҽ�.addXXXListener(�̺�Ʈ�� ó���� ��ü��)
		addWindowListener(new Other());
		setVisible(true);
	}

	public static void main(String[] args) {

		// ���� ���� â ����
		new WindowTest2();
	}

}
