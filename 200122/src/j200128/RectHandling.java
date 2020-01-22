package j200128;

public class RectHandling {
	// ��� ���� ����
	private int x;
	private int y;
	private int square;

	// �⺻ ������
	RectHandling() {
		// ������ ȣ��
		this(10, 15);
	}

	// ������ �����ε�
	RectHandling(int x, int y) {
		this.x = x;
		this.y = y;
		// ���� Ŭ���� �� �޼ҵ� ȣ��
		square();
	}

	// set()
	public void setX(int x) {
		this.x = x;
		// ���� ���̰� ����� ������ ���� ����
		square();
	}

	public void setY(int y) {
		this.y = y;
		// ���� ���̰� ����� ������ ���� ����
		square();
	}

	// get()
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// �Ϲ� �޼ҵ�
	// ���� ���ϱ�
	public void square() {
		square = x * y;
	}

	// ���� ���
	public void print() {
		System.out.println("����: " + x + ", ����: " + y);
		System.out.println("����: " + square);
	}

	public static void main(String[] args) {

		RectHandling rh = new RectHandling();
		rh.print();
		
		rh.setX(12);
		rh.setY(25);
		rh.print();

		RectHandling rh2 = new RectHandling(22, 33);
		rh2.print();
	}

}
