package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
		// 배열의 크기 3짜리 Student 객체 배열 선언 및 할당
		Student std[] = new Student[3];
		
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		std[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		std[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		// 위의 학생 정보 모두 출력
		// 반복 횟수가 std.length 만큼으로 정해져 있으니
		// for문을 활용하여 각 인덱스로 접근, Student 클래스의
		// information() 메서드를 활용하여 각 학생들의 정보를 출력
		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i].information());
		}
		
		System.out.println("--------------------------------------");
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
		// 크기 10짜리 Employee 객체 배열 선언 및 할당
		Employee emp[] = new Employee[10];
		
		// 사원들의 정보를 키보드로 입력 받을 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 입력된 정보를 객체 배열에 넣어줄 인덱스 위치를 표현하는
		// 지역변수 int index 선언 및 0으로 할당
		int index = 0;
		
		// -> while(true) 무한 반복문을 통해
		while (true) {
			
			// 사원들의 정보를 키보드로 계속 입력 받고
			System.out.print("이름: ");
			String name = sc.next();
			
			System.out.print("나이: ");
			int age = sc.nextInt();
			
			System.out.print("신장: ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게: ");
			double weight = sc.nextDouble();
			
			System.out.print("급여: ");
			int salary = sc.nextInt();
			
			System.out.print("부서: ");
			String dept = sc.next();
			
			emp[index] = new Employee(name, age, height, weight, salary, dept);
			
			// index를 다음 위치로 수정
			// 한 명씩 추가 될 때마다 카운트함 -> 카운트 값 = index - 1
			index++;
			
			// emp가 모두 찼을 경우 while문 탈출
			if (index == emp.length)
				break;
			
			// 계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면 계속 객체 추가
			System.out.print("계속 추가할래? (y/n) : ");
			char yn = sc.next().charAt(0);
			
			if (yn != 'y')
				break;
		}
		
		// 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
		// 현재 기록된 사원들의 정보를 모두 출력
		// -> 현재 emp Employee 객체 배열에는 index 위치가 정보가 저장된 마지막 인덱스
		for (int i = 0; i < index; i++) {

			System.out.println(emp[i].information());
		}
	}

}
