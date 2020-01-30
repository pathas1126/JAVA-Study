package j200130;

// 팀장 이상 직원들의 정보를 저장할 클래스, Employee 클래스 상속
class Manager extends Employee {
	/*
	 * 상속 받은 멤버 변수 String name; int age; String gender; String addr; long salary;
	 */

	String department;

	// 객체 배열, 같은 자료형의 객체만 저장된 배열
	Employee sub[]; // 신입 사원들의 정보가 담긴 클래스의 멤버 변수로 선언된 객체 배열

	// 생성자는 상속받을 수 없기 때문에 직접 작성 해야 함
	public Manager() {
	}

	public Manager(String name, int age, String gender, long salary, String addr, String department) {
		// 부모 클래스 Employee 생성자에서 중복되는 변수 초기화
		super(name, age, gender, addr, salary);
		// 부모 클래스에 없는 멤버 변수만 따로 초기화
		this.department = department;
	}

	// Employee 클래스의 bonus() 메소드 오버라이딩
	double bonus() {
		return salary * 3.0;
	}

	void display() {
		// 부모 클래스의 display() 호출
		super.display();
		// 자식 클래스 정보 출력
		System.out.println("담당 부서: " + department);
		System.out.println("부하 직원 수: " + sub.length);
	}
}

public class Company {

	public static void main(String[] args) {
		// 신입사원 3명 채용
		Employee e1 = new Employee("홍길동", 23, "남", "서울시 강북구", 1500);
		Employee e2 = new Employee("이순신", 25, "여", "경기도 광주시", 2100);
		Employee e3 = new Employee("강감찬", 22, "남", "대전시 중구", 1700);

		// 부서배치(개발부)
		Manager m1 = new Manager("이세종", 42, "남", 3000, "서울시 강남구", "개발 1과");
		m1.sub = new Employee[3];
		m1.sub[0] = e1;
		m1.sub[1] = e2;
		m1.sub[2] = e3;

		// 사원 정보 출력, Employee를 상속받았기 때문에 Employee의 display() 메소드 사용 가능
		System.out.println("====신입 사원====");
		for (int i = 0; i < m1.sub.length; i++) {
			m1.sub[i].display();
		}

		// 팀장 출력
		System.out.println("====팀장====");
		m1.display();

		// ※ OOP 4대 요소 중 상속이 가장 중요함 => 소스코드 양을 대폭 감소시킬 수 있음
	}
}