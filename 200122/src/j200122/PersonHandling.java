package j200122;

class Person {

	// 멤버 변수
	private String name; // 이름
	private int age; // 나이

	// 기본 생성자
	Person() {
		System.out.println("기본 생성자 호출");
	}

	// 생성자 오버로드 : 가능한 조합 개수 = 2의 멤버변수 개수 제곱(기본생성자 포함)
	Person(String name) {
		this.name = name;
	}

	Person(int age) {
		this.age = age;
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// set() 메소드
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("나이의 값은 음수일 수 없습니다!");
			age = 23; // 기본값 설정
		}
	}

	// get() 메소드
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// 메소드
	void display() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}

public class PersonHandling {

	public static void main(String[] args) {

		Person p = new Person(); // Person 클래스의 객체 p를 생성하면서 기본생성자 Person 호출
		System.out.println("p: " + p); // p: j200122.Person@15db9742
		p.display(); // 이름: null, 나이: 0

		Person p2 = new Person(23);
		p2.display(); // 이름: null, 나이: 23

		Person p3 = new Person("홍길동");
		p3.display(); // 이름: 홍길동, 나이: 0

		Person p4 = new Person("강감찬", 23);
//		위 코드는 다음과 같이 작성 가능
//		Person p4 = new Person();
//		p4.setName("강감찬");
//		p4.setAge(23);
		p4.display(); // 이름: 강감찬, 나이: 23
	}

}
