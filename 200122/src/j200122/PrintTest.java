package j200122;

public class PrintTest {

	// Constructor Overload + Method Overloading
	PrintTest() {
	};

	PrintTest(char x) {
		print(x);
	};

	/*
	 * 자기 클래스 내부에서는 자기 객체명을 사용할 수 없음, 다른 클래스의 객체명은 객체 생성 후 사용 가능
	 */
	PrintTest(int y) {
		print(y);
	};

	PrintTest(boolean z) {
		print(z);
	};

	// Method Overloading, 매개변수 O, 반환값 X
	void print(char c) {
		System.out.println("입력받은 문자: " + c);
	}

	void print(int i) {
		System.out.println("입력받은 정수: " + i);
	}

	void print(boolean b) {
		System.out.println("입력받은 논리값: " + b);
	}

	public static void main(String[] args) {
		PrintTest pt1 = new PrintTest('v'); // 입력받은 문자: v
		PrintTest pt2 = new PrintTest(23); // 입력받은 정수: 23
		PrintTest pt3 = new PrintTest(23 > 11); // 입력받은 논리값: true

	}

}
