package j200211;

// Ŭ���� ���ο��� ��ü�� �Ѱ��� ���� �� �뿩 �� �ݳ�
public class Singleton {

	// 1. �����ؼ� ����� �� �ֵ��� ���� ��� ���� ����
	private static Singleton instance = null;

	// 2. ������ private ������ �ܺο��� ��ü ���� �Ұ�
	private Singleton() {
		System.out.println("�ν��Ͻ� ����");
	}

	// 3. ���� ��ü�� �ٸ� ����鿡�� ���� �� ���� �޼ҵ�
	public static Singleton getInstance() {
		// ��ü�� �������� �ʾҴٸ� ��ü�� �����ؼ� ������
		if (instance == null) {
			// synchronized: ��������ϴ� ��ü�� ������ü�� ���
			synchronized (Singleton.class) {
				if (instance == null)
					instance = new Singleton();
			}
		}
		// instance ��ȯ
		return instance;
	}

}
