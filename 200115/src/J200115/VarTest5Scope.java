package J200115;

public class VarTest5Scope {

	int su3;// 멤버 변수 Member Variable : 클래스 내부에 선언된 변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int su1 = 10; // 지역 변수 Local Variable	 : 메서드 내부에 선언된 변수
	System.out.println("변수의 사용범위(Scope)");
	{// 블럭지정
		int su2 = 20;
		System.out.println("su1값: "+su1);
		System.out.println("su2값: "+su2);
	}
//	System.out.println("su2값: "+su2);
	}

}
