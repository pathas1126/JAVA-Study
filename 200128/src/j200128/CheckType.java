package j200128;

public class CheckType {
	
	CheckType(String a){
		System.out.println(a + "의 자료형은 String입니다!");
	}
	
	CheckType(int b){
		System.out.println(b + "의 자료형은 Int입니다!");
	}

	public static void main(String[] x) {
		// int형 숫자를 String형 문자열로 형변환
		int fromInt = 10;
		String toString = Integer.toString(fromInt);
		CheckType ct1 = new CheckType(toString);
		
         // String형 문자열을 int형 숫자로 형변환
		String fromString = "20";
		int toInt = Integer.parseInt(fromString);
		CheckType ct2 = new CheckType(toInt);

		
	}

}
