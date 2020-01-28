package j200128;

// 성적 처리 프로그램 작성
public class MethodEx {
	// 과목 점수
	static int kor = 89;
	static int eng = 78;
	static int mat = 56;

	/*
	 * 메소드 매개변수 작성 기준 멤버 변수로 선언: 매개 변수 필요X 멤버 변수X : 매개 변수 필요
	 */

	// 총점 계산 메소드
	static int calcSum() {
		int sum = kor + eng + mat;
		return sum;
	}

	// 메소드 오버로딩
	// 평균 계산 메소드, 과목 수 : 3개
	double calcAvg(int tot) {
		return (double) ((double) tot / 3);
	}

	// 평균 계산 메소드2, 과목 수를 매개변수로 입력 받음
	double calcAvg(int tot, int su) {
		return (double) (tot / 3);
	}

	// 등급 계산 메소드
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