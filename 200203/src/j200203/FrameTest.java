package j200203;

import java.awt.*; // Frame(â)
import javax.swing.*; // JFrame(â)

//main() �޼ҵ忡 �ٷ� â�� �����ϴ� �ڵ� �ۼ�

public class FrameTest {

	public static void main(String[] args) {
		// 1. â ����, â ���� ����
		JFrame f = new JFrame("�����Դϴ�.");

		// 2. â ũ�� ����
		f.setSize(600, 400);

		// 3. â ��ġ ����
		f.setLocation(600, 300);

		// 4. ȭ�鿡 â ���, �⺻���� �������� �ʰ� �����Ǿ� ����
		f.setVisible(true);

		// 5. X ��ư�� ������ �� â�� �������� ��, �޸� ���� �� ���α׷� ����
		// ���������� System.exit(0)�� ȣ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
