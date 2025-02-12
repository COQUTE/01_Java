package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	/*
	 * 키보드로 나이를 입력받아 
	 * 20세 이상이면 "저는 성인 입니다", 아니면 "저는 미성년 입니다" 출력.
	 * 입력받은 값이 13세 이상이면서 19세 이하면 "청소년입니까? true"출력, 아니면 false 출력.
	 * 입력받은 값이 65세 이상이거나, 12세 이하면 "노인이거나 어린이 입니까? true" 출력 아니면 false 출력
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int age;
		String result;
		
		System.out.print("당신의 나이는 ? : ");
		age = sc.nextInt();
		
		result = (age >= 20) ? "저는 성인입니다" : "저는 미성년입니다";
		System.out.println(result);
		
		result = (age >= 13 && age <= 19) ? "true" : "false";
		System.out.printf("청소년입니까? %s\n", result);
		
		result = (age >= 65 || age <= 12) ? "true" : "false";
		System.out.printf("노인이거나 어린이입니까? %s\n", result);
		
	}
}
