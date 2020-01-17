package J200117;

public class Practice1 {

	public static void main(String[] args) {
		//console창에 마름모 출력하기
		for(int i=1; i<8; i++) {
			if(i <5) {
				for(int j =4; i<j; j--) {
					System.out.print("  ");
				}
				for(int k=1; k<=(2*i)-1; k++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for(int l= 4; l<i; l++) {
					System.out.print("  ");
				}
				// 5, 3, 1
				for(int m=1;   m<=((8-i)*2)-1 ; m++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	// 문제를 풀 때, 변수와 상수가 어떤 것인지 먼저 파악하면 한층 수월함
}
