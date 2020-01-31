package j200131;

// 클래스 자료형 생성, 반환 연습
// Class가 Type이라는 것을 이해하는 것이 가장 중요함

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 오늘 날짜 출력: java.util.Date, Calendar 클래스 사용, 요즘에는 Calendar를 많이 사용 

public class SimpleTest2 {

// 1. SimpleDateFormat 클래스 객체 생성 메소드, getter
	public static SimpleDateFormat getSimple() {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년-MM월-DD일 HH:mm:ss a");
		return sdf;
	}

// 2. SimpleDateFormat 클래스 객체를 전달받아서 특정 기능 수행, setter
	public static void setSimple(SimpleDateFormat sdf, Date d) {
		System.out.println("지금 시간: " + sdf.format(d));
	}

	public static void main(String[] args) {

		Date d = new Date();

		SimpleDateFormat sdf = getSimple();

		setSimple(sdf, d);

	}
}
