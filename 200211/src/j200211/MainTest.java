package j200211;

public class MainTest {

	public static void main(String[] args) {
		// �ܺ� Ŭ�������� ���� ��ü ����
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();

		// ��ü �̸��� �ٸ����� �ּҰ��� ������
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		// j200211.Singleton@15db9742
		
		if(obj1 == obj2) {
			System.out.println("���� ��ü�Դϴ�!");
		} else {
			System.out.println("�ٸ� ��ü�� �� ��������??");
		}
	}

}
