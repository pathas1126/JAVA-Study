package j200205;

// 전제 조건_업무별 세금이 다르기 때문에 메소드를 따로 작성

// 직원(신입, 팀장, 엔지니어,,,) 500명(부서별로 직원이 다름)
class Employee {
	public void taxRate(Employee e) {

		if(e instanceof Manager) {
			Manager m = (Manager) e;
			System.out.println("Manager에 맞게 세금 계산");
		} else if( e instanceof Engineer) {
			Engineer eg = (Engineer) e;
			System.out.println("Engineer에 맞게 세금 계산");
		} else {
			System.out.println("일반 사원입니다.");
		}
		
	}
	// public void taxRate(Manager e){}
	// public void taxRate(Engineer e){}
	// 직원의 수가 많으면 중복된 코딩을 반복해야함
	// 상속-> 최상위 부모클래스형으로 형변환을 해서 해결

}

// 팀장: 직원 + 팀장, 기능이 더 많아짐
class Manager extends Employee {
	// public void taxRate(Manager e){} => 이렇게 작성할 필요가 없어짐

}

class Engineer extends Employee {
	// public void taxRate(Engineer e){} => 작성할 필요 X

}

public class CastTest {

	public static void main(String[] args) {

		// 객체 생성
		Employee emp = new Employee();
		Manager man = new Manager();
		Engineer eng = new Engineer();
		
		// 세금율 -> 메소드 다르게 작성
		emp.taxRate(emp);
		man.taxRate(man);
		eng.taxRate(eng);

	}

}
