package j200203;

// 도형에 따른 면적 구하기 → 공통으로 사용되는 멤버변수, 메소드 명시
public abstract class Shape {

	// 면적을 저장할 멤버 변수, 모든 도형에 공통으로 적용
	public double res = 0.0;

	// ========= 추상 메소드 =========
	// 원 면적 구하기, 반지름을 매개변수로 받음
	public abstract double areaCircle(int r);

	// 직사각형
	abstract public double areaSquare(int w, int h);

	// ========= 일반 메소드 =========
	public void printArea() {
		System.out.println("도형의 면적은 " + res + "입니다.");
	}
}
