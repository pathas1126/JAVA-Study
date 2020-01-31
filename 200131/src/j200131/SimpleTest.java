package j200131;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 오늘 날짜 출력: java.util.Date, Calendar 클래스 사용, 요즘에는 Calendar를 많이 사용 

public class SimpleTest {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println("d: " + d.toString());
		// d: Fri Jan 31 15:33:08 KST 2020

		// 우리나라의 날짜 형식에 맞게 출력
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년-MM월-DD일 HH:mm:ss a");
		System.out.println("sdf.format(d): " + sdf.format(d));

		// Calendar, getInstance()의 반환형으로 얻어온 객체를 Calendar 자료형의 cal 변수에 저장
		Calendar cal = Calendar.getInstance();
		System.out.println("cal: " + cal);

	}
}
