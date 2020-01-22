package j200122;

public class CnstCall {
	String name;
	int age;

	CnstCall() {
		this("±è´ö¹è", 22);
	}

	CnstCall(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("ÀÌ¸§: " + name + ", ³ªÀÌ:" + age);
	}

	public static void main(String[] args) {

		CnstCall cc = new CnstCall();
	}

}
