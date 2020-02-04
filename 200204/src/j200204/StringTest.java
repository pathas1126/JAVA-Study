package j200204;

public class StringTest {

	public static void main(String[] args) {
		String str = "AsDfsdS";
		String strr = "asdfsds";
		char c = 'a';
		char d = ' ';
		
		System.out.println(str.equalsIgnoreCase(strr));
		//isWhitespace(char ch), isDigit(char ch)
		System.out.println(Character.isDigit(c));
		System.out.println(Character.isWhitespace(c));
	}
}
