package J200117;

public class WhileTest2 {
	public static void main(String[] args) {
		// while��, if�� Ȱ��
		int start = 11;
		int end = 10;
		
		// start�� end���� ������ while���� �����ϰ�, �׷��� �ʴٸ� �˸��޽��� ǥ��
		if (start <= end) {
			while (start <= end) {
				System.out.println("while�� ����" + start);
				start++;
			}
			System.out.println("while�� ����");
		} else {
			System.out.println("start���� end������ Ŭ �� �����ϴ�!");
		}
	}
}
