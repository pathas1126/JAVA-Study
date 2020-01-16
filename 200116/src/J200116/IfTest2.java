package J200116;

public class IfTest2 {

	public static void main(String[] args) {
		// 중첩 If문
		// 1~100까지의 수를 입력받는다는 조건 하에 홀수, 짝수 판별
		// 1~100 범위에 들지 않는 숫자 -> "숫자는 1~100 안에서 입력해 주세요!!"
		int su = 111;
		if ((1 <= su) && (su <= 100)) {
			if (su % 2 == 1) {
				System.out.println(su + "은(는) 홀수입니다.");
			} else {
				System.out.println(su + "은(는) 짝수입니다.");
			}
		} else {
			System.out.println("숫자는 1~100 안에서 입력해 주세요!!");
		}
	}
}
