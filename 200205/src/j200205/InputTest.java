package j200205;

import java.util.Scanner;

public class InputTest {

	// 멤버 변수 이름, 점수, 성적
	String name;
	int point;
	char grade;

	// 스캐너 객체를 반환하는 메소드
	public Scanner setScan() {
		return new Scanner(System.in);
	}

	// 스캐너 객체를 받아와서 name, point 값을 설정하는 메소드
	public void getScan(Scanner sc) {
		// 이름 입력
		System.out.println("이름은?");
		name = sc.next();

		// 국어 점수 입력
		System.out.println("국어 점수를 입력하세요");
		point = sc.nextInt();

		// 점수는 0~100까지만 입력, 그 외의 값에 대해서는 메세지 출력 후 프로그램 종료
		if (point > 100 || point < 0) {
			System.out.println("점수는 0~100까지 입력해주세요");
			System.exit(0);
		}
	}

	// 성적 출력 메소드
	public void gradePrint() {
		// 점수를 20으로 나누어서 다시 저장, 0~19 -> 0, 20~39 -> 1,,, 80~99 -> 4, 100 -> 5
		point = point / 20;
		// 스위치문으로 grade 값 초기화
		switch (this.point) {
		case 0:
			grade = '가';
			break;
		case 1:
			grade = '양';
			break;
		case 2:
			grade = '미';
			break;
		case 3:
			grade = '우';
			break;
		case 4:
			grade = '수';
			break;
		default:
			grade = '수';
		}
		// 성적 출력
		System.out.println(name + "의 등급은 " + grade + "입니다.");
	}

	public static void main(String[] args) {
		InputTest it = new InputTest();
		Scanner sc = it.setScan();
		it.getScan(sc);
		it.gradePrint();
	}

}
