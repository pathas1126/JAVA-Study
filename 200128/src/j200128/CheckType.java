package j200128;

public class CheckType {
	
	CheckType(String a){
		System.out.println(a + "�� �ڷ����� String�Դϴ�!");
	}
	
	CheckType(int b){
		System.out.println(b + "�� �ڷ����� Int�Դϴ�!");
	}

	public static void main(String[] x) {
		// int�� ���ڸ� String�� ���ڿ��� ����ȯ
		int fromInt = 10;
		String toString = Integer.toString(fromInt);
		CheckType ct1 = new CheckType(toString);
		
         // String�� ���ڿ��� int�� ���ڷ� ����ȯ
		String fromString = "20";
		int toInt = Integer.parseInt(fromString);
		CheckType ct2 = new CheckType(toInt);

		
	}

}
