package j200122;

// ���� ó�� ���α׷� �ۼ�
public class MethodEx {
	// ���� ����
	int kor = 89;
	int eng = 78;
	int mat = 56;

	/*
	 * �޼ҵ� �Ű����� �ۼ� ���� ��� ������ ����: �Ű� ���� �ʿ�X ��� ����X : �Ű� ���� �ʿ�
	 */

	// ���� ��� �޼ҵ�
	int calcSum(int kor, int eng, int mat) {
		int sum = kor + eng + mat;
		return sum;
	}
	
	
	// �޼ҵ� �����ε�
	// ��� ��� �޼ҵ�, ���� �� : 3��
	double calcAvg(int tot) {
		return (double) (tot / 3);
	}
	
	// ��� ��� �޼ҵ�2, ���� ���� �Ű������� �Է� ����
	double calcAvg(int tot, int su) {
		return (double) (tot / 3);
	}

	public static void main(String[] args) {
		int kor = 89;
		int eng = 78;
		int mat = 56;

	}

}
