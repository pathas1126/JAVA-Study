package j200131;

// �ּҿ� ���� ���� ���, �Ű������� �ڷ����� ��ü��(=Ŭ������=����������)
// �ּҰ� ��, ������ ������

// ������ ���� ���� Ŭ����(��� ������ ���� �����ϴ� ����)
class RGBColor {
	// ��� ����
	int r, g, b; // 0, 0, 0

	// ������
	RGBColor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
}

public class CallByRef {

	// ������ �����ϰ� ����� ���� ����ϴ� ���� �޼ҵ�
	static void changeColor(RGBColor rgbc) {
		System.out.println("rgbc �ּ�: " + rgbc);
		rgbc.r += 10;
		rgbc.g += 50;
		rgbc.b += 10;
		System.out.println("changeColor_red: " + rgbc.r + ", green: " + rgbc.g + ", blue: " + rgbc.b);
	}

	public static void main(String[] args) {

		// RGBColor Ŭ���� ��ü ����, �ʱ�ȭ
		RGBColor rgb = new RGBColor(-1, -1, -1);

		// rgb ��ü�� �ּ� ���
		System.out.println("rgb �ּ�: " + rgb);

		// ���� �� rgb ��ü�� ������� r, g, b ���
		System.out.println("before_red: " + rgb.r + ", green: " + rgb.g + ", blue: " + rgb.b);

		// changeColor()�Լ��� rgb ��ü(�ּ�)�� ���ڷ� ����
		changeColor(rgb);

		// ���� �� rgb ��ü�� ������� r, g, b ���
		System.out.println("after_red: " + rgb.r + ", green: " + rgb.g + ", blue: " + rgb.b);
	}

}
