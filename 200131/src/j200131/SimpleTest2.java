package j200131;

// Ŭ���� �ڷ��� ����, ��ȯ ����
// Class�� Type�̶�� ���� �����ϴ� ���� ���� �߿���

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// ���� ��¥ ���: java.util.Date, Calendar Ŭ���� ���, ���򿡴� Calendar�� ���� ��� 

public class SimpleTest2 {

// 1. SimpleDateFormat Ŭ���� ��ü ���� �޼ҵ�, getter
	public static SimpleDateFormat getSimple() {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY��-MM��-DD�� HH:mm:ss a");
		return sdf;
	}

// 2. SimpleDateFormat Ŭ���� ��ü�� ���޹޾Ƽ� Ư�� ��� ����, setter
	public static void setSimple(SimpleDateFormat sdf, Date d) {
		System.out.println("���� �ð�: " + sdf.format(d));
	}

	public static void main(String[] args) {

		Date d = new Date();

		SimpleDateFormat sdf = getSimple();

		setSimple(sdf, d);

	}
}
