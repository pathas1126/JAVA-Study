package J200116;

public class Op2 {

	public static void main(String[] args) {
		byte b1 = 5; // +5
		short s = -4;
		int i = 8;
		
		System.out.println("b1: "+b1); //5
		System.out.println("-s: "+(-s)); // 4
		System.out.println("i: "+i); // 8
		System.out.println("++i: "+(++i)); //9
		// i = i+1 -> i=9 -> print i : 9
		System.out.println("i++: "+(i++)); //9
		// print i: 9 -> i = i+1 -> i: 10
		System.out.println("i: "+i); // 10
		
		System.out.println("--i: "+(--i)); // --i: 9
		System.out.println("i--: "+(i--)); //i--: 9
		System.out.println("i: "+i); // i: 8
	}

}
