package j200131;

// Static Ȱ�� ����

class Car {
	String color;
	String model;
	String owner;
	// ���� �𵨰� ������� �Ǹŷ��� �հ踸 �����ϰ��� �ϴ� ����
	// Static ����: ��� �ν��Ͻ����� �����ϰ��� �ϴ� ����
	static int serialNumber;

	// ������, [Source] �� -> [Generate Constructor using Fields...] �ǿ��� ������ �ڵ� ���� ����
	public Car(String color, String model, String owner) {
		this.color = color;
		this.model = model;
		this.owner = owner;
		serialNumber++; // �𵨿� ������� �������� serialNumber�� ���� 1�� �ö�
	}

	// setter, getter
	// [Source] �� -> [Generate Getters and Setters...] �ǿ��� setter, getter �ڵ� ���� ����

	// �� ���귮�� ��ȯ�ϴ� static getter
	public static int getNumber() {
		return serialNumber;
	}

	// =================== java ���� ���� =====================
	// ��� ����(=�ν��Ͻ� ����) : Ŭ���� ���ο� ����� �� ��ü���� �����ϴ� ����,
	// �Ϲ� �޼ҵ忡���� �ҷ��� ����� �� ����
	// ���� ����(=Ŭ���� ����): ��� ��ü�� ������ �� �ִ� ����, ���α׷��� �۵��ϴ� ���� �޸𸮿� ����
	// �Ϲ� �޼ҵ�� ���� �޼ҵ� ��ο��� �ҷ��� ��� ����
	// ���� ����: �޼ҵ� �Ű����� �� �޼ҵ� ���ο� ����� ����, ���ÿ� ����

}

public class CarFactory {

	public static void main(String[] args) {
		// Car Ŭ���� ��ü ����
		Car c1 = new Car("Red", "SM5", "test-1");
		System.out.println("���ݱ����� �� ���귮: " + Car.serialNumber);

		Car c2 = new Car("Blue", "Sonata", "test-2");
		System.out.println("���ݱ����� �� ���귮: " + Car.serialNumber);

		Car c3 = new Car("Orange", "Martiz", "test-3");
		System.out.println("���ݱ����� �� ���귮: " + Car.serialNumber);

		System.out.println("���� getter�� �ҷ��� �� ���귮: " + Car.getNumber());
		System.out.println(c1.getNumber());
	}

}
