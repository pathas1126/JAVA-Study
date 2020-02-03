package j200203;

import java.util.Scanner;

public class ShapeTest extends Shape implements Drawable {

	// 원의 면적을 구하는 메소드 오버라이딩
	public double areaCircle(int r) {
		return r * r * Math.PI;
	}

	// 사각형의 면적을 구하는 메소드 오버라이딩
	public double areaSquare(int w, int h) {
		return w * h;
	}

	// 삼각형의 면적을 구하는 메소드
	public double areaTriangle(int w, int h) {
		return (w * h) / 2;
	}

	public void draw() {
		System.out.println("도형의 그림을 그립니다.");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ShapeTest st = new ShapeTest();
		int r, w, h = 0;

		while (true) { // = for(;;)
			System.out.println("1.원, 2.사각형, 3.삼각형, 4.종료");
			int choice = scan.nextInt();

			// 도형의 종류에 따라 면적을 구하고 그림을 그리도록 하는 switch문
			switch (choice) {
			// 원
			case 1:
				System.out.println("반지름의 길이를 입력하시오");
				r = scan.nextInt();
				st.res = st.areaCircle(r);
				st.printArea();
				st.draw();
				System.out.println("================");
				break;
			// 사각형
			case 2:
				System.out.println("사각형의 넓이(가로 길이)를 입력하시오");
				w = scan.nextInt();
				System.out.println("사각형의 높이를 입력하시오");
				h = scan.nextInt();
				st.res = st.areaSquare(w, h);
				st.printArea();
				System.out.println("================");
				st.draw();
				break;
			// 삼각형
			case 3:
				System.out.println("삼각형의 넓이(가로 길이)를 입력하시오");
				w = scan.nextInt();
				System.out.println("삼각형의 높이를 입력하시오");
				h = scan.nextInt();
				st.res = st.areaTriangle(w, h);
				st.printArea();
				System.out.println("================");
				st.draw();
				break;
			default:
				System.out.println("프로그램이 종료 됩니다.");
				System.exit(0); // 프로그램 정상 종료
				// System.exit(-1); 비정상 종료, 잘 쓰이진 않음
			}
		}

	}

}