package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {
	
	// Map : Key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	// (Key : Value) -> Entry라고 부름
	
	// - Key를 모아두면 Set의 특징(중복 X)
	// - Value를 모아두면 List의 특징(중복 O)
	
	public void ex1() {
		
		// HashMap<K, V> : Map의 자식 클래스 중 가장 대표되는 Map
		Map<Integer, String> map = new HashMap<>();
		
		// Map.put(Integer Key, String Value) : 추가
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");
		
		// key 중복 테스트
		map.put(1, "김지호"); // 중복 허용 X, 대신 Value 덮어쓰기
		
		// value 중복 테스트
		map.put(7,  "박길동"); // 중복 허용 O
		
		System.out.println(map); // Map.toString() 오버라이딩 되어있음
	}
	
	public void ex2() {
		
		// Map 사용 예제
		
		// VO/DTO(값 저장용 객체)는 특정 데이터 묶음의 재사용이 많은 경우 주로 사용함.
		// -> 재사용이 적은 VO는 오히려 코드 낭비
		// -> Map을 이용해서 VO와 비슷한 코드를 작성할 수 있음
		
		// 1) VO 버전
		Member member = new Member();
		
		// 값세팅
		member.setId("userId");
		member.setPw("pass01");
		member.setAge(30);
		
		// 값출력
		System.out.println(member.getId());
		System.out.println(member.getPw());
		System.out.println(member.getAge());
		
		// 2) Map 버전
		Map<String, Object> map = new HashMap<>();
		// value가 Object 타입 == 어떤 객체든 Value에 들어올 수 있다!
		
		// 값세팅
		map.put("id",  "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
		// 값출력
		// Object(Value) Map.get(String Key)
		// : 매개변수로 전달받은 Key와 대응되는 Value 반환
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("age"));
		
		System.out.println("-----------------------------------------------");
		
		// ** Map에 저장된 데이터 순차적으로 접근하기 **
		// {"id"="user02", "pw"="pass02", "age"=25}
		
		// Map에서 Key만 모아두면 Set의 특징을 가진다 (중복저장 X)
		// -> 이를 활용해서 Map에서 keySet() 메서드 제공
		// -> Key만 모아서 Set으로 반환
		
		Set<String> set = map.keySet(); // id, pw, age 저장된 Set 반환
		
		System.out.println("keySet() : " + set);
		
		// 향상된 for문
		for(String key : set) {
			System.out.println(map.get(key));
		}
		
		// map에 저장된 데이터가 많거나(반복 필요)
		// 어떤 key가 있는지 불분명할 때(향상된 for문)
		// 또는 map에 저장된 모든 데이터에 접근해야 할 때
		// keySet() + 향상된 for문 코드 사용
	}
	
	public void ex3() {
		// List에 Map 여러개 추가하여 다루기
		
		// List 객체 생성
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		// List 객체만 생성되었고, 해당 list에는 Map만 들어올 수 있음을 제한함!
		// -> Map 객체는 아직 생성 X
		
		for(int i = 0; i < 10; i++) {
			
			// Map 객체 생성
			Map<String, Object> map = new HashMap<String, Object>();
			
			// Map에 데이터 추가
			map.put("id", "user0" + i);
			map.put("pw", "pass0" + i);
			
			// Map을 List에 추가
			list.add(map);
			// HashMap은 순서를 보장하지 않는 자료구조!
			// 순서를 유지하고 싶으면 LinkedHashMap 이용하면 된다!
			// -> LinkedHashMap은 put한 순서를 유지 시켜줌.
		}
		
		// for문 종료 시 list에 10개의 Map 객체가 추가되어 있다!
		System.out.println(list);
		
		// 향상된 for문 이용하여 key가 "id"에 대응되는 value값 전부 출력하기
		for(Map<String, Object> temp : list) {
			System.out.println(temp.get("id"));
		}
	}
}
