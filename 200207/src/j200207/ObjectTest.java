package j200207;

// 객체 자체(멤버 변수)를 파일로 저장 

import java.io.*;

// 직렬화 객체의 클래스는 반드시 Serializable 인터페이스를 구현해야 함
class Person implements Serializable {
	String name;
	int age;
	String addr;
	transient String gender;
}

public class ObjectTest {

	// 입출력 메소드를 사용하기 때문에 반드시 예외 처리를 해야 함
	public static void main(String[] args) throws  Exception {

		// Person 객체 생성
		Person p = new Person();

		// p 객체 변수 초기화
		p.name = "홍길동";
		p.age = 34;
		p.addr = "경기도 광명시";
		p.gender = "남자";

		// 객체 주소 출력
		System.out.println(p);

		// p 객체 name, gender 변수 값 출력
		System.out.println(p.name);
		System.out.println(p.gender);

		// 한글이 있지만 객체를 저장하기 때문에 FileOutputStream 사용
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));

		// p 객체를 파일에 작성
		oos.writeObject(p);

		// 스트림 사용 후 메모리 해제
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));

		// 모든 유형의 객체를 저장해야 하기 때문에 Object 클래스형으로 저장됨
		Object pr = ois.readObject();

		// pr 객체가 Person 클래스의 인스턴스인지 확인
		System.out.println(pr instanceof Person);
		System.out.println(pr);

		// pr 객체를 Person 자료형의 pp 객체로 형 변환(Downcasting)
		Person pp = (Person) pr;

		// pp 객체 주소 출력
		System.out.println(pp);

		// pp 객체 name 변수 값 출력
		System.out.println(pp.name);

		// pp 객체 gender 변수 값 출력
		System.out.println(pp.gender);

		// 스트림 사용 후 메모리 해제
		ois.close();

	}

}
