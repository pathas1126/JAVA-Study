package j200204;

// �߻� Ŭ���� ����
abstract class Abs {

	// �߻� �޼ҵ�
	abstract public void absPrint();

	// �Ϲ� �޼ҵ�
	public void print() {
		System.out.println("�߻� Ŭ���� �Ϲ� �޼ҵ� ȣ��");
	}
}

// �ܺ� Ŭ����
public class OuterInner {

	// �߻� Ŭ���� ��� ���� �͸� Ŭ���� ��ü ����
	// �߻� Ŭ������ ����߱� ������ �ڷ����� �߻� Ŭ������ ����
	Abs abs = new Abs() {
		public void absPrint() {
			System.out.println("�߻� Ŭ���� ��� ���� �͸� Ŭ����");
		}
	};

	// �������̽� ���� ���� �͸� Ŭ���� ��ü ����
	// �������̽��� �����߱� ������ �ڷ����� �������̽��� ����
	OuterInter oi = new OuterInter() {
		public void interPrint() {
			System.out.println("�������̽� ���� ���� �͸� Ŭ���� ");
		}
	};

	public static void main(String[] args) {

		// �ܺ� Ŭ���� ��ü ����
		OuterInner outin = new OuterInner();

		// �ܺ� Ŭ���� ��ü���� �������̽� ��ü�� �����ǵ� interPrint() �޼ҵ� ȣ��
		outin.oi.interPrint();

		// �߻� Ŭ���� ��ü�� �����ǵ� absPrint() �޼ҵ� ȣ��
		outin.abs.absPrint();

		// �߻� Ŭ���� ��ü�� �Ϲ� �޼ҵ� ���� ����� �� ����
		outin.abs.print();
	}

}
