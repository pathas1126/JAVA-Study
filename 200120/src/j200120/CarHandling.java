package j200120;

// ���� ������ �ִ� Ŭ������ �� ����(=���� ��Ű��)�� ����
public class CarHandling {

	public static void main(String[] args) {
		// 1. ��ü ���� : ��ü�� ������ �� �ִ� ������ ������ִ� ��(4byte)
		// ����) Ŭ������ ��ü�� = new Ŭ������();
		// Car morning; ��ü ����: �������� �������� ����
		Car morning = new Car(); // morning ���� ���� ����, morning�� �ּҰ��� �����
		System.out.println("morning: " + morning);
		// ��Ű����.Ŭ������@�ּҰ�(16����)

		// 2. ��ü ������ �� ���� : ��ü��.������� = ��
		morning.name = "���";
		morning.output = 1000;
		morning.color = "blue";
		morning.year = 2020;
		
		// 3. �޼��� ȣ�� : ��ü��.ȣ���� �޼����() or (~);
		morning.startEngine();
		// �õ�!!
		morning.speedUp(150);
		morning.speedDown(60);
		
		morning.carInfoPrint();
	}

}
