package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	public void practice1() {
		/* 마트에서 고객에게 할인 혜택을 제공하려고 한다
		 * 물건의 총 가격과 회원 여부를 입력받아, 
		 * 회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라
		 */
		
		boolean isMember;
		int totalCost;
		double finalCost;
		
		Scanner sc = new Scanner(System.in);
		
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
		
		int money;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출금할 금액 입력 : ");
		money = sc.nextInt();
		
		
	}
}
