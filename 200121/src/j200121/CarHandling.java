package j200121;

//���赵����(Car)=>�ڵ����� ����
//���� ������ �ִ� Ŭ������ �� ����(=���� ��Ű��)�� ���� ����
public class CarHandling {

	public static void main(String[] args) {

		// 1.�ڵ��� ����(=��ü)����
		// ��ü����=>��ü(������ �����)�� ������ �� �ִ� ������ ������ִ°�.(4byte)
		// ����) ���赵�̸�(=Ŭ�����̸�) ��ü��(=����)=new Ŭ������();
		int age;// 4byte �������� ����
		// Car morning;//��ü����(�������� ���� ������ �ȵȻ���)
		Car morning = new Car();// morning�� ������ ������ �ϳ� ����->4byte
		// j200120.Car@15db9742=>��Ű����.Ŭ������@16����
		// ����� ~�� ~����Ʈ 302ȣ
		System.out.println("morning�� ��=>" + morning);

		// 2.��ü��.�������=��=>�ڵ��� ����
		/*
		 * ������� private ó�� �� �ڵ� morning.name="���"; morning.output=1000;
		 * morning.color="blue"; morning.year=2020;
		 */

		// ĸ��ȭ ����
		morning.setName("���"); // setName �޼ҵ带 ȣ���ϸ鼭 "���" �Ű������� ����
		morning.setOutput(1800);
		morning.setYear(2020);
		morning.setColor("Blue");
		morning.setCurrent_speed(0);
		morning.setSidong(true);

		// 3.����->�õ��ɱ�=>���� �ӵ�����(�޼��� ȣ��)=>��ü��.ȣ���� �޼����() Or (~)
//		morning.startEnginee();
		morning.stop();
		morning.speedUp(200);// �Ű�����=>�޼��尡 ó���ؾ��� ����
		morning.speedDown(60);// 150-60=90

		System.out.println("==========");
		System.out.println("�� �̸�: " + morning.getName());
		System.out.println("��ⷮ: " + morning.getOutput());
		System.out.println("����: " + morning.getYear());
		System.out.println("======================");

		morning.carInfoPrint();// �������ó���=>�޼��� ȣ��
	}

}
