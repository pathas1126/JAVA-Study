package j200203;

// Date 클래스 import, 같은 패키지의 여러 클래스를 불러올 때는 * 사용
import java.util.Date;

public class GetDate {

	public Date getDate() {
		Date d = new Date();
		return d;
		// 익명객체: return new Date(); 로도 작성 가능
	}

	public void setDate(Date nd) {
		System.out.println("현재 시간: " + nd);
	}

	public static void main(String[] args) {
		GetDate gd = new GetDate(); // 객체 생성: 메소드 호출 목적
		Date nd = gd.getDate();
		gd.setDate(nd);
	}

}
