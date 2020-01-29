package j200129;

public class VarArgTest {

	// �޼ҵ� �����ε�, �ϳ��� Ŭ�������� ����� ����� ���� �޼��尡 ������ �ִ� ��� ���
	// �����ε� ��� => �迭 + Ȯ�� for�� + �����ε�, �Ű������� �ڷ����� �ݵ�� ���� ������ �ٸ� �� ���

	/*
	 * public void stringPrint(String a) { System.out.println("a: "+a); } public
	 * void stringPrint(String a, String b) { System.out.println("a: "+a+",b: "+b);
	 * } public void stringPrint(String a, String b, String c) {
	 * System.out.println("a: "+a+",b: "+b+", c:"+c); }
	 */

	// ���� �迭�� �Ű������� �޴� �޼ҵ�
	public void stringPrint(String[] names) {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	// �����迭�� �޼ҵ� �ۼ�, �ڷ����� �ݵ�� ���ƾ� ��
	// ����) �޼ҵ� �ۼ������ ����(�ڷ��� ... �迭��), '...' : �迭�� �����迭���� ����
	public void print(String... names) {
		for (String su : names) {
			System.out.print(su + ", ");
		}
		System.out.println();
	}
	/*
	 * String names[] = {"ȫ�浿"} String names[] = {"ȫ�浿", "�̼���"} ...
	 */

	public static void main(String[] args) {
		VarArgTest vat = new VarArgTest();
		String str[] = { "Banana", "Orange", "Apple", "Grape" };
		vat.stringPrint(str);

		vat.print("ȫ�浿");
		vat.print("ȫ�浿", "�̼���");
		vat.print("ȫ�浿", "�̼���", "������");
		vat.print("ȫ�浿", "�̼���", "������", "������");
		vat.print("ȫ�浿", "�̼���", "������", "������", "�̵�");

	}

}
