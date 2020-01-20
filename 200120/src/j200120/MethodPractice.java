package j200120;

public class MethodPractice {
	void add(int a, int b) {
		int result = a+b;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		MethodPractice mP = new MethodPractice();
		mP.add(3, 5);
	}
}
