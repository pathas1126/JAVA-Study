package j200203;

// ������ ���� ���� ���ϱ� �� �������� ���Ǵ� �������, �޼ҵ� ���
public abstract class Shape {

	// ������ ������ ��� ����, ��� ������ �������� ����
	public double res = 0.0;

	// ========= �߻� �޼ҵ� =========
	// �� ���� ���ϱ�, �������� �Ű������� ����
	public abstract double areaCircle(int r);

	// ���簢��
	abstract public double areaSquare(int w, int h);

	// ========= �Ϲ� �޼ҵ� =========
	public void printArea() {
		System.out.println("������ ������ " + res + "�Դϴ�.");
	}
}
