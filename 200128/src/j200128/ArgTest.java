package j200128;

public class ArgTest {

	public static void main(String[] args) {
		// �Ϲ����� �迭
		// ����) �ڷ��� �迭��[] = new �ڷ���[����];
		// �Ϲ� ������ �ݵ�� ���� �ʱ�ȭ�ؾ� ������, �迭�� �ڵ����� �ʱⰪ�� ������
		int[] suArray = new int[4];
		suArray[0] = 1;
		suArray[1] = 2;
		suArray[2] = 3;
		System.out.println(suArray[0]);
		System.out.println(suArray[1]);
		System.out.println(suArray[2]);
		System.out.println(suArray[3]);
		System.out.println(suArray);

		// �迭�� �������ڸ��� �ٷ� �� �ʱ�ȭ
		// �ڷ���[] �迭�� = {��1, ��2, ��3,,,,}
		int[] c = { 10, 20, 30, 40, 50, 60 };
		System.out.println(c);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		int[] arrayTest = new int[10];
		for (int i = 0; i < 10; i++) {
			arrayTest[i] = (i + 1) * 10;
		}
		for (int i = 0; i < arrayTest.length; i++) {
			System.out.println(arrayTest[i]);
		}
		
		// ���� for��(Ȯ�� for��)
		// ����) for([�迭 �ڷ���][����� ������]:[�迭��] or [�÷��� ��ü])
		for(int num:arrayTest) {
			System.out.print(num+"\t");
		}
		
	}

}
