package j200121;

//�߻�ȭ->���ο� �ڷ����� ������ ���赵(����Ư��)
public class Car {

	// ����Ư��(������)->�⺻�ڷ��� 8������ �̿�(�������(Ŭ���� ���ο� ����� ����))
	private String name;// String irum (�����)
	private int output;// ��ⷮ
	private int year;// ���
	private String color;// ���� ����
	// ���� ����
	private int current_speed = 0;// ���� �ӵ�
	// int ->1,0
	private boolean sidong = false;
	// �������� ǥ��X=>�޼���(=�ڹٽ�ũ��Ʈ �Լ�)

	// ----------setter method---------------
	public void setName(String n) {
		name = n;
	}

	// ��ⷮ ���� : ���� X, ����� ��� ���� ���� ���� ���� ���
	public void setOutput(int o) {
		if (o <= 0 || o > 1500) {
			System.out.println("��Ȯ�� ��ⷮ ���� �Է����ּ���!!");
			output = 1000; // �⺻�� ����, �������� �ʴ� ��쿡 ���ڿ��� null, ����,�Ǽ����� 0�� �����
			return; // ��ȯ���� ���� ��� return�� Ż�⹮���� �۵���
		}
		output = o;
	}

	public void setYear(int y) {
		if (y < 0 || y > 2020) {
			System.out.println("�ش� ���� ������ ������ �� �����ϴ�!!");
			year = 2020;
			return;
		}
		year = y;
	}

	public void setColor(String c) {
		color = c;
	}

	public void setCurrent_speed(int cu) {
		current_speed = cu;
	}

	public void setSidong(boolean si) {
		sidong = si;
	}

	// ----------------getter method----------------
	public String getName() {
		return name;
	}

	public int getOutput() {
		return output;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public int getCurrent_speed() {
		return current_speed;
	}

	public boolean getSidong() {
		return sidong;
	}

	// 1.���� �õ��ɱ�->�ܼ��ϰ� �ݺ�������(�Ű����� X, ��ȯ�� X)
	void startEnginee() {
		sidong = true;// ��������� ���� ������ �����ϴ�.
		System.out.println("�õ��� �ɸ�!" + sidong);
	}

	// 2.���� �ӵ�����=>current_speed(�ܺο��� ���� ����)=>���->����=>����
	void speedUp(int speed) {// �Ű����� O ��ȯ��X ->�ӵ��� �Է¹޾Ƽ� ���������� ���,����
		if (sidong == true) {
			if (speed >= 0) {
				if (current_speed + speed > 170) {
					System.out.println("�� �̻� �ӵ��� ������ų �� �����ϴ�.");
					current_speed = 100;
				} else {
					current_speed += speed;// current_speed=current_speed+speed
					System.out.println(speed + "km��ŭ �ӵ��� �����Ǿ����ϴ�.");
					System.out.println("���� �ӵ�: " + current_speed);
				}
			} else {
				System.out.println("������ �Ұ��մϴ�.");
			}
		} else {
			System.out.println("�õ��� ���� �ɾ��ּ���!!");
		}
	}

	// 3.���� �ӵ�����
	void speedDown(int speed) {
		if (sidong) {
			if (current_speed + speed < 0) {
				System.out.println("�� �̻� ������ �� �����ϴ�!!");
			} else {
				current_speed -= speed;// current_speed=current_speed-speed
				System.out.println(speed + "km��ŭ �ӵ��� ���ҵǾ����ϴ�.");
			}
		} else {
			System.out.println("�õ��� �����ִ� �����Դϴ�.");
		}
	}

	// 4.���� �������->������ ����(�ܼ�,�ݺ�������)
	void carInfoPrint() {// �Ű����� X ,��ȯ�� X
		System.out.println("===���� ����===");
		System.out.println("���� �̸�=" + name);
		System.out.println("���� ��ⷮ=" + output);
		System.out.println("���� ����=" + color);
		System.out.println("���� �ӵ�=" + current_speed);
		System.out.println("���� �õ�����=" + sidong);
		System.out.println("���� ���= " + year);
	}

	// 5.����->�ܼ��ϰ� �ݺ�������
	void stop() {
		sidong = false;// �õ��� ����
		current_speed = 0;// ������� 0
		System.out.println("���������� ������ �Ϸ�Ǿ����ϴ�.");
	}
}
