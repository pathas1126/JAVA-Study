package j200120;
//패키지 이름은 소문자로 작성

// 저장목적으로 생성한 class 파일이기 때문에 main()함수를 포함하지 않는다.
public class Car {
	String name; // 차 이름
	int output; // 배기량
	int year; // 년식
	String color; // 차 색깔
	int current_speed; // 현재 속도, int 자료형의 기본 값은 0
	boolean sidong = false; // 시동 / 주차

	// 1. 차 시동 걸기 -> 단순하고 반복적인 기능(매개변수 X, 반환값 X)
	void startEngine() {
		sidong = true; // 멤버 변수 값 저장 가능
		System.out.println("시동!!" + sidong);
	}

	// 2. 차 속도 증가 -> 매개변수 O 반환값 X, 속도를 입력 받아서 계산, 저장
	void speedUp(int speed) {
		current_speed += speed;
		System.out.println(speed + "km/h만큼 속도 증가!!");
	}

	// 3. 차 속도 감소
	void speedDown(int speed) {
		current_speed -= speed;
		System.out.println(speed + "km/h만큼 속도 감소!!");
	}

	// 4. 차 정보 출력
	void carInfoPrint() {
		System.out.println("===차의 정보===");
		System.out.println("차 이름: " + name);
		System.out.println("배기량: " + output);
		System.out.println("색깔: " + color);
		System.out.println("현재 속도: " + current_speed);
		System.out.println("시동 상태: " + sidong);
	}

	// 5. 주차
	void stop() {
		sidong = false;
		current_speed = 0;
		System.out.println("주차!!");
	}

}