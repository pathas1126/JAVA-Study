package j200131;

// ���� ���� ���� ���(�Ű������� �ڷ���: �⺻ �ڷ��� 8����)
// ������ ���� �����ؼ� �ܴ��ϱ� ������ ������ ������ ����
public class CallByValue {

	static void changeColor(int r, int g, int b) {
		r += 10;
		g += 50;
		b += 10;
		System.out.println("changeColor_red: " + r + ", green: " + g + ", blue: " + b);
	}

	public static void main(String[] args) {

		// rgb(0~255) ������ ���� r, g, b �ʱ�ȭ
		int r = -1, g = -1, b = -1;
		System.out.println("before_red: " + r + ", green: " + g + ", blue: " + b);

		// r, g, b �� ���ڷ� �޾Ƽ� changeColor()
		// �޼ҵ��� ���� ���� r, g, b ������ �� ���
		// ���ڰ� ���޵� ���� ������ ���� �����ؼ� ������
		changeColor(r, g, b);

		// changeColor()�� r, g, b�� main()�� r, g, b�� �� ��, value�� ����ż�
        // ���޵Ǿ��� ������ main()�� r, g, b���� ������ ����
		System.out.println("after_red: " + r + ", green: " + g + ", blue: " + b);
	}

}
