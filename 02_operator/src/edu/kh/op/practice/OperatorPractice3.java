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
		double discountRate;
		int totalPrice;
		double finalPrice;
		
		System.out.print("가격을 입력하세요 : ");
		totalPrice = sc.nextInt();
		
		System.out.print("멤버십 있으세요? (있으면 true / 없으면 false 입력) : ");
		isMember = sc.nextBoolean();
		
		discountRate = isMember ? 0.10 : 0.05;
		
		
		finalPrice = totalPrice * (1 - discountRate);
		System.out.printf("할인을 포함한 최종 금액 : %.1f원\n", finalPrice);
	}
	
	public void practice2() {
		// ATM에서 사용자가 원하는 금액을 입력하면, 5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라
		// ex) 사용자가 123000원을 입력하면, 5만원 지폐 2장, 1만원 지폐 2장, 5천원 지폐 0장, 1천원 지폐 3장이 필요함
		
		int bill[] = { 50000, 10000, 5000, 1000 };
		int money;
		
		System.out.print("출금할 금액 입력 : ");
		money = sc.nextInt();
		
		for (int i = 0; i < bill.length; i++) {
			
			System.out.printf("%d원: %d\n", bill[i], money / bill[i]);
			money %= bill[i];
		}
	}
	
	public void practice3() {
		/*
		 * 사용자로부터 두 개의 정수를 입력받아, 
		 * 첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
		 * 만약 배수라면 "배수입니다"를 출력하고, 아니라면 "배수가 아닙니다"를 출력
		 */
		
		int num1;
		int num2;
		String result;
		
		System.out.print("첫 번째 수 : ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 수 : ");
		num2 = sc.nextInt();
		
		// 첫번째 수가 두번째 수의 배수인지
		// == 첫번째 수가 두번째 수로 나누어 떨어진다는 뜻
		// == 첫번째를 두번째로 나누었을 때 나머지가 0이다
		
		result = (num1 % num2 == 0) ? "배수입니다" : "배수가 아닙니다";
		
		System.out.println(result);
	}
}
