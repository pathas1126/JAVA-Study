package j200203;

import java.util.Scanner;

public class ShapeTest extends Shape implements Drawable {

	// ���� ������ ���ϴ� �޼ҵ� �������̵�
	public double areaCircle(int r) {
		return r * r * Math.PI;
	}

	// �簢���� ������ ���ϴ� �޼ҵ� �������̵�
	public double areaSquare(int w, int h) {
		return w * h;
	}

	// �ﰢ���� ������ ���ϴ� �޼ҵ�
	public double areaTriangle(int w, int h) {
		return (w * h) / 2;
	}

	public void draw() {
		System.out.println("������ �׸��� �׸��ϴ�.");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ShapeTest st = new ShapeTest();
		int r, w, h = 0;

		while (true) { // = for(;;)
			System.out.println("1.��, 2.�簢��, 3.�ﰢ��, 4.����");
			int choice = scan.nextInt();

			// ������ ������ ���� ������ ���ϰ� �׸��� �׸����� �ϴ� switch��
			switch (choice) {
			// ��
			case 1:
				System.out.println("�������� ���̸� �Է��Ͻÿ�");
				r = scan.nextInt();
				st.res = st.areaCircle(r);
				st.printArea();
				st.draw();
				System.out.println("================");
				break;
			// �簢��
			case 2:
				System.out.println("�簢���� ����(���� ����)�� �Է��Ͻÿ�");
				w = scan.nextInt();
				System.out.println("�簢���� ���̸� �Է��Ͻÿ�");
				h = scan.nextInt();
				st.res = st.areaSquare(w, h);
				st.printArea();
				System.out.println("================");
				st.draw();
				break;
			// �ﰢ��
			case 3:
				System.out.println("�ﰢ���� ����(���� ����)�� �Է��Ͻÿ�");
				w = scan.nextInt();
				System.out.println("�ﰢ���� ���̸� �Է��Ͻÿ�");
				h = scan.nextInt();
				st.res = st.areaTriangle(w, h);
				st.printArea();
				System.out.println("================");
				st.draw();
				break;
			default:
				System.out.println("���α׷��� ���� �˴ϴ�.");
				System.exit(0); // ���α׷� ���� ����
				// System.exit(-1); ������ ����, �� ������ ����
			}
		}

	}

}