package j200128;

// ���� ������ �Է¹޾Ƽ� ������ ó���ϴ� ���α׷�

import java.util.Scanner;

public class ArgTest3Sum {

	public static void main(String[] args) {

		// ���� �̸��� ������ subject �迭 ����
		String[] subject = { "����ö��", "�߼�ö��", "���ö��", "����� �ð�", "������ ����" };
		// ���� ������ ������ score �迭 ����
		int[] score = new int[5];
		
		// �հ� sum, ��� avg �ʱ�ȭ
		int sum = 0;
		double avg = 0.0;
		
		// Scanner Ŭ������ �̿��ؼ� ǥ���Է����� ���ڿ��� �Է� �޴� sc ��ü ����
		Scanner sc = new Scanner(System.in);

		// �迭�� ������ ������ �Է¹ް�, ������ �հ踦 ���
		for (int i = 0; i < score.length; i++) {
			System.out.println("[" + subject[i] + "]" + " ������ �Է��ϼ���");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		// ��� ���: ���� ������ ���� ���� ����, double������ ����ȯ ���־�� �Ҽ����� ǥ����
		avg = (double) sum / (double) score.length;
		
		// ���񸶴� ������ ����ϴ� for��
		for(int i = 0; i<subject.length; i++) {
			System.out.println(subject[i]+" ����: "+score[i]);
		}
		
		// ���հ� ��� ���
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
	}

}
