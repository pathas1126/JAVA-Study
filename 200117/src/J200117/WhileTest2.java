package J200117;

public class WhileTest2 {
	public static void main(String[] args) {
		// while문, if문 활용
		int start = 11;
		int end = 10;
		
		// start가 end보다 작으면 while문을 실행하고, 그렇지 않다면 알림메시지 표시
		if (start <= end) {
			while (start <= end) {
				System.out.println("while문 연습" + start);
				start++;
			}
			System.out.println("while문 종료");
		} else {
			System.out.println("start값은 end값보다 클 수 없습니다!");
		}
	}
}
