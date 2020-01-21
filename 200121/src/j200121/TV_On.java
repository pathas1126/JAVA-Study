package j200121;

public class TV_On {

	public static void main(String[] args) {
		SamSung ss = new SamSung("samsung");
		
		ss.setModel("SS-t223");
		ss.setWeight(12.24);
		
		// 추상클래스의 메서드를 SamSung 클래스에서 오버라이드한 함수
		ss.setOff();
		ss.setOn();
		ss.setOnSound();
		
		// 추상클래스에서 정의한 메서드 사용
		ss.printInfo();
	}

}
