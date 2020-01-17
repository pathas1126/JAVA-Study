package J200117;

public class Star3 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i-1 ; j++) {
				System.out.print("  ");
			}
			for(int k=5; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
