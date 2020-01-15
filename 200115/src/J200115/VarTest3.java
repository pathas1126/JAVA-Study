package J200115;

public class VarTest3 {
	public static void main(String[] args) {
		System.out.println("논리적인 값");
		boolean b = true; // 소문자만 입력
		boolean c = 2>3; // 관계연산자로 true/false값 저장 가능
		System.out.println("b값: "+b+", c값: "+c);
		
		char d = 'A';
		char d2 = 65; // 아스키값으로도 문자 표현 가능, char 자료형에 담긴 숫자는 문자를 뜻함
		//16진수 값을 입력 받아서 문자 저장, '\u0000'~'\uFFFF'로 표기
		char d3 = '\u0041';
		// 10진수 : 45, 8진수 : 045, 16진수 0x45
		System.out.println("d값: "+d+", d2값: "+d2+", d3값: "+d3);
		
		String s1 = "식별자 자바기초 문법";
		String s2 = "변수, 자료형, 연산자";
		String s3 = s1+""+s2;
		System.out.println("s3: "+s3);
	}
}
