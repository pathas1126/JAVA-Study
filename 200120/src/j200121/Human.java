package j200121;

public class Human {
	
	// ������� ����
	String name;
	double height;
	double weight;
	char gender;
	
	// ����޼ҵ� ����
	// ��ħ: �Ű�����X, ��ȯ��X
	void sleep() {
		System.out.println(name+"�� �ῡ ������ϴ�.");
	}
	// ����: �Ű�����O, ��ȯ��X
	void grow(double inputHeight, double inputWeight) {
		height+=inputHeight;
		System.out.println(inputHeight+"��ŭ �ڶ����ϴ�. ���� Ű��: "+height);
		weight+=inputWeight;
		System.out.println(inputWeight+"��ŭ ���� �Ƚ��ϴ�. ���� �����Դ�: "+weight);
	}
	// ���� ��� �޼���
	void humanInfo() {
		System.out.println("==========");
		System.out.println("�̸�: "+name);
		System.out.println("Ű: "+height);
		System.out.println("������: "+weight);
		System.out.println("����: "+gender);
	}
		
	public static void main(String[] args) {
		// ��ü ����
		Human duckbae = new Human();
		duckbae.name="����";
		duckbae.height=172.22;
		duckbae.weight=55.25;
		duckbae.gender='M';
		
		duckbae.sleep();
		duckbae.grow(2.12, 3.55);
		duckbae.humanInfo();
	}
}
