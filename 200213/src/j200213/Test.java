package j200213;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String[] wishList = { "냉장고", "선풍기", "TV", "노트북", "세탁기", "에어컨" };
		String[] purchaseList = { "에어컨", "노트북", "TV" };

		System.out.println("====== 구입 X 물건");
		Arrays.sort(purchaseList);

		System.out.printf("%s", Arrays.binarySearch(purchaseList, wishList[0]) < 0 ? wishList[0] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(purchaseList, wishList[1]) < 0 ? wishList[1] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(purchaseList, wishList[2]) < 0 ? wishList[2] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(purchaseList, wishList[3]) < 0 ? wishList[3] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(purchaseList, wishList[4]) < 0 ? wishList[4] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(purchaseList, wishList[5]) < 0 ? wishList[5] + "\n" : "");

	}

}
