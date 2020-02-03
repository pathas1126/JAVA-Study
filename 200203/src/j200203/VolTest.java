package j200203;

public class VolTest {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.volumeUp(3);
		tv.volumeDown(5);
		tv.turnOff();
		
		System.out.println("=======================");
		
		Radio rd = new Radio();
		rd.turnOn();
		rd.volumeUp(5);
		rd.volumeDown(20);
		rd.turnOff();
		
		// 객체는 다 다르지만 공통으로 사용하는 메소드의 형식은 동일하며 세부적인 기능만 다름
		// => 다형성
	}

}
