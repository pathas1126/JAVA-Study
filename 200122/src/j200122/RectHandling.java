package j200122;

public class RectHandling {

	public static void main(String[] args) {

		// rect ��ü ����
		Rect rect = new Rect();

		// 0 �Ǵ� ���� ���� ����� �� ����
		rect.setWidth(-12.42);
		rect.setHeight(0);

		// set() �޼ҵ�� ����, ���� ����
		rect.setWidth(10.25);
		rect.setHeight(20.22);
		rect.setSquare();

		// get() �޼ҵ�� ����, ���� ���
		System.out.println("����: " + rect.getWidth());
		System.out.println("����: " + rect.getHeight());

		// ���� ���
		rect.print();

	}

}
