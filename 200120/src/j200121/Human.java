package j200121;

public class Human {
	
	// 멤버변수 정의
	String name;
	double height;
	double weight;
	char gender;
	
	// 멤버메소드 정의
	// 취침: 매개변수X, 반환값X
	void sleep() {
		System.out.println(name+"가 잠에 들었습니다.");
	}
	// 성장: 매개변수O, 반환값X
	void grow(double inputHeight, double inputWeight) {
		height+=inputHeight;
		System.out.println(inputHeight+"만큼 자랐습니다. 현재 키는: "+height);
		weight+=inputWeight;
		System.out.println(inputWeight+"만큼 살이 쪘습니다. 현재 몸무게는: "+weight);
	}
	// 정보 출력 메서드
	void humanInfo() {
		System.out.println("==========");
		System.out.println("이름: "+name);
		System.out.println("키: "+height);
		System.out.println("몸무게: "+weight);
		System.out.println("성별: "+gender);
	}
		
	public static void main(String[] args) {
		// 객체 생성
		Human duckbae = new Human();
		duckbae.name="덕배";
		duckbae.height=172.22;
		duckbae.weight=55.25;
		duckbae.gender='M';
		
		duckbae.sleep();
		duckbae.grow(2.12, 3.55);
		duckbae.humanInfo();
	}
}
