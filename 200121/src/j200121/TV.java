package j200121;
// 추상 클래스 연습

abstract class TV {
	// 1. 멤버변수: 클래스내부에 선언, 공통의 특성(속성, 상태)
	String Name; // 생성자 함수의 멤버변수

	String Maker; // 제조사
	String Model; // 모델명
	double Weight; // 무게
	String onOff="Off"; // 켜져있는지 확인

	// 2. 메서드(=함수)

	// 생성자 만들기_모델명 정하기
	public TV(String name) {
		Name = name;
	}
	// 생성자 함수에는void 작성 X

	// 모델 정하기
	public void setModel(String model) {
		Model = model;
	}

	// 무게 정하기
	public void setWeight(double weight) {
		Weight = weight;
	}
	
	// 켤 때 나는 소리 설정
	abstract public void setOnSound();

	// TV 켜기
	abstract public void setOn();

	// TV 끄기
	abstract public void setOff();

	// TV 정보 출력
	public void printInfo() {
		System.out.println("==========");
		System.out.println("모델명: " + Model);
		System.out.println("제조사: " + Name);
		System.out.println("무게: " + Weight);
		System.out.println("전원 상태: " + onOff);
	}
}

class SamSung extends TV {

	// 생성자 함수, 제조사 초기화
	public SamSung(String name) {
		super(name);
		// super : 부모클래스를 지칭하는 것이며, TV(name);과 같은 구문임
	}
	
	// 모델명 정하기
	public void setModel(String model) {
		Model = model;
	}

	// 무게 정하기
	public void setWeight(double weight) {
		Weight = weight;
	}

	// 소리 정하기
	public void setOnSound() {
		System.out.println("띠리링");
	}

	public void setOn() {
		// str.contentEquals(문자열) : str의 문자열과 매개변수의 문자열이100% 같다면 true를 반환
		if (onOff.contentEquals("Off")) {
			onOff = "On";
			// onOff 값이 "Off"와 같다면 onOff 값을 "On"으로 저장
			System.out.println("TV가 켜졌습니다.");
		} else {
			System.out.println("TV가 꺼진 상태입니다.");
		}
	}

	public void setOff() {
		// str.equals(문자열) : str의 문자열과 매개변수의 문자열이 같다면 true를 반환
		if (onOff.equals("On")) {
			onOff = "Off";
			System.out.println("TV가 꺼졌습니다.");
		} else {
			System.out.println("TV가 꺼진 상태입니다.");
		}
	}
}
