package j200122;

public class Rect {
	// 멤버 변수 private 처리
	private double width; // 직사각형 가로 길이
	private double height; // 세로 길이
	private double square; // 면적 넓이

	// Setter 메소드
	public void setWidth(double w) {
		if (w > 0)
			width = w;
		else
			System.out.println("넓이는 0 또는 음수일 수 없습니다!");
	}

	public void setHeight(double h) {
		if (h > 0)
			height = h;
		else
			System.out.println("높이는 0 또는 음수일 수 없습니다!");
	}

	// 면적을 구하는 메서드
	public void setSquare() {
		square = width * height;
	}

	// Getter 메소드 : get()메소드에도 public을 작성해주어야 함
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	// 면적 출력 메서드
	void print() {
		System.out.println("직사각형의 면적은 " + square + "제곱cm입니다.");
	}
}
