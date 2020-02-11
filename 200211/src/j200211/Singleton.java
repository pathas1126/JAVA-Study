package j200211;

// 클래스 내부에서 객체를 한개만 생성 → 대여 → 반납
public class Singleton {

	// 1. 공유해서 사용할 수 있도록 정적 멤버 변수 선언
	private static Singleton instance = null;

	// 2. 생성자 private 설정시 외부에서 객체 생성 불가
	private Singleton() {
		System.out.println("인스턴스 생성");
	}

	// 3. 공유 객체를 다른 사람들에게 공유 → 정적 메소드
	public static Singleton getInstance() {
		// 객체가 생성되지 않았다면 객체를 생성해서 빌려줌
		if (instance == null) {
			// synchronized: 만들고자하는 객체를 공유객체로 등록
			synchronized (Singleton.class) {
				if (instance == null)
					instance = new Singleton();
			}
		}
		// instance 반환
		return instance;
	}

}
