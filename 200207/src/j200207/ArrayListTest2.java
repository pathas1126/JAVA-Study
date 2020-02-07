package j200207;

import java.util.*;
import java.io.Serializable;

// Person 클래스 직렬화
class Man implements Serializable {
	private String name;
	private int age;

	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class ArrayListTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 명?");
		String name = sc.next();

		System.out.println("나이는?");
		int age = sc.nextInt();

		Man m = new Man("홍길동", 33);
		Man m1 = new Man("이순신", 23);
		Man m2 = new Man(name, age);

		ArrayList<Man> list = new ArrayList();
		list.add(m);
		list.add(m1);
		list.add(m2);

		getPersonList(list);

	}

	public static void getPersonList(ArrayList<Man> list) {
		for (Man a : list) {
			System.out.println("이름: " + a.getName());
			System.out.println("나이: " + a.getAge());
		}
	}
}
