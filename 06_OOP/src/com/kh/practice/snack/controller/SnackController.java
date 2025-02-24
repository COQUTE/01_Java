package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

// Controller : 사용자의 요청을 받아서 처리하고, 그 입력에 따라
// Model(데이터처리, 비즈니스 로직)과 View(화면 출력)를 연결해주는 역할
public class SnackController {

	private Snack s = new Snack();
	
	// 기본 생성자
	public SnackController() {}
	
	// 데이터를 setter를 이용해 저장하고
	// 저장완료되었다는 결과를 반환하는 메소드
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장 완료되었습니다.\n" + 
				"저장한 정보를 확인하시겠습니까?(y/n): ";
	}
	
	// 저장된 데이터를 반환하는 메소드
	public String confirmData() {
		
		return s.information();
	}
}
