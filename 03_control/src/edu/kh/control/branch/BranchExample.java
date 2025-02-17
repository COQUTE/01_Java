package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		// 단, 5를 출력하면 반복문 종료
		// 1 2 3 4 5
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print(i + " ");
			
			if (i == 5)
				break;
		}
	}
	
	public void ex2() {
		// 입력받은 모든 문자열을 누적
		// 단, "exit@" 입력시 문자열 누적을 종료하고 결과 출력
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		while (true) {
			
			System.out.print("문자열 입력(exit@ 입력 시 종료) : ");
			
			String input = sc.nextLine();
			
			// next()	  : 다음 한 단어(공백 포함 X)
			// nextLine() : 다음 한 줄(공백 포함 O)
			
			// 잡에서 문자열(Stirng) 비교는 == 연산자 사용 불가!
			// 비교연산자(==)는 보통 기본자료형끼리의 연산에서만 사용 가능.
			// String은 기본자료형이 아닌 참조형!!
			
			// equals() 메서드
			// 문자열1.equals(문자열2)
			// -> 문자열1과 문자열2가 같으면 true / 다르면 false 반환
			
			if (input.equals("exit@"))
				break;
			
			str += input + "\n";
		}
		
		System.out.println("================");
		System.out.println(str);
	}
	
	public void ex3() {
		// continue : 다음 반복으로 넘어감
		
		// 1 ~ 10까지 1씩 증가하며 출력
		// 단, 3의 배수 제외
		
		// 1 2 4 5 7 8 10
		
		for (int i = 0; i <= 10; i++) {
			
			if (i % 3 == 0)
				continue;
			
			System.out.print(i + " ");
		}
	}
	
	public void ex4() {
		// 1 ~ 100까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을 때 반복 멈춤
		
		/*
		 * 1
		 * 2
		 * 3
		 * 4
		 * 6
		 * 7
		 * 8
		 * 9
		 * 11
		 * ...
		 * 39
		 */
		
		for (int i = 1; i <= 100; i++) {
			
			if (i == 40)
				break;
			else if (i % 5 == 0)
				continue;
			
			System.out.println(i);
		}
	}
}
