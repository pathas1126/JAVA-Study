package j200128;

public class ArgTest2 {

	public static void main(String[] args) {

		int[] b = {56, 36, 21, 36, 47, 73, 24, 55, 24, 26}; // 10��
		
		// 20�밡 �� �� ���ԵǾ� �ִ��� ���
		int count = 0;
		for(int c:b) {
			if(c >= 20 && c<30) {
				count++;
			}
		}
		System.out.println("b�׷쿡�� 20��� "+count+"���Դϴ�.");
		}
		
	}

