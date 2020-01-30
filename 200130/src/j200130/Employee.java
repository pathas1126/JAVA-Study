package j200130;

// 예제 시나리오
// 회사에 입사, 신입 사원 -> 부서배치(개발 1과)
// 급여: 연봉제 + 분기별 보너스(직원: 150%, 팀장(중간관리자) 300%)

// 신입 사원 클래스
public class Employee {

	// 1. 공통 멤버 변수
	String name;
	int age;
	String gender;
	String addr;
	long salary;

	// 2. 생성자 오버로딩
	public Employee() {

	}

	// 이클립스로 생성자 작성 : Source -> Generate Constructor usiing Fields
	public Employee(String name, int age, String gender, String addr, long salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.addr = addr;
		this.salary = salary;
	}

	// 3. 보너스를 반환하는 메소드
	double bonus() {
		return salary * 1.5;
	}

	// 4. 저장되어 있는 값을 그대로 출력하는 메소드
	void display() {
		System.out.println("===직원 정보===");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("성별: " + gender);
		System.out.println("주소: " + addr);
		System.out.println("급여: " + salary);
		// 메소드 내부에서 동일 클래스 내의 일반 메소드 호출
		System.out.println("보너스: " + bonus());
	}

	public static void main(String[] args) {

		String str = "Hello, My Friend!";
		char[] ch = str.toCharArray();
		System.out.println(ch);
		for (int i = 0; i < 5; i++) {
			System.out.print(ch[i] + " ");
		}
	}

}