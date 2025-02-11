package edu.kh.basic;

public class JavaTest {
	
	// main -> ctrl + space -> 자동완성 기능
	public static void main(String args[]) {
		// 실행 단축키: ctrl + f11
		System.out.println("Hello world!");
		System.out.println("저녁 뭐 먹을까");
		System.out.println("12345");
		// syso 작성 후 ctrl + space -> System.out.println(); 자동 완성
		System.out.println();
		
		// ctrl + alt + 방향키(위아래): 방향키 방향으로 해당 줄 복사
		// alt + 방향키(위아래): 방향키 방향으로 해당 줄 이동
		
		System.out.println("1 + 2"); // 1 + 2
		System.out.println(1 + 2); // 3
		
		// "" 안에 작성된 코드는 단순 문자열로 인식
		// "" 안에 작성되지 않은 코드는 숫자, 변수로 인식
		
		System.out.println(50 - 23);
		System.out.println(12 * 13);	
		System.out.println(327 / 3);	
		System.out.println(12 % 2);	// 나머지
		
		System.out.println("14 * 19 = " + 266);
		System.out.println("14 * 19 = " + 14 * 19);
		System.out.println("90 + 70 + 65 = " + 90 + 70 + 65);
		System.out.println("90 + 70 + 65 = " + (90 + 70 + 65));
		
		// 자바는 사칙연산의 우선 순위를 그대로 따른다
		// -> 우선 계산을 원하면 () 괄호 사용
		
		// (+) 기호의 역할
		// -> 숫자 + 숫자 = 덧셈 연산 결과
		// -> 문자열 + 숫자 or 문자열 + 문자열 = 이어쓰기
		System.out.println("A" + "B");
	}

}
