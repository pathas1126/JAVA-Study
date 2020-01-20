package j200121;

public class Rect {
	double width;	//직사각형 가로 길이
	double height;	// 세로 길이
	double square;	// 면적 넓이
	
	//면적을 구하는 메서드
	void square() {
		square = width * height;
	}
	
	//면적 출력 메서드
	void print() {
		System.out.println("직사각형의 넓이는 "+square+"제곱cm입니다.");
	}
}
