package j200210;

public class GenericExMain {

	public static void main(String[] args) {
		// GenericEx 클래스 객체 생성, String 자료형만 처리하는 객체 생성
		GenericEx<String> geStr = new GenericEx();

		// geStr 객체에서 메소드 호출
		geStr.setV("홍길동", "이순신", "세종대왕");
		geStr.getV();

		// Double형만 처리하는 객체 생성
		GenericEx<Double> geDbl = new GenericEx();
		geDbl.setV(1.2, 2.4, 3.5, 4.1, 5.8);
		geDbl.getV();

		// Integer형만 처리하는 객체 생성
		GenericEx<Integer> geInt = new GenericEx();
		geInt.setV(1, 2, 3, 4, 5);
		geInt.getV();
	}

}
