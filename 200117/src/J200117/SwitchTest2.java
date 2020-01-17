package J200117;

public class SwitchTest2 {
	public static void main(String[] args) {
		int su=15;
		//1~10 짝수 홀수 판별하기
		switch(su) {
		case 2: case 4:
		case 6: case 8:
		case 10:
			System.out.println("su는 짝수입니다.");
			break;
		case 1: case 3: case 5: case 7: case 9:
			System.out.println("su는 홀수입니다.");
			break;
		default : System.out.println("숫자는 1~10 범위 내에서 선택해주세요!!");
		}
	}
}
