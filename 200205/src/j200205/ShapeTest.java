package j200205;

//Shape
class Shape {

	// 모든 도형에서 사용하는 메소드
	void draw() {
		System.out.println("Shape");
	}

	// Shape 전용 메소드
	void shapeDraw() {
		System.out.println("Shape");
	}
}

//Point
//상속은 is-a 관계를 형성해야 함
//점은 도형이다 O, 도형은 점이다 X => is-a관계
class Point extends Shape {
	// 오버라이딩
	void draw() {
		System.out.println("Point");
	}

	// Point 클래스 메소드
	void pointDraw() {
		System.out.println("Point");
	}
}

//Line
class Line extends Point {
	// 오버라이딩
	void draw() {
		System.out.println("Line");
	}

	// Point 클래스 메소드
	void lineDraw() {
		System.out.println("Line");
	}
}

//Square
class Square extends Line {
	// 오버라이딩
	void draw() {
		System.out.println("Square");
	}

	// Square 클래스 메소드
	void squareDraw() {
		System.out.println("Square");
	}
}

public class ShapeTest {

	public static void main(String[] args) {

		System.out.println("객체 형변환_묵시적");
		// 클래스형에 맞는 객체 생성
		Shape s = new Shape();
		Point p = new Point();
		Line l = new Line();
		Square sq = new Square();

		Shape sp = new Point();

		// 각자 메소드 출력
		s.draw();
		p.draw();
		l.draw();
		sq.draw();
		sp.draw();

		// 자동 형변환
		// 배열에는 같은 자료형만 들어올 수 있는데
		// 하위 클래스 객체는 상위 클래스 배열에 자동으로 들어갈 수 있음
		Shape[] sh = new Shape[5];
		sh[0] = s; // Shape
		sh[1] = p; // Shape + Point
		sh[2] = l; // Shape + Point + Line
		sh[3] = new Square();
		sh[4] = sp;

		// 배열에 각 객체가 저장되었는지 확인
		for (int i = 0; i < sh.length; i++) {
			sh[i].draw();
			whoAreYou(sh[i]);
		}

		// 강제 형변환
		if (sp instanceof Point) {
			System.out.println("Point 클래스 객체!");
			Point pp = (Point) sp;
			pp.pointDraw();
		}
	}

	// 클래스형 확인 메소드
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
