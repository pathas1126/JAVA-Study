package j200203;

import java.awt.*; // Frame(â)
import javax.swing.*; // JFrame(â)

// JFrame Ŭ������ ��ӹ޾Ƽ� �ۼ�
public class FrameTest2 extends JFrame {

	// �����ڸ� �̿��ؼ� ������Ʈ �ʱ�ȭ, ���� ���� ����ϴ� ���� 
	// �����ڴ� ����� �ȵǱ� ������ ���� �ۼ��ؾ� ��
	public FrameTest2(String s) {
		// JFrameŬ������ title ���� ������ ȣ��
		super(s);
		// setTitle(s); �ε� �ۼ� ����

		// â�� ��ġ�� ũ�⸦ �� ���� ����
		setBounds(600, 400, 600, 300);
		
		// ���� ����
		getContentPane().setBackground(new Color(255, 20, 141));

		// ȭ�鿡 â ���, �⺻���� �������� �ʰ� �����Ǿ� ����
		setVisible(true);

		// X ��ư�� ������ �� â�� �������� ��, �޸� ���� �� ���α׷� ����
		// ���������� System.exit(0)�� ȣ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		FrameTest2 ft2 = new FrameTest2("�̷� ��~~~��!!!");
		
	}

}
