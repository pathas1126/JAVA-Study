package j200122;

public class ThisTest2 {

	// �⺻ ������
	ThisTest2() {
		// �ڱ� Ŭ���� ������ ���ο����� �ڱ� Ŭ���� ��ü���� ���X -> this ���
		System.out.println("���� ������ ��ü: " + this);
	}

	ThisTest2 returnSelf() {
		return this;
	}

	public static void main(String[] args) {

		ThisTest2 tt = new ThisTest2();
		ThisTest2 ttt = tt.returnSelf();
		System.out.println("��ȯ�� this ��: " + ttt); // tt��ü ���� ���� ��ȯ
		System.out.println("���� main()���� ������ tt��ü: " + tt);

		ThisTest2 tt2 = new ThisTest2();
		System.out.println("���� main()���� ������ tt2��ü: " + tt2);
	}

}
