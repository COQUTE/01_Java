package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	private class Subject {
		int koreanScore;
		int englishScore;
		int mathScore;
		
		public boolean isPassed(int[] scoreArray, double average) {
			boolean isPass = true;
			
			for (int i = 0; i < scoreArray.length; i++) {
				
				isPass &= scoreArray[i] >= 40;
			}
			
			isPass &= (average >= 60);
			
			return isPass;
		}
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		/*
		 * 키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
		 * 짝수가 아니면 “홀수입니다.“를 출력하세요.
		 * 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		 */
		
		int input;
		String result;
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		input = sc.nextInt();
		
		if (input <= 0) {
			result = "양수만 입력해주세요.";
			
		} else if (input % 2 == 0) {
			result = "짝수입니다.";
			
		} else {
			result = "홀수입니다.";
		}
		
		System.out.println(result);
	}

	public void practice2() {
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		 * 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		 * (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		 * 
		 * 합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		 * 불합격인 경우에는 “불합격입니다.”를 출력하세요.
		 */
		
		Subject sub = new Subject();
		
		int[] scoreArray;
		int total;
		double average;
		
		System.out.print("국어 : ");
		sub.koreanScore = sc.nextInt();
		
		System.out.print("수학 : ");
		sub.mathScore = sc.nextInt();
		
		System.out.print("영어 : ");
		sub.englishScore = sc.nextInt();
		
		scoreArray = new int[] { sub.koreanScore, sub.mathScore, sub.englishScore };
		
		total = 0;
		for (int i = 0; i < 3; i++) {
			
			total += scoreArray[i];
		}
		
		average = total / 3.0;
		
		if (sub.isPassed(scoreArray, average)) {
			
			System.out.println("국어 : " + sub.koreanScore);
			System.out.println("수학 : " + sub.mathScore);
			System.out.println("영어 : " + sub.englishScore);			
			
			System.out.println("합계 : " + total);
			System.out.printf("평균 : %.1f\n", average);
			
			System.out.println("축하합니다, 합격입니다!");
			
		} else {
			System.out.println("불합격입니다.");
		}
		
	}

	public void practice3() {
		/*
		 * 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
		 * 잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)
		 */
		
		int month;
		int day;
		
		System.out.print("1~12 사이의 정수 입력 : ");
		month = sc.nextInt();
		
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12: 
			System.out.println(month + "월은 31일까지 있습니다"); break;
		
		case 4, 6, 9, 11:
			System.out.println(month + "월은 30일까지 있습니다"); break;
		
		case 2:
			System.out.println(month + "월은 28일까지 있습니다"); break;
			
		default: System.out.println(month + "월은 잘못 입력된 달입니다");
		}
		
	}

	public void practice4() {
		/*
		 * 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		 * 저체중/정상체중/과체중/비만을 출력하세요.
		 */
		
		double height;
		double weight;
		double bmi;
		String result;
		
		System.out.print("키(m)를 입력해 주세요 : ");
		height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		weight = sc.nextDouble();
		
		bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			result = "저체중";
			
		} else if (bmi < 23) {
			result = "정상체중";
			
		} else if (bmi < 25) {
			result = "과체중";
			
		} else if (bmi < 30) {
			result = "비만";
			
		} else {
			result = "고도 비만";
		}
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
	}
	
	public void practice5() {
		/*
		 * 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
		 * 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		 * 이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		 * 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		 */
		
		System.out.print("중간 고사 점수 : ");
		double midTerm = sc.nextDouble();
	
		System.out.print("기말 고사 점수 : ");
		double finalTerm = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		double report = sc.nextDouble();
		
		System.out.print("출석 횟수 : ");
		double attendance = sc.nextDouble();
		
		System.out.println("================= 결과 =================");
		
		// 각각의 점수를 비율에 맞게 변경
		midTerm *= 0.2; // midTerm이 int인 경우 강제 형변환 midTerm = (int) midTerm * 0.2;
		finalTerm *= 0.3;
		report *= 0.3;
		
		if (attendance <= 20 * (1 - 0.3)) {
			// 총 강의 횟수 : 20
			// 결석 기준 : 0.3
			// (1 - 0.3) = 0.7 -> 70 % 이상 출석해야한다는 의미
			
			System.out.println("Fail [출석 횟수 부족 (" + (int)attendance + "/20)]");
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", midTerm);
			System.out.printf("기말 고사 점수(30) : %.1f\n", finalTerm);
			System.out.printf("과제 점수\t(30) : %.1f\n", report);
			System.out.printf("출석 점수\t(20) : %.1f\n", attendance);
			
			double total = midTerm + finalTerm + report + attendance;
			
			System.out.printf("총점 : %.1f\n", total);
			
			if (total >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		}
	}
}
