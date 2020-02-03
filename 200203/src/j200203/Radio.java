package j200203;

public class Radio implements AdvanceVolume {
	// ��� ����: �⺻ ���� ����
	private int volLevel;

	// 1. ���� ���� �޼ҵ� �������̵�
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("������ " + level + "��ŭ �����߽��ϴ�.");
		System.out.println("���� ����: " + volLevel);
	}

	// 2. ���� ���� �޼ҵ� �������̵�
	public void volumeDown(int level) {
		if (volLevel - level < 0) {
			System.out.println("������ ũ��� 0���� ���� �� �����ϴ�!");
			System.out.println("���� ����: " + volLevel);
		}

		else {
			volLevel -= level;
			System.out.println("������ " + level + "��ŭ �����߽��ϴ�.");
			System.out.println("���� ����: " + volLevel);
		}
	}

	// 3. ���� �ѱ� �޼ҵ� �������̵�
	public void turnOn() {
		// ������ ���� �� �⺻ ������ 10���� ����
		volLevel = 10;
		System.out.println("Radio ������ �������ϴ�.");
	}

	// 4. ���� ���� �޼ҵ� �������̵�
	public void turnOff() {
		System.out.println("Radio ������ �������ϴ�.");
	}

	public static void main(String[] args) {
		Radio rd = new Radio();
		rd.turnOn();
		rd.volumeUp(10);
		rd.volumeDown(13);
		rd.turnOff();
	}
}
