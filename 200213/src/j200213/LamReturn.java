package j200213;

@FunctionalInterface
interface Return {
	int plus(int x, int y);
}

public class LamReturn {

	public static void main(String[] args) {

		// Return �������̽��� ��ü �ʱ�ȭ
		Return rt = returnRT();
		
		// Return ��ü�� �޼ҵ� ȣ�� �� ��� ����
		int result = rt.plus(5, 4);
		
		// ��� ���
		System.out.println(result);	// 9
	}

	// Return �������̽� ��ü ��ȯ �޼ҵ�
	public static Return returnRT() {
		/*
		Return rt = (x, y) -> x + y;
		return rt;
		*/
		// ��ȯ ���� ���ٽ� ����
		return (x, y) -> x + y;
	}
}
