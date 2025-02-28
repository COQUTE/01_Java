package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.dto.Person;

public class SetService {
	
	/* Set(집합, 주머니)
	 * - 기본적으로 순서를 유지하지 않음
	 *   (index 없음! -> get() 메서드가 없음)
	 * 
	 * - 중복 데이터 저장 X
	 * 
	 * Set 인터페이스의 자식 클래스
	 * 1. HashSet(대표) : 처리 속도가 빠른 Set
	 * 2. LinkedHashSet : 순서를 유지하는 Set
	 * 3. TreeSet : 자동 정렬되는 Set
	 */
	
	public void method1() {
		
		// HashSet 객체 생성
		Set<String> set = new HashSet<>();
		//Set<String> set = new TreeSet<>();
		//Set<String> set = new LinkedHashSet<>();
		
		// 1. boolean add(E e) : 추가
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		
		System.out.println(set);
		// -> HashSet 순서 유지 X 확인
		// -> TreeSet 자동 정렬 O 확인
		// -> LinkedHashSet 순서 유지 O 확인
		
		// 중복 저장 확인 -> 중복 저장 X 확인
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		
		System.out.println(set);
		
		// null도 중복 X 확인
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		// 2. int size() : Set에 저장된 객체의 수 반화
		System.out.println("set의 size() : " + set.size());
		
		// 3. boolean remove(E) :
		// 전달받은 매개변수 e를 Set에서 제거
		// 제거 성공 true, 없으면 false
		System.out.println(set.remove("배달의민족"));
		System.out.println(set);
		System.out.println(set.remove("유플러스"));
		
		// 4. boolean contains(E e) :
		// 전달받은 e가 Set에 있으면 true, 없으면 false
		System.out.println("쿠팡 있는지 검사 : " + set.contains("쿠팡"));
		System.out.println("삼성 있는지 검사 : " + set.contains("삼성"));
		
		// 5. void clear() : Set에 저장된 내용을 모두 삭제
		set.clear();
		
		// 6. boolean isEmpty() : 비어있으면 true, 아니면 false
		System.out.println(set.isEmpty());
		System.out.println(set);
		
		
	}
	
	/**
	 * Set에 저장된 요소(객체)를 꺼내는 방법
	 * 
	 * 1. Iterator(반복자) 이용
	 * 2. List로 변환
	 * 3. 향상된 for문 이용
	 * 
	 */
	public void method2() {
		
		Set<String> set = new HashSet<String>();
		
		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠크다스");
		set.add("빈츠");
		set.add("포카칩");
		
		// 1. Iterator (반복자)
		// - 컬렉션 객체에 저장된 요소를
		//   하나씩 순차 접근하는 객체
		System.out.println("[Iterator 이용]");
		// Iterator set.iterator() :
		// - 현재 Set을 순차 접근할 수 있는 Iterator 객체 반환
		Iterator<String> it = set.iterator();
		
		// boolean Iterator.hasNext() :
		// 다음 순차 접근할 요소가 있으면 true, 없으면 false
		while(it.hasNext()) {
			// 다음 요소가 있으면 반복, 없으면 멈춤
			
			// E Iterator.next() : 다음 요소를 꺼내와 반환
			String temp = it.next();
			System.out.println(temp);
		}
		
		System.out.println("--------------------------------------------");
		
		System.out.println("[List로 변환]");
		
		// Set에 저장된 객체를 이용해서 List를 생성
		List<String> list = new ArrayList<>(set);
		// 1. 빈 List 객체 생성
		// 1. addAll() 메서드나 생성자 등을 이용해서 Set의 요소들을 List에 추가
		// 3. 변환 완료
		
		// 일반 for문
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------------------------------");
		
		System.out.println("[향상된 for문]");
		
		for (String snack : set) {
			System.out.println(snack);
		}
	}
	
	/**
	 * 직접 만든 클래스(Person)를 이용해 만든 객체를
	 * Set에 저장(중복 제거 확인)
	 * 
	 */
	public void method3() {
		
		// *******************************************
		// Hash라는 단어가 포함된 컬렉션 이용시
		// hashCode(), equals() 오버라이딩 필수적으로 진행되어야 함!!!!
		// *******************************************
		
		Person p1 = new Person("홍길동", 25, '남');
		Person p2 = new Person("홍길동", 25, '남');
		Person p3 = new Person("홍길동", 30, '남');
		Person p4 = new Person("김길순", 20, '여');
		
		// Set 객체 생성 후 p1 ~ p4 추가
		Set<Person> personSet = new HashSet<>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		
		for(Person p : personSet) {
			System.out.println(p);
		}
		
		// - 같은 필드 값을 가진 객체는 해시코드 번호가 같다!
		System.out.println("p1 : " + p1.hashCode());
		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		// A.equals(B) : A와 B가 가지고 있는 필드값이 전부 같다면 true
		System.out.println(p1.equals(p2)); // true
		System.out.println(p1.equals(p3)); // false
	}
	
	/**
	 * TreeSet 이용한 로또번호 생성기
	 * -> 기본 오름차순 정렬
	 * 
	 * * TreeSet 안에 저장되는 객체는 Comparable 인터페이스 상속 필수
	 * -> Integer는 Comparable 상속 되어있음
	 */
	public void method4() {
		
		// Integer를 저장할 TreeSet 객체 생성
		Set<Integer> lotto = new TreeSet<Integer>();
		
		// 난수 생성
		// 1) Math.random()
		// 2) Random.nextInt(10) : 임의의 정수 값 생성
		//		0~9 범위 내 정수 반환
		
		// Random 객체 생성
		Random random = new Random();
		
		// lotto에 저장된 값이 6개 미만이면 반복
		// == 6개 멈춤
		while(lotto.size() < 6) {
			
			// 1 ~ 45 범위 난수 발생
			lotto.add(random.nextInt(45) + 1);
		}
		
		System.out.println(lotto);
	}
	
	/**
	 * <h1>로또 번호 생성기</h1>
	 * 
	 * 금액을 입력받아 (천원 단위)
	 * 1000원 당 1회 씩 번호를 생성해서 List에 저장한 후
	 * 생성 종료 시 한 번에 출력
	 * 
	 * <pre>
	 * 금액 입력 : 3000
	 * 
	 * 1회 : [11, 20, 34, 35, 42, 43]
	 * 2회 : [1, 12, 22, 33, 35, 44]
	 * 3회 : [5, 6, 24, 43, 44, 45]
	 * </pre>
	 */
	public void lottoNumberGenerator() {
		
		// 스캐너 필요!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 입력 : ");
		int amount = sc.nextInt();
		
		Random random = new Random();
		
		// 생성된 로또 번호 묶음(TreeSet)을 저장할 List 객체 생성
		List<Set<Integer>> lottoList = new ArrayList<Set<Integer>>();
		
		// for문 반복될 때마다 새로운 TreeSet 객체 생성
		for(int i = 0; i < amount / 1000; i++) {
			
			Set<Integer> lotto = new TreeSet<Integer>();
														// 내립차순
//			Set<Integer> lotto = new TreeSet<Integer>(Comparator.reverseOrder());
			
			while(lotto.size() < 6) {
				lotto.add(random.nextInt(45) + 1); // 1 ~ 45 사이 난수 발생
			}
			
			lottoList.add(lotto);
		}
		
		// 출력용 반복문
		for(int i = 0; i < lottoList.size(); i++) {
			System.out.println((i + 1) + "회 : " + lottoList.get(i));
		}
	}
}
