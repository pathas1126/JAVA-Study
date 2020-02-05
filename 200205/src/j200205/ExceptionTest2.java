package j200205;

public class ExceptionTest2 {

	public void go() throws ArrayIndexOutOfBoundsException {
		String greetings[] = { "��ü �� ��ȯ", "���� ó��", "���� ó�� ���" };
		int i = 0; // ÷��
		while (i < 4) {
			System.out.println(greetings[i]);
			i++;
		}
	}

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
//		String greetings[] = { "��ü �� ��ȯ", "���� ó��", "���� ó�� ���" };
//		int i = 0;	// ÷��
//		while(i<4) {
//			System.out.println(greetings[i]);
//			i++;
//		}
		try {
			ExceptionTest2 et = new ExceptionTest2();
			et.go();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("���� ó�� ����");
	}

	// throws : ���� ó�� �̷��

}
