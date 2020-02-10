
public class ThreadTest {

	// 내부적으로 메인메소드를 실행하는 역할
	public static void main(String[] args) {

		// 현재 작동중인 스레드 객체의 이름을 출력
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());

		/*
		 * while (true) { System.out.println("main Thread 실행 중!!"); }
		 */
	}

}
