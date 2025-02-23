package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {

	public void practice() {
		
		/* 매개변수 생성자를 이용하여
		 * 2개의 Hero 객체 생성 후 필드 정보 출력.
		 * 객체가 가진 method를 적절히
		 * 호출하여 출력결과와 같게 만들기
		 */
		
		// 1) 매개변수 생성자를 이용하여 첫 번째 Hero 객체 생성 (사용 데이터 참고)
		Hero hero1 = new Hero("이구역짱", "전사", 200, 20, 1, 0);
		
		// 2) 매개변수 생성자를 이용하여 두 번째 Hero 객체 생성 (사용 데이터 참고)
		Hero hero2 = new Hero("Zi존위자드", "마법사", 100, 100, 1, 0);

		// 3) 객체가 가진 필드 값을 매개변수 생성자를 이용하여 객체 생성 시 출력
		
		// 4) 각 객체가 가진 method를 적절히 호출하여 출력결과와 같이 출력
		System.out.println("===========" + hero1.getNickname() + " 시점===========");

		hero1.attack(100.0);
		hero1.attack(50.5);
		hero1.attack(49.5);
		hero1.dash();
		hero1.dash();
		hero1.dash();
		
		System.out.print(hero1);
		
		System.out.println("===========" + hero2.getNickname() + " 시점===========");
		
		hero2.attack(300.0);
		hero2.dash();
		hero2.attack(300.0);
		hero2.attack(300.0);
		
		System.out.print(hero2);		
	}
}
