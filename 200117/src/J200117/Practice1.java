package J200117;

public class Practice1 {

	public static void main(String[] args) {
		//consoleâ�� ������ ����ϱ�
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
	// ������ Ǯ ��, ������ ����� � ������ ���� �ľ��ϸ� ���� ������
}
