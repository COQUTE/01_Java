package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		/* 마트에서 고객에게 할인 혜택을 제공하려고 한다
		 * 물건의 총 가격과 회원 여부를 입력받아, 
		 * 회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라
		 */
		
		boolean isMember;
		int totalCost;
		double finalCost;
		
		System.out.print("가격을 입력하세요 : ");
		totalCost = sc.nextInt();
		
		System.out.print("멤버십 있으세요? (있으면 true / 없으면 false 입력) : ");
		isMember = sc.nextBoolean();
		
		finalCost = isMember ? (totalCost * 9 / 10)  : (totalCost * 95 / 100);
		System.out.printf("할인을 포함한 최종 금액 : %.1f원\n", finalCost);
	}
	
	public void practice2() {
		// ATM에서 사용자가 원하는 금액을 입력하면, 5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라
		// ex) 사용자가 123000원을 입력하면, 5만원 지폐 2장, 1만원 지폐 2장, 5천원 지폐 0장, 1천원 지폐 3장이 필요함
		
		final int FIFTY_THOUSAND = 50000;
		final int TEN_THOUSAND = 10000;
		final int FIVE_THOUSAND = 5000;
		final int THOUSAND = 1000;
		
		int money;
		
		System.out.print("출금할 금액 입력 : ");
		money = sc.nextInt();
		
		System.out.printf("%d원: %d\n", FIFTY_THOUSAND, money / FIFTY_THOUSAND);
		money %= FIFTY_THOUSAND;
		
		System.out.printf("%d원: %d\n", TEN_THOUSAND, money / TEN_THOUSAND);
		money %= TEN_THOUSAND;
		
		System.out.printf("%d원: %d\n", FIVE_THOUSAND, money / FIVE_THOUSAND);
		money %= FIVE_THOUSAND;
		
		System.out.printf("%d원: %d\n", THOUSAND, money / THOUSAND);
	}
	
	public void practice3() {
		/*
		 * 사용자로부터 두 개의 정수를 입력받아, 
		 * 첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
		 * 만약 배수라면 "배수입니다"를 출력하고, 아니라면 "배수가 아닙니다"를 출력
		 */
		
		int num1;
		int num2;
		
		System.out.print("첫 번째 수 : ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 수 : ");
		num2 = sc.nextInt();
		
		String result = num1 % num2 == 0 ? "배수입니다" : "배수가 아닙니다";
		
		System.out.println(result);
	}
}
