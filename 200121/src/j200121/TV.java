package j200121;
// �߻� Ŭ���� ����

abstract class TV {
	// 1. �������: Ŭ�������ο� ����, ������ Ư��(�Ӽ�, ����)
	String Name; // ������ �Լ��� �������

	String Maker; // ������
	String Model; // �𵨸�
	double Weight; // ����
	String onOff="Off"; // �����ִ��� Ȯ��

	// 2. �޼���(=�Լ�)

	// ������ �����_�𵨸� ���ϱ�
	public TV(String name) {
		Name = name;
	}
	// ������ �Լ�����void �ۼ� X

	// �� ���ϱ�
	public void setModel(String model) {
		Model = model;
	}

	// ���� ���ϱ�
	public void setWeight(double weight) {
		Weight = weight;
	}
	
	// �� �� ���� �Ҹ� ����
	abstract public void setOnSound();

	// TV �ѱ�
	abstract public void setOn();

	// TV ����
	abstract public void setOff();

	// TV ���� ���
	public void printInfo() {
		System.out.println("==========");
		System.out.println("�𵨸�: " + Model);
		System.out.println("������: " + Name);
		System.out.println("����: " + Weight);
		System.out.println("���� ����: " + onOff);
	}
}

class SamSung extends TV {

	// ������ �Լ�, ������ �ʱ�ȭ
	public SamSung(String name) {
		super(name);
		// super : �θ�Ŭ������ ��Ī�ϴ� ���̸�, TV(name);�� ���� ������
	}
	
	// �𵨸� ���ϱ�
	public void setModel(String model) {
		Model = model;
	}

	// ���� ���ϱ�
	public void setWeight(double weight) {
		Weight = weight;
	}

	// �Ҹ� ���ϱ�
	public void setOnSound() {
		System.out.println("�츮��");
	}

	public void setOn() {
		// str.contentEquals(���ڿ�) : str�� ���ڿ��� �Ű������� ���ڿ���100% ���ٸ� true�� ��ȯ
		if (onOff.contentEquals("Off")) {
			onOff = "On";
			// onOff ���� "Off"�� ���ٸ� onOff ���� "On"���� ����
			System.out.println("TV�� �������ϴ�.");
		} else {
			System.out.println("TV�� ���� �����Դϴ�.");
		}
	}

	public void setOff() {
		// str.equals(���ڿ�) : str�� ���ڿ��� �Ű������� ���ڿ��� ���ٸ� true�� ��ȯ
		if (onOff.equals("On")) {
			onOff = "Off";
			System.out.println("TV�� �������ϴ�.");
		} else {
			System.out.println("TV�� ���� �����Դϴ�.");
		}
	}
}
