package j200122;

public class ThisTest {

	private int a = 100;

	// set()�� public�� �ۼ��ϴ� ���� : �ٸ� Ŭ�������� set()�� ������ �� �ֵ��� �ϱ� ����
	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.setA(2);
		int get = tt.getA();
		System.out.println(get);

		ThisTest tt2 = new ThisTest();
		tt2.setA(120);
		int get2 = tt2.getA();
		System.out.println(get2);
	}

}
