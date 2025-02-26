package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem {

	private Prisoner[] prisoners; // 전체 수용자 저장용 배열
	private int prisonerCount; // 수용자수
	
	/*
	 * 매개변수로 전달받은 size를 이용하여
	 * Prisoner 객체배열을 size 크기로 생성한다.
	 * prisonerCount는 0으로 초기화한다.
	 */
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}

	@Override
	public void addPerson(Person person) {
		
		if (prisonerCount == prisoners.length) {
			System.out.println("인원이 모두 충원되었습니다.");
		}
		
		prisoners[prisonerCount] = (Prisoner)person;
			
		System.out.print("수감자가 추가되었습니다 - ");
		System.out.println(prisoners[prisonerCount].getInfo());
		
		prisonerCount++;
	}

	@Override
	public void removePerson(String id) {
		
		boolean searchFlag = true;
		
		for (int i = 0; i < prisonerCount; i++) {
			
			if (prisoners[i].getId().equals(id)) { // 아이디가 같은 수감자를 찾은 경우
				
				System.out.print("수감자가 삭제되었습니다 - ");
				System.out.println(prisoners[i].getInfo());
				
				// 마지막 인덱스에 도착하거나 다음이 비어있는 경우(다음이 null인 경우)가 아니라면
				// 계속 당겨오게 설계
				while (true) {
					if (i + 1 == prisonerCount || prisoners[i + 1] == null) {
						prisoners[i] = null;
						
						prisonerCount--;
						
						searchFlag = false;
						
						break;
					}
					
					prisoners[i] = prisoners[i + 1];
					i++;
					
				}
			}
		}
		
		if (searchFlag)
			System.out.println("해당 id를 가진 수감자를 찾을 수 없습니다.");
		
	}

	@Override
	public void displayAllPersons() {
		
		System.out.println("전체 수감자 명단 :");
		
		for (Prisoner pri : prisoners) {
			
			if (pri == null)
				break;
			
			System.out.println(pri.getInfo());
		}
	}
	
	
}
