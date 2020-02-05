package j200205;

// ���� ����_������ ������ �ٸ��� ������ �޼ҵ带 ���� �ۼ�

// ����(����, ����, �����Ͼ�,,,) 500��(�μ����� ������ �ٸ�)
class Employee {
	public void taxRate(Employee e) {

		if(e instanceof Manager) {
			Manager m = (Manager) e;
			System.out.println("Manager�� �°� ���� ���");
		} else if( e instanceof Engineer) {
			Engineer eg = (Engineer) e;
			System.out.println("Engineer�� �°� ���� ���");
		} else {
			System.out.println("�Ϲ� ����Դϴ�.");
		}
		
	}
	// public void taxRate(Manager e){}
	// public void taxRate(Engineer e){}
	// ������ ���� ������ �ߺ��� �ڵ��� �ݺ��ؾ���
	// ���-> �ֻ��� �θ�Ŭ���������� ����ȯ�� �ؼ� �ذ�

}

// ����: ���� + ����, ����� �� ������
class Manager extends Employee {
	// public void taxRate(Manager e){} => �̷��� �ۼ��� �ʿ䰡 ������

}

class Engineer extends Employee {
	// public void taxRate(Engineer e){} => �ۼ��� �ʿ� X

}

public class CastTest {

	public static void main(String[] args) {

		// ��ü ����
		Employee emp = new Employee();
		Manager man = new Manager();
		Engineer eng = new Engineer();
		
		// ������ -> �޼ҵ� �ٸ��� �ۼ�
		emp.taxRate(emp);
		man.taxRate(man);
		eng.taxRate(eng);

	}

}
