package j200122;

public class RectHandling {

	public static void main(String[] args) {

		// rect 객체 생성
		Rect rect = new Rect();

		// 0 또는 음수 값은 저장될 수 없음
		rect.setWidth(-12.42);
		rect.setHeight(0);

		// set() 메소드로 넓이, 높이 설정
		rect.setWidth(10.25);
		rect.setHeight(20.22);
		rect.setSquare();

		// get() 메소드로 넓이, 높이 출력
		System.out.println("넓이: " + rect.getWidth());
		System.out.println("높이: " + rect.getHeight());

		// 면적 출력
		rect.print();

	}

}
