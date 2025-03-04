package com.hw.model.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// 장난감의 정보를 저장하고 관리하는 데이터 전송 객체(DTO)입니다.
public class Toy {

	/* 반드시 지켜야 할 사항
	 * 1. 장난감은 똑같은 재료를 중복으로 저장할 수 없다.
	 * -> 장난감의 사용 재료가 Set<String> 구조 (중복 저장X)
	 * 
	 * 2. 똑같은 장난감을 만들 수 없다.
	 * -> 장난감 객체(이름, 연령, 가격, 색상, 제조년월일, 사용재료)
	 * 
	 * 3. 장난감을 저장할 컬렉션에 중복된 장난감이 있어서는 안된다.
	 * -> 장난감 목록(컬렉션)이 중복 저장을 금지해야 한다.
	 * -> 장난감 목록의 자료구조는 Set<Toy> (중복 저장X)
	 * 
	 * 4. 재료는 { 고유번호 : 재료명 } 형식으로 작성되어 있어야 한다.
	 * 5. 재료의 고유번호는 중복될 수 없다.
	 * -> 재료의 자료구조는 Map (고유번호 = Key, 재료명 = Value)
	 * -> 키 값의 중복이 될 수 없기 때문.
	 * 
	 * 6. 재료 등록 시 이미 등록된 고유번호의 재료가 있으면, 덮어쓰겠냐는 질문을 하고 y/n으로 답변을 입력받아 처리해야 한다.
	 * 7. 재료 삭제 시 고유번호가 아닌, 재료명을 입력받아 같은 재료명이 있으면 삭제한다.
	 */
	
	// 주요 요소들
	private String name;	// 장난감 이름
	private int age;		// 사용연령
	private int price;		// 가격
	private String color;	// 색상
	private String date;	// 제조년월일
	
	// 사용재료 Set
	private Set<String> usedMaterial; // 재료 Map에서 꺼내온 재료명으로 이루어진 사용재료 Set
	
	public Toy() {
		usedMaterial = new HashSet<String>();
	}

	// 장난감을 만들 때, 사용된 재료들을 Set으로 저장 (중복 사용된 재료가 없게 하기 위함)
	// 그럼 처음 장난감 객체를 만들 때, 어떻게 초기화 하는 게 좋을까?
	// String 값을 넣어주면 바로 Set 안에 저장할 수 있게 하기 (가변인자 String... 사용)
	public Toy(String name, int age, int price, String color, String date) {
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.date = date;
	}

	public Toy(String name, int age, int price, String color, String date, String... strings) {
		this(name, age, price, color, date);
		
		usedMaterial = new HashSet<String>();
		
		for(String str : strings) {
			usedMaterial.add(str);
		}
	}
	
	public Toy(String name, int age, int price, String color, String date, HashSet<String> materialSet) {
		this(name, age, price, color, date);
		
		usedMaterial = materialSet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Set<String> getUsedMaterial() {
		return usedMaterial;
	}

	public void setUsedMaterial(Set<String> usedMaterial) {
		this.usedMaterial = usedMaterial;
	}

	@Override
	public String toString() {
		String result = String.format("이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d / 제조년월일 : %s / 재료 : ", name, price, color, age, date);
		
		for(String material : usedMaterial) {
			result += material;
		}
		
		return result;
	}
	
}
