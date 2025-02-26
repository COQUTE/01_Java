package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.dto.Animal;
import edu.kh.poly.ex2.model.dto.Fish;
import edu.kh.poly.ex2.model.dto.Person;

public class AbstractService {

	public void ex1() {
		
		// Animal 객체 생성
		//Animal a1 = new Animal();
		// Cannot instantiate the type Animal
		// -> 객체화 할 수 없음
		
		// 부모타입 참조변수로서의 역할은 가능하기 때문에
		// Animal을 상속받아 미완성 부분을 구체적으로 구현한
		// 자식 클래스를 이용해 객체 생성
		
		Person p1 = new Person();
		
		p1.setName("홍길동");
		p1.setType("척추동물 중 인간");
		p1.setEatType("잡식");
		
		Fish f1 = new Fish();
		
		f1.setType("척추동물 중 어류");
		f1.setEatType("잡식");

		System.out.println(p1.toString());
		System.out.println(f1.toString());
		
		// 추상클래스와 다형성 + 바인딩
		Animal a1 = new Person(); // 다형성 중 업캐스팅
		Animal a2 = new Fish();	  // 다형성 중 업캐스팅
		
		a1.ex();
		a1.breath();
		a1.move();
		a1.eat();
		
		a2.ex();
		a2.breath();
		a2.move();
		a2.eat();
		
	}
}
