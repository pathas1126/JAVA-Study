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
		
		// ��ü�� �� �ٸ����� �������� ����ϴ� �޼ҵ��� ������ �����ϸ� �������� ��ɸ� �ٸ�
		// => ������
	}

}
