package com.hw.model.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.hw.model.dto.Toy;

// 장난감 공장을 모델링하고, 장난감 관리 기능을 제공하는 서비스 클래스입니다.
public class ToyFactory {
	
	/* 1. 전체 장난감 조회하기: 공장에 있는 모든 장난감의 정보를 출력
	 * 2. 새로운 장난감 만들기: 새로운 장난감을 추가하고, 사용자가 입력한 정보로 객체를 생성
	 * 3. 장난감 삭제하기: 공장에서 장난감을 삭제
	 * 4. 장난감 제조일 순으로 조회하기: 장난감을 제조일에 따라 정렬하여 출력
	 * 5. 연령별 사용 가능한 장난감 리스트 조회하기: 사용 가능한 연령을 입력받고, 해당하는 장난감을 출력
	 * 6. 재료 추가: 새로운 재료를 등록하고, 장난감에 해당 재료를 추가
	 * 7. 재료 제거: 등록된 재료를 삭제하고, 해당하는 재료를 사용하는 장난감에서 제거
	 */

	private Scanner sc;
	
	// 장난감 목록 Set
	private Set<Toy> toySet;
	
	// 재료 Map
	// Integer, String 모두 이미 hashcode(), equals() 메서드들이 오버라이딩 된 객체
	private Map<Integer, String> material; // 고유번호와 재료명으로 이루어진 재료
	
	public ToyFactory() {
		Scanner sc = new Scanner(System.in);
		material = new HashMap<Integer, String>(); // 재료 Map 할당
		
		// 기본 등록된 재료 추가
		material.put(1, "면직물");
		material.put(2, "플라스틱");
		material.put(3, "유리");
		material.put(4, "고무");
		
		toySet = new HashSet<Toy>(); // 장난감 목록 Set 할당
		
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", material.get(1), material.get(4)));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", material.get(1), material.get(2)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", material.get(1), material.get(2)));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", material.get(1), material.get(2)));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", material.get(1), material.get(2), material.get(4)));
		
	}
	
	public void displayMenu() {
		
		
		int menuNum = 0;
		
		try {
			do {
				System.out.println("\n<<플레이타임 공장>>");
				System.out.println("1. 전체 장난감 조회하기");
				System.out.println("2. 새로운 장난감 만들기");
				System.out.println("3. 장난감 삭제하기");
				System.out.println("4. 장난감 제조일 순으로 조회하기");
				System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
				System.out.println("6. 재료 추가");
				System.out.println("7. 재료 제거");
				
				System.out.print("선택 : ");
			
				menuNum = sc.nextInt();
				sc.nextLine(); // 버퍼 제거
				
				switch(menuNum) {
				// 전체 장난감 조회하기
				case 1: selectAll();
				break;
				
				// 새로운 장난감 만들기
				case 2: createToy();
				break;
				
				// 장난감 삭제하기
				case 3: 
				break;
				
				// 장난감 제조일 순으로 조회하기
				case 4: 
				break;
				
				// 연령별 사용 가능한 장난감 리스트 조회하기
				case 5:
				break;
				
				// 재료 추가
				case 6: 
				break;
				
				// 재료 제거
				case 7: 
				break;
				
				case 0: System.out.println("시스템 종료"); break;
				default: System.out.println("메뉴에 없는 번호입니다.");
				}
				
			} while(menuNum != 0);
			
		} catch (InputMismatchException e) { // 잘못 입력된 경우, 오류 catch
			System.out.println("잘못된 입력입니다.");
		} finally {
			sc.close();
		}
	}
	
	public void selectAll() {
		
		try {
			int num = 1;
			
			for(Toy toy : toySet)
				System.out.println(num++ + ". " + toy);
			
		} catch(NullPointerException e) {
			System.out.println("조회할 장난감이 없습니다.");
		}
	}
	
	public void createToy() {
		// Unchecked Exception인 InputMismatchException은 자동으로 throws 됨
		
		System.out.println("새로운 장난감 추가");	
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		String date = sc.next();
		
		
	}
}
