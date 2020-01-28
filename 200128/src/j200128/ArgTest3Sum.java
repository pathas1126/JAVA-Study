package j200128;

// 과목별 점수를 입력받아서 성적을 처리하는 프로그램

import java.util.Scanner;

public class ArgTest3Sum {

	public static void main(String[] args) {

		// 과목 이름을 저장한 subject 배열 생성
		String[] subject = { "현대철학", "중세철학", "고대철학", "존재와 시간", "소유와 존재" };
		// 과목 점수를 저장할 score 배열 생성
		int[] score = new int[5];
		
		// 합계 sum, 평균 avg 초기화
		int sum = 0;
		double avg = 0.0;
		
		// Scanner 클래스를 이용해서 표준입력으로 문자열을 입력 받는 sc 객체 생성
		Scanner sc = new Scanner(System.in);

		// 배열에 각각의 점수를 입력받고, 점수의 합계를 계산
		for (int i = 0; i < score.length; i++) {
			System.out.println("[" + subject[i] + "]" + " 점수를 입력하세요");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		// 평균 계산: 점수 총합을 과목 수로 나눔, double형으로 형변환 해주어야 소수점이 표현됨
		avg = (double) sum / (double) score.length;
		
		// 과목마다 점수를 출력하는 for문
		for(int i = 0; i<subject.length; i++) {
			System.out.println(subject[i]+" 점수: "+score[i]);
		}
		
		// 총합과 평균 계산
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
	}

}
