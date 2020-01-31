package j200131;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// ���� ��¥ ���: java.util.Date, Calendar Ŭ���� ���, ���򿡴� Calendar�� ���� ��� 

public class SimpleTest {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println("d: " + d.toString());
		// d: Fri Jan 31 15:33:08 KST 2020

		// �츮������ ��¥ ���Ŀ� �°� ���
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY��-MM��-DD�� HH:mm:ss a");
		System.out.println("sdf.format(d): " + sdf.format(d));

		// Calendar, getInstance()�� ��ȯ������ ���� ��ü�� Calendar �ڷ����� cal ������ ����
		Calendar cal = Calendar.getInstance();
		System.out.println("cal: " + cal);

	}
}
