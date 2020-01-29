package j200129;

public class StringMethod {

	public static void main(String[] x) {

		String string = "Hello, My Friend!";
		String beforeTrim = "           Hello, My Friend!           ";
		int fromInt = 1234;

		String subString1 = string.substring(7);
		String subString2 = string.substring(7, 11);
		String toUpper = string.toUpperCase();
		String toLower = string.toLowerCase();
		String trim = beforeTrim.trim();
		String valueOf = String.valueOf(fromInt);

		System.out.println(subString1);
		System.out.println(subString2);
		System.out.println(toUpper);
		System.out.println(toLower);
		System.out.println(trim);
		System.out.println(valueOf);

	}

}