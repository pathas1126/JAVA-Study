package j200213;

interface Xyz {
	int x = 8;

	public void a();
}

public class LamTest implements Xyz {

	public void a() {
		System.out.println("���� �Ϲ����� ���");
	}

	public static void main(String[] args) {
		// ���1) �ڽ�Ŭ������ �̿��ؼ� �޼ҵ� ȣ��
		LamTest lt = new LamTest();
		lt.a();

		// ��� 2) �͸�Ŭ���� �ۼ�, �߻�޼ҵ带 �������̵��ؼ� ȣ��
		// �������̽��� ��ü�� = new �������̽���(){�޼ҵ� �������̵�}; 
		// �����ݷ��� �� �ۼ����־�� ��
		Xyz abc = new Xyz() {
			public void a() {
				System.out.println("2��° ����Դϴ�.");
			}
		};
		abc.a();
	}

}
