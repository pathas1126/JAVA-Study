package j200130;
// 상속과 생성자와의 관계

// class Parent extends Object 가 생략된 상태
class Parent {
	String name;
	int age;

	Parent() {
		System.out.println("부모 클래스_기본 생성자 호출");
	}

	Parent(String name, int age) {
		this.age = age;
		this.name = name;
		System.out.println("super 생성자 호출");
	}

	// Object 클래스로부터 물려받은 toString()메소드 오버라이딩
	public String toString() {
		return "내용을 변경해도 되나요?";
	}
}

class Child extends Parent {
	Child() {
		super("홍길동", 24);
		System.out.println("자식 클래스_기본 생성자 호출");

	}

	void printInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}

public class InheriTest {

	public static void main(String[] args) {

		Parent pt = new Parent();
		System.out.println("pt.toString(): " + pt.toString());

		Child cd = new Child();
		System.out.println("cd.toString(): " + cd.toString());
		cd.printInfo();

	}

}
