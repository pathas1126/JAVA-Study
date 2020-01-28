package j200128;

public class ArgTest2 {

	public static void main(String[] args) {

		int[] b = {56, 36, 21, 36, 47, 73, 24, 55, 24, 26}; // 10명
		
		// 20대가 몇 명 포함되어 있는지 계산
		int count = 0;
		for(int c:b) {
			if(c >= 20 && c<30) {
				count++;
			}
		}
		System.out.println("b그룹에서 20대는 "+count+"명입니다.");
		}
		
	}

