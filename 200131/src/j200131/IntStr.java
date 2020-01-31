package j200131;

// Integer.to~String() 메소드

public class IntStr {

	public static void main(String[] args) {
		int i = 144;
		// Integer.toBinaryString(int i)
		String binary = Integer.toBinaryString(i);
		
		// Integer.toOctalString(int i)
		String octal = Integer.toOctalString(i);
		
		// Integer.toHexString(int i)
		String hex = Integer.toHexString(i);
		
		// Integet.toString(int i, int radix)
		String binaryRadix = Integer.toString(i, 2);
		String octalRadix = Integer.toString(i, 8);
		String hexRadix = Integer.toString(i, 16);

		System.out.println("2진수: " + binary);
		System.out.println("8진수: " + octal);
		System.out.println("16진수: " + hex);
		System.out.println("2진수: " + binaryRadix);
		System.out.println("8진수: " + octalRadix);
		System.out.println("16진수: " + hexRadix);
	}

}
