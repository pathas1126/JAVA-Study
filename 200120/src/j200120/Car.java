package j200120;
//��Ű�� �̸��� �ҹ��ڷ� �ۼ�

// ����������� ������ class �����̱� ������ main()�Լ��� �������� �ʴ´�.
public class Car {
	String name; // �� �̸�
	int output; // ��ⷮ
	int year; // ���
	String color; // �� ����
	int current_speed; // ���� �ӵ�, int �ڷ����� �⺻ ���� 0
	boolean sidong = false; // �õ� / ����

	// 1. �� �õ� �ɱ� -> �ܼ��ϰ� �ݺ����� ���(�Ű����� X, ��ȯ�� X)
	void startEngine() {
		sidong = true; // ��� ���� �� ���� ����
		System.out.println("�õ�!!" + sidong);
	}

	// 2. �� �ӵ� ���� -> �Ű����� O ��ȯ�� X, �ӵ��� �Է� �޾Ƽ� ���, ����
	void speedUp(int speed) {
		current_speed += speed;
		System.out.println(speed + "km/h��ŭ �ӵ� ����!!");
	}

	// 3. �� �ӵ� ����
	void speedDown(int speed) {
		current_speed -= speed;
		System.out.println(speed + "km/h��ŭ �ӵ� ����!!");
	}

	// 4. �� ���� ���
	void carInfoPrint() {
		System.out.println("===���� ����===");
		System.out.println("�� �̸�: " + name);
		System.out.println("��ⷮ: " + output);
		System.out.println("����: " + color);
		System.out.println("���� �ӵ�: " + current_speed);
		System.out.println("�õ� ����: " + sidong);
	}

	// 5. ����
	void stop() {
		sidong = false;
		current_speed = 0;
		System.out.println("����!!");
	}

}