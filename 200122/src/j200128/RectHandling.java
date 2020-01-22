package j200128;

public class RectHandling {
	// 멤버 변수 선언
	private int x;
	private int y;
	private int square;

	// 기본 생성자
	RectHandling() {
		// 생성자 호출
		this(10, 15);
	}

	// 생성자 오버로딩
	RectHandling(int x, int y) {
		this.x = x;
		this.y = y;
		// 동일 클래스 내 메소드 호출
		square();
	}

	// set()
	public void setX(int x) {
		this.x = x;
		// 가로 길이가 변경될 때마다 면적 수정
		square();
	}

	public void setY(int y) {
		this.y = y;
		// 세로 길이가 변경될 때마다 면적 수정
		square();
	}

	// get()
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// 일반 메소드
	// 면적 구하기
	public void square() {
		square = x * y;
	}

	// 정보 출력
	public void print() {
		System.out.println("가로: " + x + ", 세로: " + y);
		System.out.println("넓이: " + square);
	}

	public static void main(String[] args) {

		RectHandling rh = new RectHandling();
		rh.print();
		
		rh.setX(12);
		rh.setY(25);
		rh.print();

		RectHandling rh2 = new RectHandling(22, 33);
		rh2.print();
	}

}
