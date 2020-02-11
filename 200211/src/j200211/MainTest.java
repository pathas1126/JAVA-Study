package j200211;

public class MainTest {

	public static void main(String[] args) {
		// 외부 클래스에서 공유 객체 생성
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();

		// 객체 이름은 다르지만 주소값은 동일함
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		// j200211.Singleton@15db9742
		
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다!");
		} else {
			System.out.println("다른 객체인 거 같은데요??");
		}
	}

}
