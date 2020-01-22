package j200122;

public class Rect {
	// ��� ���� private ó��
	private double width; // ���簢�� ���� ����
	private double height; // ���� ����
	private double square; // ���� ����

	// Setter �޼ҵ�
	public void setWidth(double w) {
		if (w > 0)
			width = w;
		else
			System.out.println("���̴� 0 �Ǵ� ������ �� �����ϴ�!");
	}

	public void setHeight(double h) {
		if (h > 0)
			height = h;
		else
			System.out.println("���̴� 0 �Ǵ� ������ �� �����ϴ�!");
	}

	// ������ ���ϴ� �޼���
	public void setSquare() {
		square = width * height;
	}

	// Getter �޼ҵ� : get()�޼ҵ忡�� public�� �ۼ����־�� ��
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	// ���� ��� �޼���
	void print() {
		System.out.println("���簢���� ������ " + square + "����cm�Դϴ�.");
	}
}
