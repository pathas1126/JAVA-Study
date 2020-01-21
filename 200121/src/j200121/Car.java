package j200121;

//추상화->새로운 자료형을 만들어내는 설계도(공통특성)
public class Car {

	// 공통특성(겉으로)->기본자료형 8가지를 이용(멤버변수(클래스 내부에 선언된 변수))
	private String name;// String irum (명사형)
	private int output;// 배기량
	private int year;// 년식
	private String color;// 차의 색깔
	// 현재 상태
	private int current_speed = 0;// 차의 속도
	// int ->1,0
	private boolean sidong = false;
	// 움직임을 표현X=>메서드(=자바스크립트 함수)

	// ----------setter method---------------
	public void setName(String n) {
		name = n;
	}

	// 배기량 설정 : 음수 X, 양수도 어느 정도 범위 내의 값만 허용
	public void setOutput(int o) {
		if (o <= 0 || o > 1500) {
			System.out.println("정확한 배기량 값을 입력해주세요!!");
			output = 1000; // 기본값 설정, 설정하지 않는 경우에 문자열은 null, 정수,실수형은 0이 저장됨
			return; // 반환값이 없는 경우 return은 탈출문으로 작동함
		}
		output = o;
	}

	public void setYear(int y) {
		if (y < 0 || y > 2020) {
			System.out.println("해당 값은 연도로 지정할 수 없습니다!!");
			year = 2020;
			return;
		}
		year = y;
	}

	public void setColor(String c) {
		color = c;
	}

	public void setCurrent_speed(int cu) {
		current_speed = cu;
	}

	public void setSidong(boolean si) {
		sidong = si;
	}

	// ----------------getter method----------------
	public String getName() {
		return name;
	}

	public int getOutput() {
		return output;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public int getCurrent_speed() {
		return current_speed;
	}

	public boolean getSidong() {
		return sidong;
	}

	// 1.차의 시동걸기->단순하고 반복적인일(매개변수 X, 반환값 X)
	void startEnginee() {
		sidong = true;// 멤버변수의 값을 저장이 가능하다.
		System.out.println("시동이 걸림!" + sidong);
	}

	// 2.차의 속도증가=>current_speed(외부에서 값을 전달)=>계산->변경=>저장
	void speedUp(int speed) {// 매개변수 O 반환값X ->속도를 입력받아서 내부적으로 계산,저장
		if (sidong == true) {
			if (speed >= 0) {
				if (current_speed + speed > 170) {
					System.out.println("더 이상 속도를 증가시킬 수 없습니다.");
					current_speed = 100;
				} else {
					current_speed += speed;// current_speed=current_speed+speed
					System.out.println(speed + "km만큼 속도가 증가되었습니다.");
					System.out.println("현재 속도: " + current_speed);
				}
			} else {
				System.out.println("감속은 불가합니다.");
			}
		} else {
			System.out.println("시동을 먼저 걸어주세요!!");
		}
	}

	// 3.차의 속도감소
	void speedDown(int speed) {
		if (sidong) {
			if (current_speed + speed < 0) {
				System.out.println("더 이상 감속할 수 없습니다!!");
			} else {
				current_speed -= speed;// current_speed=current_speed-speed
				System.out.println(speed + "km만큼 속도가 감소되었습니다.");
			}
		} else {
			System.out.println("시동이 꺼져있는 상태입니다.");
		}
	}

	// 4.차의 정보출력->면허증 제출(단순,반복적인일)
	void carInfoPrint() {// 매개변수 X ,반환값 X
		System.out.println("===차의 정보===");
		System.out.println("차의 이름=" + name);
		System.out.println("차의 배기량=" + output);
		System.out.println("차의 색깔=" + color);
		System.out.println("차의 속도=" + current_speed);
		System.out.println("차의 시동유무=" + sidong);
		System.out.println("차의 년식= " + year);
	}

	// 5.주차->단순하고 반복적인일
	void stop() {
		sidong = false;// 시동이 꺼짐
		current_speed = 0;// 계기판은 0
		System.out.println("정상적으로 주차가 완료되었습니다.");
	}
}
