package j200211;

public class SingTest {

	// 유일한 인스턴스 생성, 공유를 위해 static으로 지정
	private static SingTest instance = new SingTest();

	// 생성자에 private 부여
	private SingTest() {
	}

	// 외부에서 인스턴스를 참조할 수 있도록 getInstance() 메소드 작성
	public static SingTest getInstance() {
		// synchronized: 객체 참조시 작업이 중복되지 않도록 함
		synchronized (SingTest.class) {
			// instance가 없다면 instance 변수에 객체 생성
			if (instance == null) {
				instance = new SingTest();
			}
			// instance 정적 멤버 변수 반환 → 외부 참조 가능
			return instance;
		}

	}

}
