package j200204;

public class Outer {
	// ��� ����
	int a;

	// ������
	public Outer() {
		// ��� ���� �ʱ�ȭ
		a = 10;
	}

	public void aa() {
		System.out.println("aa �޼ҵ� ȣ��");
		Inner in = new Inner();
		in.cc();
	}

	public void bb() {
		System.out.println("bb �޼ҵ� ȣ��");
	}

	// ========= Inner Class =========
	public class Inner {
		// ���� Ŭ���� ��� ����
		int ax;

		// ���� Ŭ���� ������
		public Inner() {
			ax = 15;
		}

		// ���� Ŭ���� �޼ҵ�
		public void cc() {
			System.out.println("���� Ŭ���� cc �޼ҵ� ȣ��");
			System.out.println("�ܺ� a: " + a + ", ���� ax: " + ax);
			bb();
		}
	}

	public static void main(String[] args) {
		// Outer Ŭ���� ��ü ����
		Outer out = new Outer();
		// main()���� Inner Ŭ���� ����
		// ����) OuterŬ������.InnerŬ������ Inner��ü�� = Outer��ü��.new InnerŬ������();
		Outer.Inner oi = out.new Inner();
		System.out.println("==���� Ŭ���� ��� ����==");
		System.out.println("ax: " + oi.ax);
		System.out.println("====�޼ҵ� ȣ��====");
		out.aa();

	}

}
