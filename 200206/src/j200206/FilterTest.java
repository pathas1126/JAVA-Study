package j200206;

import java.io.*;

public class FilterTest {

	public static void main(String[] args) throws Exception {

		// 매개변수의 자료형으로 부모클래스 지정-> 부모클래스 객체 뿐만 아니라 상속관계에 있는
		// 자식클래스의 객체도 매개변수로 전달받을 수 있음
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// 키보드를 통해서 읽어들이는데, 한글이 깨지지 않도록 하고,
		// 한 번에 많은 양의 데이터를 읽어 들여라(버퍼링 기능)
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor, eng, total;

		System.out.println("이름은?");
		name = bb.readLine();
		System.out.println("국어 점수는?");
		kor = Integer.parseInt(bb.readLine());
		System.out.println("영어 점수는?");
		eng = Integer.parseInt(bb.readLine());
		
		bb.close();

		total = kor + eng;
		System.out.println(name + "의 시험 점수는 총 " + total + "점입니다.");
	}

}
