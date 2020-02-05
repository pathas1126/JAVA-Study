package j200205;

public class ExceptionTotal {

	public static void main(String[] args) {
		System.out.println("�Ű������� ���� �޾Ƽ� ó��");
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("a: " + a + ", b:" + b);
			System.out.println("a�� b�� ���� ��: " + (a / b));
		} catch (ArithmeticException e) { // ���Ŀ��� 9/0
			System.out.println(e.getMessage());
			System.out.println("9�� 0���� ���� �� �����ϴ�.");
		} catch (IndexOutOfBoundsException e) { // �迭 ÷�� ����(�ϳ��� �Է��� ���)
			System.out.println(e);
			System.out.println("2���� ���ڸ� �Է��ϼ���!");
		} catch (NumberFormatException e) { // ���� ��ȯ ���� ���� "9" -> 9, "a" -> (X)
			System.out.println(e.toString());
			System.out.println("�Է��� �ݵ�� ���ڿ��� �մϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("���� �߻��� ��� ���� �ݵ�� ����");
		}
	}

}
