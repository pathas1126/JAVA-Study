package j200131;

// 주소에 의한 전달 방법, 매개변수의 자료형은 객체형(=클래스형=참조변수형)
// 주소값 즉, 원본을 전달함

// 데이터 저장 목적 클래스(멤버 변수에 값을 저장하는 목적)
class RGBColor {
	// 멤버 변수
	int r, g, b; // 0, 0, 0

	// 생성자
	RGBColor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
}

public class CallByRef {

	// 색상을 변경하고 변경된 값을 출력하는 정적 메소드
	static void changeColor(RGBColor rgbc) {
		System.out.println("rgbc 주소: " + rgbc);
		rgbc.r += 10;
		rgbc.g += 50;
		rgbc.b += 10;
		System.out.println("changeColor_red: " + rgbc.r + ", green: " + rgbc.g + ", blue: " + rgbc.b);
	}

	public static void main(String[] args) {

		// RGBColor 클래스 객체 생성, 초기화
		RGBColor rgb = new RGBColor(-1, -1, -1);

		// rgb 객체의 주소 출력
		System.out.println("rgb 주소: " + rgb);

		// 변경 전 rgb 객체의 멤버변수 r, g, b 출력
		System.out.println("before_red: " + rgb.r + ", green: " + rgb.g + ", blue: " + rgb.b);

		// changeColor()함수에 rgb 객체(주소)를 인자로 전달
		changeColor(rgb);

		// 변경 후 rgb 객체의 멤버변수 r, g, b 출력
		System.out.println("after_red: " + rgb.r + ", green: " + rgb.g + ", blue: " + rgb.b);
	}

}
