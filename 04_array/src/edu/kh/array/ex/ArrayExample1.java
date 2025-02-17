package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	
	/*
	 * 배열(Array)
	 * 
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * - 묶여진 변수들은 하나의 배열명으로 불러지고
	 *   구분은 index를 이용함 (index는 0부터 시작하는 정수)
	 */
	
	public void ex1() {
		// 변수 vs 배열
		
		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공간에 num이라는 이름을 부여.
		
		// 변수 대입
		num = 10;
		// 생성된 num이라는 변수공간에 10이라는 정수값 대입
		
		// 변수 사용
		System.out.println("num에 저장된 값: " + num);
		// num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
		// ----------------------
		
		// 배열 선언
		int[] arr;
		// int arr[];
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소값만을 저장할 수 있다 **
		
		// 배열 할당
		arr = new int[3];
		// new : "new 연산자"라고 하며
		//		 Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		// new int[3] : heap 영역에 int형 변수 3칸짜리 int[]을 생성(할당)
		
		// arr = new int[3];
		// int[]	int[] 	-> 같은 자료형 == 연산가능
		
		System.out.println("arr : " + arr); // 주소값 출력
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// -> Heap 영역에 생셩된 공간은 절대 비어있을 수 없다
		// -> JVM 기본값이 들어가져 있다
		// boolean : false
		// 나머지 : 0
		// 참조형 : null
		
		// 배열 요소 값 대입
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;
		
		// 배열 사용
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// [10, 50, 100] 실제로 arr 배열이 가진 모든 요소의 값을 알고 싶을 때
		// Arrays.toString(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void ex2() {
		
		// 배열 선언 및 할당
		int[] arr = new int[4];
		
		// arr[0~3] 전부 JVM에 의해 0으로 초기화 되어있는 상태
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		//arr[4] = 5000;
		// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		// 배열의 인덱스 범위를 벗어남 : 길이가 4칸짜리 배열인데, 없는 인덱스 번호인 4에 접근했다.
		
		// 코드에서 빨간줄 에러 : 컴파일 에러
		// 실행했을 때 발생하는 에러 : 런타임 에러
		
		// 배열과 for문
		// 배열의 길이 (몇 칸 인가) : 배열명.length
		System.out.println("배열의 길이 : " + arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			// i -> 0 1 2 3
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
			/*  arr[0]에 저장된 값 : 100
			 *  arr[1]에 저장된 값 : 200
			 *  ..
			 */
		}
		
		// 선언과 동시에 초기화
		int[] arr2 = {1, 2, 3, 4, 5};
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr2라는 이름 부여
		// Heap 메모리 영역에 int 5칸 짜리 int[]을 생성하고
		// 0번 인덱스부터 각 요소에 1~5까지 초기화함(대입)
		// int[] 주소값을 arr2라는 참조변수가 참조함.
		
		System.out.println(Arrays.toString(arr2));
	}
	
	public void ex3() {
		// 5명의 키(cm)를 입력받고 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 163.7
		// ..
		// 5번 키 입력 : 167.2
		// 평균 : ~~
		
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[5];
		// double[] 자료형 참조변수 height를 stack영역에 생성하고
		// height에 heap영역에 새로 생성된 double 5칸짜리 배열의 주소를 대입
		
		double sum = 0; // 합계 저장용 변수
		
		for (int i = 0; i < height.length; i++) {
			// 0 1 2 3 4
			System.out.print((i + 1) + "번 키 입력 : ");
			height[i] = sc.nextDouble();
			// height[0] = 170.2
			// height[1] = 164.2
			// ...
			// height[4] = 156.3
			
			// 배열의 각 요소에 대입되어 있는 값을 사용(합계)하는 용도의 반복문
			sum += height[i]; // 배열의 각 index에 저장된 값을 sum에 누적
			// sum = sum + height[i];
			// sum = 0 + 170.2;
			// sum = 170.2 + 164.2;
		}
		
		System.out.printf("평균 : %.2f cm\n", sum / height.length);
	}
	
	public void ex4() {
		// 입력 받은 인원 수 만크의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균, 최고점, 최저점 출력
		
		/*
		 * 입력 받을 인원 수 : 4
		 * 1번 점수 입력 : 100
		 * 2번 점수 입력 : 80
		 * 3번 점수 입력 : 50
		 * 4번 점수 입력 : 60
		 * 
		 * 합계 : 290
		 * 평균 : 72.5
		 * 최고점 : 100
		 * 최저점 : 50
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		
		// 배열 선언 및 할당
		// 할당할 배열의 크기는 입력받은 인원수 크기만큼(input)
		int[] score = new int[input];
		
		// 합계 저장용 변수
		int sum = 0;
		
		// score 배열의 각 요소에 입력하는 값 대입 & 합계 누적 용도
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번 점수 입력 : ");
			score[i] = sc.nextInt();
			// score[0] = 100
			// score[1] = 50
			// score[2] = 30
			// score[3] = 90
			
			sum += score[i];
		}
		
		// -> score 배열의 각 요소가 모두 입력한 값으로 대입 완료
		
		// 최저점과 최고점의 기준 설정
		int min = score[0];
		int max = score[0];
		
		for (int i = 0; i < score.length; i++) {
			// 0 1 2 3
			
			// 최고점 비교
			if (score[i] > max)
				max = score[i];
			
			// 최저점 비교
			if (score[i] < min)
				min = score[i];
		}
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", (double)sum / score.length);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);		
		
	}

	public void ex5() {
		// 점심 메뉴 뽑기 프로그램
		String[] arr = {"김밥", "서브웨이", "햄버거", "백반", "국밥", "짜장면"};
		
		System.out.println("오늘 점심 메뉴 : " + arr[(int)(Math.random() * arr.length)]);
		// (int)(Math.random() * 6)
		// Math.random() : 0.0 ~ 1.0
		// 0 1 2 3 4 5
		// 0.0 <= x < 1.0
		// 0.0 <= x * 6 < 6.0
		// 0 <= x < 6
	}
}