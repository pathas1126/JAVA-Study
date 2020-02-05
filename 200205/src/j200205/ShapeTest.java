package j200205;

//Shape
class Shape {

	// ��� �������� ����ϴ� �޼ҵ�
	void draw() {
		System.out.println("Shape");
	}

	// Shape ���� �޼ҵ�
	void shapeDraw() {
		System.out.println("Shape");
	}
}

//Point
//����� is-a ���踦 �����ؾ� ��
//���� �����̴� O, ������ ���̴� X => is-a����
class Point extends Shape {
	// �������̵�
	void draw() {
		System.out.println("Point");
	}

	// Point Ŭ���� �޼ҵ�
	void pointDraw() {
		System.out.println("Point");
	}
}

//Line
class Line extends Point {
	// �������̵�
	void draw() {
		System.out.println("Line");
	}

	// Point Ŭ���� �޼ҵ�
	void lineDraw() {
		System.out.println("Line");
	}
}

//Square
class Square extends Line {
	// �������̵�
	void draw() {
		System.out.println("Square");
	}

	// Square Ŭ���� �޼ҵ�
	void squareDraw() {
		System.out.println("Square");
	}
}

public class ShapeTest {

	public static void main(String[] args) {

		System.out.println("��ü ����ȯ_������");
		// Ŭ�������� �´� ��ü ����
		Shape s = new Shape();
		Point p = new Point();
		Line l = new Line();
		Square sq = new Square();

		Shape sp = new Point();

		// ���� �޼ҵ� ���
		s.draw();
		p.draw();
		l.draw();
		sq.draw();
		sp.draw();

		// �ڵ� ����ȯ
		// �迭���� ���� �ڷ����� ���� �� �ִµ�
		// ���� Ŭ���� ��ü�� ���� Ŭ���� �迭�� �ڵ����� �� �� ����
		Shape[] sh = new Shape[5];
		sh[0] = s; // Shape
		sh[1] = p; // Shape + Point
		sh[2] = l; // Shape + Point + Line
		sh[3] = new Square();
		sh[4] = sp;

		// �迭�� �� ��ü�� ����Ǿ����� Ȯ��
		for (int i = 0; i < sh.length; i++) {
			sh[i].draw();
			whoAreYou(sh[i]);
		}

		// ���� ����ȯ
		if (sp instanceof Point) {
			System.out.println("Point Ŭ���� ��ü!");
			Point pp = (Point) sp;
			pp.pointDraw();
		}
	}

	// Ŭ������ Ȯ�� �޼ҵ�
	static void whoAreYou(Shape sh) {
		// Shape
		if (sh instanceof Shape)
			System.out.println("I am Shape");
		else
			System.out.println("I am not Shape");
		// Point
		if (sh instanceof Point)
			System.out.println("I am Point");
		else
			System.out.println("I am not Point");
		// Line
		if (sh instanceof Line)
			System.out.println("I am Line");
		else
			System.out.println("I am not Line");
		// Square
		if (sh instanceof Square)
			System.out.println("I am Square");
		else
			System.out.println("I am not Square");
	}

}
