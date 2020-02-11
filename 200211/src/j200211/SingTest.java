package j200211;

public class SingTest {

	// ������ �ν��Ͻ� ����, ������ ���� static���� ����
	private static SingTest instance = new SingTest();

	// �����ڿ� private �ο�
	private SingTest() {
	}

	// �ܺο��� �ν��Ͻ��� ������ �� �ֵ��� getInstance() �޼ҵ� �ۼ�
	public static SingTest getInstance() {
		// synchronized: ��ü ������ �۾��� �ߺ����� �ʵ��� ��
		synchronized (SingTest.class) {
			// instance�� ���ٸ� instance ������ ��ü ����
			if (instance == null) {
				instance = new SingTest();
			}
			// instance ���� ��� ���� ��ȯ �� �ܺ� ���� ����
			return instance;
		}

	}

}
