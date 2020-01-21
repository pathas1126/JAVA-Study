package j200121;

public class StrMethod {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		StringBuffer c = new StringBuffer("abc");
		
		// str.quals() 메소드
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		// str.contentEquls() 메소드
		System.out.println(a.contentEquals(b));
		System.out.println(a.contentEquals(c));
		
	}

}
