package j200213;

enum Album {
	FIRST, SECOND, THIRD, FOURTH
}

public class Singer {

	public String name;
	public int age;
	public Album album;

	public static void main(String[] args) {
		Singer singer = new Singer();

		singer.name = "박효신";
		singer.age = 40;
		singer.album = Album.FIRST;

		System.out.println("가수 이름: " + singer.name);		// 가수 이름: 박효신
		System.out.println("가수 나이: " + singer.age); 		// 가수 나이: 40
		System.out.println("가수 앨범: " + singer.album); 	// 가수 앨범: FIRST

		// enumClass.values(), enum 클래스에 선언된 상수 이름을 배열로 반환
		for (Album a : Album.values()) {
			System.out.print(a + "\t");
		}
		// FIRST SECOND THIRD FOURTH

		// 줄바꿈
		System.out.println();

		// enumClass.FINAL.ordinal(), enum 클래스에 선언된 해당 상수의 순서를 정수로 반환
		System.out.println(Album.FIRST.ordinal()); 		// 0
		System.out.println(Album.SECOND.ordinal()); 	// 1
		System.out.println(Album.THIRD.ordinal()); 		// 2
		System.out.println(Album.FOURTH.ordinal()); 	// 3

		// valueOf(), 매개변수로 주어진 String과 열거형에서 일치하는 이름을 갖는 원소 반환
		Album al1 = Album.FIRST;
		Album al2 = Album.valueOf("FIRST");
		System.out.println(al1); // FIRST
		System.out.println(al2); // FIRST
	}

}
