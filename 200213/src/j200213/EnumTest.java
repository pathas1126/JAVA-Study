package j200213;

public class EnumTest {

	public static final int SUN = 0;
	public static final int MON = 1;
	public static final int TUE = 2;

	public static void main(String[] args) {
		int su1, su2, su3, su4;
		su1 = SUN;
		su2 = MON;
		System.out.println("su1: " + su1 + ", su2: " + su2);

		su3 = MON;
		su4 = MON;
		System.out.println("su3: " + su3 + ", su4: " + su4);

		System.out.println("=====�ܺ� ������ ���=====");
		System.out.println("Day.SUN: " + Day.SUN);
		System.out.println("Day.SUN.ordinal(): "+ Day.SUN.ordinal());
		
		// ������ ���� ����
		Day d= Day.SUN;
		su3 = Day.SUN.ordinal();
		
		switch(d) {
		case SUN: System.out.println("�Ͽ���");break;
		}
		
	}

}
