package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	private class Student {
		String name;
		int grade;
		int classNum;
		int id;
		String gender;
		double score;
	}

	private class Subject {
		int koreanScore;
		int englishScore;
		int mathScore;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		int person;
		int candy;
		int sharedCandy;
		int leftCandy;
		
		System.out.print("인원 수: ");
		person = sc.nextInt();
		
		System.out.print("사탕 개수: ");
		candy = sc.nextInt();
		
		sharedCandy = candy / person;
		leftCandy = candy % person;
		
		System.out.printf("나눠가진 사탕 개수: %d\n남은 사탕 개수: %d\n", sharedCandy, leftCandy);
	}
	
	public void practice2() {
		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		
		Student std = new Student();
		
		System.out.print("이름 : ");
		std.name = sc.next();

		System.out.print("반(정수만) : ");
		std.grade = sc.nextInt();
		
		System.out.print("학년(정수만) : ");
		std.classNum = sc.nextInt();

		System.out.print("번호(정수만) : ");
		std.id = sc.nextInt();

		System.out.print("성별(남학생/여학생 : ");
		std.gender = sc.next();

		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		std.score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n",
						std.grade, std.classNum, std.id, std.name, std.gender, std.score);
	}
	
	public void practice3() {
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		// 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		
		Subject sub = new Subject();
		
		int total;
		double average;
		
		System.out.print("국어 : ");
		sub.koreanScore = sc.nextInt();
		
		System.out.print("영어 : ");
		sub.englishScore = sc.nextInt();
		
		System.out.print("국어 : ");
		sub.mathScore = sc.nextInt();
		
		total = sub.koreanScore + sub.englishScore + sub.mathScore;
		System.out.println("합계 : " + total);
		
		average = total / 3.0;
		System.out.println("평균 : " + average);
	}
}
