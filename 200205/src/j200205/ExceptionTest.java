package j200205;

public class ExceptionTest {

	public static void arr() throws java.lang.ArrayIndexOutOfBoundsException {
		String greetings[] = { "��ü �� ��ȯ", "���� ó��", "���� ó�� ���" };
		int i = 0; // ÷��
		while (i < 4) {
			System.out.println(greetings[i]);
			i++;
		}
	}

	public static void main(String[] args) {
		
		
	}

}
