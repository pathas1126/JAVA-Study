package j200120;

// 서로 연관이 있는 클래스는 한 폴더(=같은 패키지)에 저장
public class CarHandling {

	public static void main(String[] args) {
		// 1. 객체 생성 : 객체를 저장할 수 있는 공간을 만들어주는 것(4byte)
		// 형식) 클래스명 객체명 = new 클래스명();
		// Car morning; 객체 선언: 기억공간이 생성되지 않음
		Car morning = new Car(); // morning 저장 공간 생성, morning의 주소값이 저장됨
		System.out.println("morning: " + morning);
		// 패키지명.클래스명@주소값(16진수)

		// 2. 객체 변수에 값 저장 : 객체명.멤버변수 = 값
		morning.name = "모닝";
		morning.output = 1000;
		morning.color = "blue";
		morning.year = 2020;
		
		// 3. 메서드 호출 : 객체명.호출할 메서드명() or (~);
		morning.startEngine();
		// 시동!!
		morning.speedUp(150);
		morning.speedDown(60);
		
		morning.carInfoPrint();
	}

}
