package J200117;

public class Alpha2 {

	public static void main(String[] args) {
		char a= 65;
		
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print(a++);
			}
			System.out.println();
		}

	}

}
