package J200117;

public class SwitchTest3 {
	public static void main(String[] args) {
		String day="10"; // 문자열 상수
		// case에 문자열 값 사용하기
		switch (day) {
		case "10":
			System.out.println("10을 선택");
			break;
		case "20": case "30": case "40": case "50": case "60":
			System.out.println("선택한 문자열은 20~60중 하나 입니다");
			}
	}
}
