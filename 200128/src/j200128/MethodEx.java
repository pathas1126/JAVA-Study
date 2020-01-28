package j200128;

// ���� ó�� ���α׷� �ۼ�
public class MethodEx {
	// ���� ����
	static int kor = 89;
	static int eng = 78;
	static int mat = 56;

	/*
	 * �޼ҵ� �Ű����� �ۼ� ���� ��� ������ ����: �Ű� ���� �ʿ�X ��� ����X : �Ű� ���� �ʿ�
	 */

	// ���� ��� �޼ҵ�
	static int calcSum() {
		int sum = kor + eng + mat;
		return sum;
	}

	// �޼ҵ� �����ε�
	// ��� ��� �޼ҵ�, ���� �� : 3��
	double calcAvg(int tot) {
		return (double) ((double) tot / 3);
	}

	// ��� ��� �޼ҵ�2, ���� ���� �Ű������� �Է� ����
	double calcAvg(int tot, int su) {
		return (double) (tot / 3);
	}

	// ��� ��� �޼ҵ�
	char calcGrade(double avg) {
		if (avg <= 100 && avg >= 90) {
			return 'A';
		} else if (avg < 90 && avg >= 80) {
			return 'B';
		} else {
			return 'C';
		}
	}

	public static void main(String[] args) {

		int result = MethodEx.calcSum();
		System.out.println(result);

		MethodEx me = new MethodEx();
		double avgResult1 = me.calcAvg(result);
		System.out.println(avgResult1);

		double avgResult2 = me.calcAvg(result, 3);
		System.out.println(avgResult2);

		char grade = me.calcGrade(avgResult1);
		System.out.println(grade);
	}

}