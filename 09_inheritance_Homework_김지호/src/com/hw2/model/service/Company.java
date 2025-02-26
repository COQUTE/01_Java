package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {

	private Employee[] employees; // 전체 직원 저장용 배열
	private int employeeCount; // 직원수
	
	/*
	 * 매개변수로 전달받은 size를 이용하여
	 * Employee 객체배열을 size 크기로 생성한다.
	 * employeeCount는 0으로 초기화한다.
	 */
	public Company(int size) {
		employees = new Employee[size];
		employeeCount = 0;
	}

	/*
	 * 추상메서드를 상속받아 오버라이딩 해야하는 메서드.
	 * 매개변수로 전달받은 Person 객체가 Employee 클래스의 
	 * 인스턴스이며, 배열에 공간이 있다면, 해당 객체를
	 * employees 배열에 추가 후 추가된 객체의 정보를 출력. 
	 * 만약 배열에 더 이상 공간이 없다면, 인원이 모두 충원되었다는 메시지 출력
	 */
	@Override
	public void addPerson(Person person) {
			
		if (employeeCount == employees.length) {
			System.out.println("인원이 모두 충원되었습니다.");
		}
		
		employees[employeeCount] = (Employee)person;
			
		System.out.print("직원이 추가되었습니다 - ");
		System.out.println(employees[employeeCount].getInfo());
		
		employeeCount++;
			
	}

	/*
	 * 추상메서드를 상속받아 오버라이딩 해야하는 메서드.
	 * 매개변수로 전달받은 id와 일치하는 직원을 찾으면,
	 * 해당 직원을 삭제하고 관련 정보를 출력.
	 * 일치하는 id가 없다면 해당 id를 가진 직원을 찾을 수 없다는 메시지를 출력
	 */
	@Override
	public void removePerson(String id) {
		
		boolean searchFlag = true;
		
		for (int i = 0; i < employeeCount; i++) {
			
			if (employees[i].getId().equals(id)) { // 아이디가 같은 직원을 찾은 경우
				
				System.out.print("직원이 삭제되었습니다 - ");
				System.out.println(employees[i].getInfo());
				
				// 마지막 인덱스에 도착하거나 다음이 비어있는 경우(다음이 null인 경우)가 아니라면
				// 계속 당겨오게 설계
				while (true) {
					if (i + 1 == employeeCount || employees[i + 1] == null) {
						employees[i] = null;
						
						employeeCount--;
						
						searchFlag = false;
						
						break;
					}
					
					employees[i] = employees[i + 1];
					i++;
					
				}
			}
		}
		
		if (searchFlag)
			System.out.println("해당 id를 가진 직원을 찾을 수 없습니다.");
		
	}

	/*
	 * 추상메서드를 상속받아 오버라이딩 해야하는 메서드.
	 * 전체 직원 명단을 출력하는 기능
	 */
	@Override
	public void displayAllPersons() {
		
		System.out.println("전체 직원 명단 :");
		
		for (Employee emp : employees) {
			
			if (emp == null)
				break;
			
			System.out.println(emp.getInfo());
		}
	}
	
	
}
