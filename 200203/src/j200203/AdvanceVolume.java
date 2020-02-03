package j200203;

// public interface 자식 인터페이스명 extends 부모 인터페이스명
public interface AdvanceVolume extends Volume {

	// 프로그램 실행
	public void turnOn();

	// 프로그램 종료
	public void turnOff();
}

// 프로그램 규모가 커지면 하나의 인터페이스에 모든 기능을 작성할 수 없기 때문에
// 여러 개의 인터페이스로 분할해서 기능별로 관리함