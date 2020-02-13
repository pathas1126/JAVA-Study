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

		singer.name = "��ȿ��";
		singer.age = 40;
		singer.album = Album.FIRST;

		System.out.println("���� �̸�: " + singer.name);		// ���� �̸�: ��ȿ��
		System.out.println("���� ����: " + singer.age); 		// ���� ����: 40
		System.out.println("���� �ٹ�: " + singer.album); 	// ���� �ٹ�: FIRST

		// enumClass.values(), enum Ŭ������ ����� ��� �̸��� �迭�� ��ȯ
		for (Album a : Album.values()) {
			System.out.print(a + "\t");
		}
		// FIRST SECOND THIRD FOURTH

		// �ٹٲ�
		System.out.println();

		// enumClass.FINAL.ordinal(), enum Ŭ������ ����� �ش� ����� ������ ������ ��ȯ
		System.out.println(Album.FIRST.ordinal()); 		// 0
		System.out.println(Album.SECOND.ordinal()); 	// 1
		System.out.println(Album.THIRD.ordinal()); 		// 2
		System.out.println(Album.FOURTH.ordinal()); 	// 3

		// valueOf(), �Ű������� �־��� String�� ���������� ��ġ�ϴ� �̸��� ���� ���� ��ȯ
		Album al1 = Album.FIRST;
		Album al2 = Album.valueOf("FIRST");
		System.out.println(al1); // FIRST
		System.out.println(al2); // FIRST
	}

}
