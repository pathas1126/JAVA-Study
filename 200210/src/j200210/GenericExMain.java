package j200210;

public class GenericExMain {

	public static void main(String[] args) {
		// GenericEx Ŭ���� ��ü ����, String �ڷ����� ó���ϴ� ��ü ����
		GenericEx<String> geStr = new GenericEx();

		// geStr ��ü���� �޼ҵ� ȣ��
		geStr.setV("ȫ�浿", "�̼���", "�������");
		geStr.getV();

		// Double���� ó���ϴ� ��ü ����
		GenericEx<Double> geDbl = new GenericEx();
		geDbl.setV(1.2, 2.4, 3.5, 4.1, 5.8);
		geDbl.getV();

		// Integer���� ó���ϴ� ��ü ����
		GenericEx<Integer> geInt = new GenericEx();
		geInt.setV(1, 2, 3, 4, 5);
		geInt.getV();
	}

}
