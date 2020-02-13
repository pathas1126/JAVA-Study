package j200213;

@FunctionalInterface
interface Lambda {
	void showString(String str);
}

public class LamPara {

	public static void main(String[] args) {
		// ���ٽ��� �������̽��� ������ ����
		Lambda ld = s -> System.out.println(s);

		// �� ������ ����� ���ٽ� ������ ȣ��
		ld.showString("Hello lambda"); // Hello lambda

		// �޼ҵ� �Ű������� ���ٽ� ���� ���� ����
		showMyString(ld); 	// �ȳ� ����?

	}

	// lambda �������̽��� ��ü�� �Ű������� �޴� �Լ�
	public static void showMyString(Lambda ld) {
		ld.showString("�ȳ� ����?");
	}
}
