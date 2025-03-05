package com.hw.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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

	private Scanner sc =new Scanner(System.in);
	
	// 장난감 목록 Set
	private Set<Toy> toySet;
	
	// 재료 Map
	// Integer, String 모두 이미 hashcode(), equals() 메서드들이 오버라이딩 된 객체
	private Map<Integer, String> materialMap; // 고유번호와 재료명으로 이루어진 재료
	
	public ToyFactory() {
		materialMap = new HashMap<Integer, String>(); // 재료 Map 할당
		
		// 기본 등록된 재료 추가
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");
		
		toySet = new HashSet<Toy>(); // 장난감 목록 Set 할당
		
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", materialMap.get(1), materialMap.get(4)));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", materialMap.get(1), materialMap.get(2)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", materialMap.get(1), materialMap.get(2)));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", materialMap.get(1), materialMap.get(2)));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", materialMap.get(1), materialMap.get(2), materialMap.get(4)));
		
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
				case 3: deleteToy();
				break;
				
				// 장난감 제조일 순으로 조회하기
				case 4: selectByDate();
				break;
				
				// 연령별 사용 가능한 장난감 리스트 조회하기
				case 5: selectByAge();
				break;
				
				// 재료 추가
				case 6: addMaterials();
				break;
				
				// 재료 제거
				case 7: deleteMaterial();
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
		
		if(toySet.isEmpty()) {
			System.out.println("장난감 목록이 비어있습니다.");
			return;
		}

		System.out.println("\n<전체 장난감 목록>");
		
		int num = 1;
		
		for(Toy toy : toySet)
			System.out.println(num++ + ". " + toy);
			
	}
	
	public void createToy() {
		// Unchecked Exception인 InputMismatchException은 자동으로 throws 됨
		
		System.out.println("\n<새로운 장난감 추가>");	
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		for(Toy toy : toySet) {
			if(toy.getName().equals(name)) {
				System.out.println("이미 존재하는 장난감입니다.");
				return;
			}
		}
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		String date = sc.next();
		
		Set<String> materialSet = new HashSet<String>();
		
		String material = "q";
		
		do {
			System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
			material = sc.next();
			
			if(material.equalsIgnoreCase("q")) {
				
				if (materialSet.isEmpty()) { // 재료가 비어있는 경우
					System.out.println("재료가 최소 1개는 있어야 합니다.");
					
					return; // 장난감 만들기 취소
				}
				else // 재료가 1개 이상 있는 경우
					break; // 다음으로 진행
			}
			
			if(materialMap.containsValue(material)) {
				materialSet.add(material);
					
			} else
				System.out.println("존재하지 않는 재료입니다.");
		}while(!material.equalsIgnoreCase("q"));
		
		if(toySet.add(new Toy(name, age, price, color, date, materialSet))) {
			System.out.println("새로운 장난감이 추가되었습니다.");
		} else {
			System.out.println("추가 실패");
		}
	}
	
	public void deleteToy() {
		// Unchecked Exception인 InputMismatchException은 자동으로 throws 됨
		
		if(toySet.isEmpty()) {
			System.out.println("장난감 목록이 비어있습니다.");
			return;
		}
		
		System.out.print("삭제할 장난감의 이름을 입력하세요: ");
		String toyName = sc.next();
		
		for (Toy toy : toySet) {
			
			if(toy.getName().equals(toyName)) {
				
				if(toySet.remove(toy))
					System.out.println("장난감이 삭제되었습니다.");
				else
					System.out.println("장난감 삭제 실패");
				
				return;
			}
		}
		System.out.println("존재하지 않는 장난감입니다.");
	}
	
	public void selectByDate() {
		
		if(toySet.isEmpty()) {
			System.out.println("장난감 목록이 비어있습니다.");
			return;
		}
		
		System.out.println("\n<제조일 순으로 장난감을 정렬>");
		
		List<Toy> toyList = new ArrayList<Toy>();
		
		toyList.addAll(toySet);
		
		Collections.sort(toyList, new Comparator<Toy>() {

			@Override
			public int compare(Toy o1, Toy o2) {
				return o1.getDate().compareTo(o2.getDate());
			}
			
		});
		
		// 정렬 확인
//		for(Toy toy : toyList) {
//			System.out.println(toy);
//		}
		
		int num = 1;
		for(Toy toy : toyList) {
			System.out.println(num++ + ". " + toy);
		}
		
	}
	
	public void selectByAge() {
		
		if(toySet.isEmpty()) {
			System.out.println("장난감 목록이 비어있습니다.");
			return;
		}
		
		System.out.println("\n<연령별로 사용 가능한 장난감>");
		
		List<Toy> toyList = new ArrayList<Toy>();
		
		toyList.addAll(toySet);
		
		Collections.sort(toyList, new Comparator<Toy>() {

			@Override
			public int compare(Toy o1, Toy o2) {
				return o1.getAge() - o2.getAge();
			}
			
		});
		
		// 정렬 확인
//		for(Toy toy : toyList) {
//			System.out.println(toy);
//		}
		
		int num = 1;
		int age = 0;
		for(Toy toy : toyList) {
			
			if(age != toy.getAge()) {
				age = toy.getAge();
				
				System.out.println("[연령 : " + age + "세]");
			}
			
			System.out.println(num++ + ". " + toy);
		}
		
	}
	
	public void showMaterials() {
		
		System.out.println("---현재 등록된 재료---");
		
		// materialMap에 현재 등록된 재료들이 저장되어있음.
		// 순회하며 가져오기 위해서는 entry 값을 가져와야 함
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("----------------------");
	}
	
	public void addMaterials() {
		
		System.out.println("\n<재료 추가>");
		
		showMaterials();
		
		System.out.print("재료 고유번호(key) 입력 : ");
		int key = sc.nextInt();
		
		System.out.print("재료명 입력 : ");
		String name = sc.next();
		
		if(materialMap.containsKey(key)) {
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			
			System.out.println("덮어쓰시겠습니까? (Y/N) : ");
			String yn = sc.next();
			
			if(yn.equalsIgnoreCase("N")) // 덮어쓰지 않는 경우
				return;
			if(!yn.equalsIgnoreCase("Y")) { // Y를 제외한 다른 입력
				System.out.println("잘못된 입력입니다. 처음부터 다시 시도해주세요.");
				return;
			}
				
		}
		
		// 중복되는 재료가 없거나, Y를 입력했을 경우에만 실행되는 코드
		if(materialMap.put(key, name) == null) // key값이 매핑 되어있지 않은 경우
			System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		else // key값이 이미 매핑 되어있는 경우
			System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");
		
		// 제대로 작동했는지 확인
//		for(Entry<Integer, String> entry : materialMap.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
	}
	
	public void deleteMaterial() {
		
		if(materialMap.isEmpty()) {
			System.out.println("등록된 재료가 없습니다.");
			return;
		}
		
		System.out.println("\n<재료 삭제>");
		
		showMaterials();
		
		System.out.print("삭제할 재료명 입력 : ");
		String name = sc.next();
		
		if(materialMap.containsValue(name)) {
			
			for(Integer key : materialMap.keySet()) {
				if(materialMap.get(key).equals(name)) { // 입력한 이름이 동일할 경우
					
					System.out.println("재료 \"" + materialMap.remove(key) + "\"이/가 성공적으로 제거되었습니다.");
					
					// 제대로 작동했는지 확인
//					for(Entry<Integer, String> entry : materialMap.entrySet()) {
//						System.out.println(entry.getKey() + " : " + entry.getValue());
//					}
					
					return;
				}
			}
			
		} else
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
	}
}
