package j200211;

public class SingTestTest {

	public static void main(String[] args) {
		// 객체 생성, SingTest 클래스의 인스턴스를 반환 받음
		SingTest st1 = SingTest.getInstance();
		SingTest st2 = SingTest.getInstance();

		// 동일한 인스턴스인지 비교
		if (st1 == st2) {
			System.out.println("st1 주소: " + st1);
			System.out.println("st2 주소: " + st2);
			System.out.println("같은 인스턴스 입니다.");
		}
		/*
		 */
	}

}
