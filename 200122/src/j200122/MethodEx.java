package j200122;

// 성적 처리 프로그램 작성
public class MethodEx {
	// 과목 점수
	int kor = 89;
	int eng = 78;
	int mat = 56;

	/*
	 * 메소드 매개변수 작성 기준 멤버 변수로 선언: 매개 변수 필요X 멤버 변수X : 매개 변수 필요
	 */

	// 총점 계산 메소드
	int calcSum(int kor, int eng, int mat) {
		int sum = kor + eng + mat;
		return sum;
	}
	
	
	// 메소드 오버로딩
	// 평균 계산 메소드, 과목 수 : 3개
	double calcAvg(int tot) {
		return (double) (tot / 3);
	}
	
	// 평균 계산 메소드2, 과목 수를 매개변수로 입력 받음
	double calcAvg(int tot, int su) {
		return (double) (tot / 3);
	}

	public static void main(String[] args) {
		int kor = 89;
		int eng = 78;
		int mat = 56;

	}

}
