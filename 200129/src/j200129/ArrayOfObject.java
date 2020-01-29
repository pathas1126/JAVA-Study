package j200129;

public class ArrayOfObject {

	// 멤버 변수 선언
	String name;
	int age;
	char gender;

	// 생성자
	ArrayOfObject(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// 정보 출력 메소드
	void printInfo() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 성별: " + gender);
	}

	public static void main(String[] args) {
		ArrayOfObject[] aoo = new ArrayOfObject[3];

		aoo[0] = new ArrayOfObject("이순신", 33, '남');
		aoo[1] = new ArrayOfObject("유성룡", 34, '남');
		aoo[2] = new ArrayOfObject("권율", 32, '남');

		// 객체 배열에 저장된 각각의 값 출력
		for (int i = 0; i < aoo.length; i++) {
			aoo[i].printInfo();
		}
		
		// 객체 주소값 출력
		for (int i = 0; i < aoo.length; i++) {
			System.out.println(aoo[i]);
		}

		// 첫 번째 요소의 이름만 출력해보기
		System.out.println("이름: " + aoo[0].name);
	}

}
