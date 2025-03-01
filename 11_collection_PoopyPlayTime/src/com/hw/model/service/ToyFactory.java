package com.hw.model.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

	// 장난감 목록 Set
	private Set<Toy> toySet;
	
	// 재료 Map
	// Integer, String 모두 이미 hashcode(), equals() 메서드들이 오버라이딩 된 객체
	private Map<Integer, String> material; // 고유번호와 재료명으로 이루어진 재료
	
	public ToyFactory() {
		material = new HashMap<Integer, String>(); // 재료 Map 할당
		
		// 기본 등록된 재료 추가
		material.put(1, "면직물");
		material.put(2, "플라스틱");
		material.put(3, "유리");
		material.put(4, "고무");
		
		toySet = new HashSet<Toy>(); // 장난감 목록 Set 할당
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805"));
	}
}
