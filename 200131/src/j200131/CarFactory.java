package j200131;

// Static 활용 예제

class Car {
	String color;
	String model;
	String owner;
	// 차의 모델과 상관없이 판매량의 합계만 저장하고자 하는 변수
	// Static 변수: 모든 인스턴스에서 공유하고자 하는 변수
	static int serialNumber;

	// 생성자, [Source] 탭 -> [Generate Constructor using Fields...] 탭에서 생성자 자동 생성 가능
	public Car(String color, String model, String owner) {
		this.color = color;
		this.model = model;
		this.owner = owner;
		serialNumber++; // 모델에 상관없이 공통으로 serialNumber의 값이 1씩 올라감
	}

	// setter, getter
	// [Source] 탭 -> [Generate Getters and Setters...] 탭에서 setter, getter 자동 생성 가능

	// 차 생산량을 반환하는 static getter
	public static int getNumber() {
		return serialNumber;
	}

	// =================== java 변수 정리 =====================
	// 멤버 변수(=인스턴스 변수) : 클래스 내부에 선언된 각 개체별로 소유하는 변수,
	// 일반 메소드에서만 불러다 사용할 수 있음
	// 정적 변수(=클래스 변수): 모든 객체가 공유할 수 있는 변수, 프로그램이 작동하는 동안 메모리에 상주
	// 일반 메소드와 정적 메소두 모두에서 불러다 사용 가능
	// 지역 변수: 메소드 매개변수 및 메소드 내부에 선언된 변수, 스택에 저장

}

public class CarFactory {

	public static void main(String[] args) {
		// Car 클래스 객체 생성
		Car c1 = new Car("Red", "SM5", "test-1");
		System.out.println("지금까지의 차 생산량: " + Car.serialNumber);

		Car c2 = new Car("Blue", "Sonata", "test-2");
		System.out.println("지금까지의 차 생산량: " + Car.serialNumber);

		Car c3 = new Car("Orange", "Martiz", "test-3");
		System.out.println("지금까지의 차 생산량: " + Car.serialNumber);

		System.out.println("정적 getter로 불러온 차 생산량: " + Car.getNumber());
		System.out.println(c1.getNumber());
	}

}
