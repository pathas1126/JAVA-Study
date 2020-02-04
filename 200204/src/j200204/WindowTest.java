package j200204;
// 1. Ư�� �̺�Ʈ �߻��� �̺�Ʈ�� �߻��� Ŭ�������� ó�� -> ����� �޾Ƽ� ó��

import java.awt.*;
import javax.swing.*;
// �̺�Ʈ ó�� ��Ű��
// awt.* ���� *�� ���ϸ� �ҷ����� ���� ������ �ҷ����� �ʱ� ������ ���� �ۼ��ؾ� ��
import java.awt.event.*;

// WindowTest -> WindowListener �������̽�
public class WindowTest extends JFrame implements WindowListener {

	public WindowTest() {
		setTitle("��� �� �̺�Ʈ ó��");
		setBounds(600, 200, 600, 400);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �̺�Ʈ�� �߻����� �� �ü���� ��ȣ ����
		// ����) �̺�Ʈ�ҽ�.addXXXListener(�̺�Ʈ�� ó���� ��ü��)
		addWindowListener(this);
		setVisible(true);
	}

	public static void main(String[] args) {

		// ���� ���� â ����
		new WindowTest();
	}

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
