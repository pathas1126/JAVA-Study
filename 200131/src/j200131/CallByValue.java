package j200131;

// 값에 의한 전달 방법(매개변수의 자료형: 기본 자료형 8가지)
// 기존의 값을 복사해서 잔달하기 때문에 원본은 변함이 없음
public class CallByValue {

	static void changeColor(int r, int g, int b) {
		r += 10;
		g += 50;
		b += 10;
		System.out.println("changeColor_red: " + r + ", green: " + g + ", blue: " + b);
	}

	public static void main(String[] args) {

		// rgb(0~255) 각각의 변수 r, g, b 초기화
		int r = -1, g = -1, b = -1;
		System.out.println("before_red: " + r + ", green: " + g + ", blue: " + b);

		// r, g, b 를 인자로 받아서 changeColor()
		// 메소드의 지역 변수 r, g, b 각각의 값 출력
		// 인자가 전달될 때는 원래의 값을 복사해서 전달함
		changeColor(r, g, b);

		// changeColor()의 r, g, b에 main()의 r, g, b의 값 즉, value가 복사돼서
        // 전달되었기 때문에 main()의 r, g, b에는 변함이 없음
		System.out.println("after_red: " + r + ", green: " + g + ", blue: " + b);
	}

}
