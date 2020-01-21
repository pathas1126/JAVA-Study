package j200121;

//설계도역할(Car)=>자동차를 생산
//서로 연관이 있는 클래스는 한 폴더(=같은 패키지)에 같이 저장
public class CarHandling {

	public static void main(String[] args) {

		// 1.자동차 조립(=객체)생성
		// 객체생성=>객체(저장할 대상자)를 저장할 수 있는 공간을 만들어주는것.(4byte)
		// 형식) 설계도이름(=클래스이름) 객체명(=변수)=new 클래스명();
		int age;// 4byte 기억공간이 생성
		// Car morning;//객체선언(기억공간이 아직 생성이 안된상태)
		Car morning = new Car();// morning이 저장할 공간이 하나 생성->4byte
		// j200120.Car@15db9742=>패키지명.클래스명@16진수
		// 서울시 ~구 ~아파트 302호
		System.out.println("morning의 값=>" + morning);

		// 2.객체명.멤버변수=값=>자동차 공장
		/*
		 * 멤버변수 private 처리 전 코드 morning.name="모닝"; morning.output=1000;
		 * morning.color="blue"; morning.year=2020;
		 */

		// 캡슐화 적용
		morning.setName("모닝"); // setName 메소드를 호출하면서 "모닝" 매개변수를 전달
		morning.setOutput(1800);
		morning.setYear(2020);
		morning.setColor("Blue");
		morning.setCurrent_speed(0);
		morning.setSidong(true);

		// 3.운전->시동걸기=>차의 속도증가(메서드 호출)=>객체명.호출할 메서드명() Or (~)
//		morning.startEnginee();
		morning.stop();
		morning.speedUp(200);// 매개변수=>메서드가 처리해야할 값들
		morning.speedDown(60);// 150-60=90

		System.out.println("==========");
		System.out.println("차 이름: " + morning.getName());
		System.out.println("배기량: " + morning.getOutput());
		System.out.println("연식: " + morning.getYear());
		System.out.println("======================");

		morning.carInfoPrint();// 업무지시내림=>메서드 호출
	}

}
