package j200130;

class Person {
	// 멤버 변수 선언
	String name; // null
	int age = 20;

	void print() {
		System.out.println("Person 이름: " + name + ", 나이: " + age);
	}
}

class Man extends Person {
	// 상속받은 멤버변수와 같은 이름의 변수를 자식클래스에도 선언 가능
	int age = 40;

	void print() {
		super.print();
		System.out.println("Person 이름: " + super.name + ", 나이: " + super.age);
		System.out.println("Man 이름: " + name + ", 나이: " + age);	// 각 변수 앞에 this 생략
	}
}

public class SuperTest2 {

	public static void main(String[] args) {
		
		// Man 클래스 m 객체 생성
		Man m = new Man();
		// m 객체 name 변수 초기화
		m.name = "홍길동";
		m.print();
	}

}
