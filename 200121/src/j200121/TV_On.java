package j200121;

public class TV_On {

	public static void main(String[] args) {
		SamSung ss = new SamSung("samsung");
		
		ss.setModel("SS-t223");
		ss.setWeight(12.24);
		
		// �߻�Ŭ������ �޼��带 SamSung Ŭ�������� �������̵��� �Լ�
		ss.setOff();
		ss.setOn();
		ss.setOnSound();
		
		// �߻�Ŭ�������� ������ �޼��� ���
		ss.printInfo();
	}

}
