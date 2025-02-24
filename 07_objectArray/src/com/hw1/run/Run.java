package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {

		/* 3개의 생성자를 사용하여 3명의 사원 정보를
		 * 배열로 생성한 후 출력 해보고 값이 없는
		 * 필드에 각각 값을 입력해 넣어 출력
		 * 직원 각각의 보너스가 적용된 연봉을 계산하여
		 * 출력하고 총 직원 연봉의 평균을 구하여 출력
		 */
		
		// 객체배열을 크기 3으로 할당한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
		Employee[] employeeArr = new Employee[3];
		
		employeeArr[0] = new Employee();
		employeeArr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");	
		employeeArr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for (int i = 0; i < employeeArr.length; i++) {
			
			System.out.printf("emp[%d] : ", i);
			System.out.println(employeeArr[i].information());
		}
		
		System.out.println("==============================================================================");
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
		
		employeeArr[0].setEmpNo(0);
		employeeArr[0].setEmpName("김말똥");
		employeeArr[0].setDept("영업부");
		employeeArr[0].setJob("팀장");
		employeeArr[0].setAge(30);
		employeeArr[0].setGender('M');
		employeeArr[0].setSalary(3000000);
		employeeArr[0].setBonusPoint(0.2);
		employeeArr[0].setPhone("01055559999");
		employeeArr[0].setAddress("전라도 광주");
		
		employeeArr[1].setDept("기획부");
		employeeArr[1].setJob("부장");
		employeeArr[1].setAge(19);
		employeeArr[1].setGender('M');
		employeeArr[1].setSalary(4000000);
		employeeArr[1].setBonusPoint(0.3);
		employeeArr[1].setPhone("01022223333");
		employeeArr[1].setAddress("서울 잠실");
		
		for (int i = 0; i < employeeArr.length - 1; i++) {
			
			System.out.printf("emp[%d] : ", i);
			System.out.println(employeeArr[i].information());
		}

		System.out.println("==============================================================================");
		
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 연봉 = (급여 + (급여 * 보너스포인트)) * 12
		
		int sum = 0;
		
		for (int i = 0; i < employeeArr.length; i++) {
			
			int annualSalary = (int)(employeeArr[i].getSalary() * (1 + employeeArr[i].getBonusPoint()) * 12);
			sum += annualSalary;
			
			System.out.printf("%s의 연봉 : %d원\n", employeeArr[i].getEmpName(), annualSalary);
		}
		
		System.out.println("==============================================================================");
		
		// 3명의 직원의 연봉 평균을 구하여 출력
		
		int avg = sum / employeeArr.length;
		
		System.out.println("직원들의 연봉의 평균 : " + avg + "원");
	}

}
