package j200205;

import java.util.Scanner;

public class InputTest {

	// ��� ���� �̸�, ����, ����
	String name;
	int point;
	char grade;

	// ��ĳ�� ��ü�� ��ȯ�ϴ� �޼ҵ�
	public Scanner setScan() {
		return new Scanner(System.in);
	}

	// ��ĳ�� ��ü�� �޾ƿͼ� name, point ���� �����ϴ� �޼ҵ�
	public void getScan(Scanner sc) {
		// �̸� �Է�
		System.out.println("�̸���?");
		name = sc.next();

		// ���� ���� �Է�
		System.out.println("���� ������ �Է��ϼ���");
		point = sc.nextInt();

		// ������ 0~100������ �Է�, �� ���� ���� ���ؼ��� �޼��� ��� �� ���α׷� ����
		if (point > 100 || point < 0) {
			System.out.println("������ 0~100���� �Է����ּ���");
			System.exit(0);
		}
	}

	// ���� ��� �޼ҵ�
	public void gradePrint() {
		// ������ 20���� ����� �ٽ� ����, 0~19 -> 0, 20~39 -> 1,,, 80~99 -> 4, 100 -> 5
		point = point / 20;
		// ����ġ������ grade �� �ʱ�ȭ
		switch (this.point) {
		case 0:
			grade = '��';
			break;
		case 1:
			grade = '��';
			break;
		case 2:
			grade = '��';
			break;
		case 3:
			grade = '��';
			break;
		case 4:
			grade = '��';
			break;
		default:
			grade = '��';
		}
		// ���� ���
		System.out.println(name + "�� ����� " + grade + "�Դϴ�.");
	}

	public static void main(String[] args) {
		InputTest it = new InputTest();
		Scanner sc = it.setScan();
		it.getScan(sc);
		it.gradePrint();
	}

}
