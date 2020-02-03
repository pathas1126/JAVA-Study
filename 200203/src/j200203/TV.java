package j200203;

public class TV implements AdvanceVolume {
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
		System.out.println("TV ������ �������ϴ�.");
	}

	// 4. ���� ���� �޼ҵ� �������̵�
	public void turnOff() {
		System.out.println("TV ������ �������ϴ�.");
	}

	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.volumeUp(15);
		tv.volumeDown(17);
		tv.turnOff();
	}
}
