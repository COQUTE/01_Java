package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
		// 배열의 크기 3짜리 Student 객체 배열 선언 및 할당
		Student students[] = new Student[3];
		
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		// 반복문을 통해 출력
		// for / while..
		// 향상된 for문
		/*
		 * 자바에서 배열, 컬렉션과 같은 데이터를
		 * 순차적으로 간단하게 반복할 수 있는 구조를 제공
		 * 일반적인 for문 보다 코드가 더 간결하고 가독성이 좋아서
		 * 반복 작업을 더 쉽게 작성할 수 있다
		 * 
		 * for (데이터 타입 변수명 : 배열 또는 컬렉션) {
		 * 			// 반복해서 실행할 코드
		 * }
		 */
		
		// 위의 학생 정보 모두 출력
		// 반복 횟수가 std.length 만큼으로 정해져 있으니
		// 향상된 for문을 활용하여 각각 접근, Student 클래스의
		// information() 메서드를 활용하여 각 학생들의 정보를 출력
		for (Student std : students) {
			System.out.println(std.information());
		}
		
		System.out.println("--------------------------------------");
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
		// 크기 10짜리 Employee 객체 배열 선언 및 할당
		Employee emps[] = new Employee[10];
		
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
			
			emps[index] = new Employee(name, age, height, weight, salary, dept);
			
			// index를 다음 위치로 수정
			// 한 명씩 추가 될 때마다 카운트함
			index++;
			
			// emp가 모두 찼을 경우 while문 탈출
			if (index == emps.length)
				break;
			
			// 추가 여부 묻기
			System.out.print("계속 추가하시겠습니까? (y/n) : ");
			String str = sc.next().toUpperCase(); // 소문자 -> 대문자
			// String.toUpperCase() : "n" -> "N"
			// String.toLowerCase() : 대문자 -> 소문자 "N" -> "n"
		
			if(str.equals("N")) break;
			
			// -------------------------------
			
			/*
			System.out.print("계속 추가하시겠습니까? (y/n) : ");
			String str2 = sc.next(); // 소문자 -> 대문자
			// String.toUpperCase() : "n" -> "N"
			// String.toLowerCase() : 대문자 -> 소문자 "N" -> "n"
		
			if(str2.equalsIgnoreCase("N")) break;
			*/
			// -> equalsIgnoreCase() : 문자열 비교 메서드, 대소문자를 구분하지 않고
			//  두 문자열이 같은지 비교
		}
		
		// 현재까지 기록된 사원들의 정보를 모두 출력
		for(Employee emp : emps) {
			// [첫번째EMP객체에대한주소, 두번째EMP객체주소, null, null, null, null, null..]
			// 만약에 emp가 null 이면 반복 종료!
			if(emp == null) break; // NullPointerException 방지
			System.out.println( emp.information() );
			
		}
	}

}
