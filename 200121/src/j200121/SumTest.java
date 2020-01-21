package j200121;

public class SumTest {
	int x;
	int y;


	void calculate() {
		System.out.println("´õÇÏ±â: " + (x + y));
		System.out.println("»©±â: " + (x - y));
		System.out.println("°öÇÏ±â: " + (x * y));
		System.out.println("¸ò: " + (x / y));
	}

	void calculate2(int a, int b) {
		System.out.println("´õÇÏ±â: " + (a + b));
		System.out.println("»©±â: " + (a - b));
		System.out.println("°öÇÏ±â: " + (a * b));
		System.out.println("¸ò: " + (a / b));
	}

	int add(int a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a - b;
	}

	int multiple(int a, int b) {
		return a * b;
	}

	int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		SumTest st = new SumTest();
		st.x = 10;
		st.y = 20;


		int sum;
		int minus;
		int multiple;
		int divide;
		
		int a = 23;
		int b = 22;
		
		sum = st.add(a, b);
		minus = st.minus(a, b);
		multiple = st.multiple(a, b);
		divide = st.divide(a, b);
		
		
		st.calculate();
		System.out.println("==========");
		st.calculate2(5, 5);
		
		System.out.println("==========");
		System.out.println("´õÇÏ±â: "+sum);
		System.out.println("»©±â: "+minus);
		System.out.println("°öÇÏ±â: "+multiple);
		System.out.println("³ª´©±â: "+divide);
		
	}
}
