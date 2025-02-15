package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 */
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice2() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 */
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	public void practice3() {
		/*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
		 */
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= input; i++) {
			System.out.print(i);
			
			if (i != input)
				System.out.print(" + ");
			
			sum += i;
		}
		
		System.out.println(" = " + sum);
	}
	
	public void practice4() {
		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 */
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			if (num1 >= num2) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}
		}
	}
	
	public void practice5() {
		/*
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		 */
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		System.out.println("===== " + input + "단 =====");
		
		for (int dan = 1; dan <= 9; dan++) {
			System.out.printf("%d * %d = %d\n", input, dan, input * dan);
		}
		
	}
	
	public void practice6() {
		/*
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		 * 단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
		 */
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if (input >= 2 && input <= 9) {
			
			for (int dan = input; dan <= 9; dan++) {
				
				System.out.println("===== " + dan + "단 =====");
				
				for (int num = 1; num <= 9; num++) {
					System.out.printf("%d * %d = %d\n", dan, num, dan * num);
				}
				
			}
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
	}
	
	public void practice7() {
		/*
		 * input = 4
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * 
		 * - 행(row)은 입력한 input 만큼
		 * - 열(col)은 현재행(row)만큼 반복
		 */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int row = 1; row <= input; row++) {
			
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			
			System.out.println(); // 한 행의 모든 열 출력이 끝나면 줄바꿈
		}
	}
	
	public void practice8() {
		/*
		 * input = 4
		 * 
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int i = input; i >= 1; i--) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void practice9() {
		/*
		 * input = 4
		 * 
		 *    *
		 *   **
		 *  ***
		 * ****
		 */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			
			for (int space = 1; space <= input - i; space++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void practice10() {
		/*
		 * input = 3
		 * 
		 * *
		 * **
		 * ***
		 * **
		 * *
		 */
		
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//		
//		for (int i = 1; i <= input * 2 - 1; i++) {
//			int star = input;
//			
//			if (i < input) {
//				star -= input - i;
//			} else if (i > input) {
//				star -= i - input;
//			}
//			
//			for (int j = 1; j <= star; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int i = input - 1; i >= 1; i--) {
		
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
	}
	
	public void practice11() {
		/*
		 * input = 4
		 * 
		 *    *
		 *   ***
		 *  *****
		 * *******
		 */
		
		
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//		
//		int star = 1;
//		int space = (input * 2 - 1) / 2;
//		
//		for (int i = 1; i <= input; i++) {
//			
//			for (int j = 1; j <= space; j++) {
//				System.out.print(" ");
//			}
//			
//			for (int j = 1; j <= star; j++) {
//				System.out.print("*");
//			}
//			
//			space -= 1;
//			star += 2;
//			System.out.println();
//		}
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int row = 1; row <= input; row++) {
			
			for (int space = 1; space <= input - row; space++) {
				System.out.print(" ");
			}
			
			for (int col = 1; col <= (row * 2) - 1; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void practice12() {
		/*
		 * input = 5
		 * 
		 * *****
		 * *   *
		 * *   *
		 * *   *
		 * *****
		 */
		
		System.out.print("정수 입력 : ");
		int input =sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			
			for (int j = 1; j <= input; j++) {
				
				if (i == 1 || i == input || j == 1 || j == input)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
	
	public void practice13() {
		/*
		 * 1부터 사용자에게 입력 받은 수까지 중에서
		 * 1) 2와 3의 배수를 모두 출력하고
		 * 2) 2와 3의 공배수의 개수를 출력하세요.
		 * 
		 * ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
		 * 모두 나머지가 0이 나오는 수
		 */
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;
		
		for (int num = 1; num <= input; num++) {
			
			if (num % 2 == 0 || num % 3 == 0) {
				System.out.print(num + " ");
				
				if (num % 2 == 0 && num % 3 == 0)
					count++;
			}
		}
		
		System.out.println();
		System.out.println("count : = " + count);
	}
	
}
