package j200213;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String[] wishList = { "�����", "��ǳ��", "TV", "��Ʈ��", "��Ź��", "������" };
		String[] purchaseList = { "������", "��Ʈ��", "TV" };

		System.out.println("====== ���� X ����");
		Arrays.sort(purchaseList);

		System.out.printf("%s", Arrays.binarySearch(purchaseList, wishList[0]) < 0 ? wishList[0] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(purchaseList, wishList[1]) < 0 ? wishList[1] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(purchaseList, wishList[2]) < 0 ? wishList[2] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(purchaseList, wishList[3]) < 0 ? wishList[3] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(purchaseList, wishList[4]) < 0 ? wishList[4] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(purchaseList, wishList[5]) < 0 ? wishList[5] + "\n" : "");

	}

}
