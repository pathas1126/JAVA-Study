package j200213;

interface Xyz {
	int x = 8;

	public void a();
}

public class LamTest implements Xyz {

	public void a() {
		System.out.println("가장 일반적인 방법");
	}

	public static void main(String[] args) {
		// 방법1) 자식클래스를 이용해서 메소드 호출
		LamTest lt = new LamTest();
		lt.a();

		// 방법 2) 익명클래스 작성, 추상메소드를 오버라이딩해서 호출
		// 인터페이스형 객체명 = new 인터페이스형(){메소드 오버라이딩}; 
		// 세미콜론을 꼭 작성해주어야 함
		Xyz abc = new Xyz() {
			public void a() {
				System.out.println("2번째 방법입니다.");
			}
		};
		abc.a();
	}

}
