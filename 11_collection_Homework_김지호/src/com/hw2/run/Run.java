package com.hw2.run;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {

		// Zoo 객체 생성
		Zoo zoo = new Zoo();
		
		// Tiger 객체 생성하여 zoo에 추가하기
		Tiger tiger = new Tiger();
		zoo.addAnimal(tiger); // Tiger -> Animal 업캐스팅
		
		// Monkey 객체 생성하여 zoo에 추가하기
		Monkey monkey = new Monkey();
		zoo.addAnimal(monkey); // Monkey -> Animal 업캐스팅
		
		// 동물원 메뉴 출력하여 입력한 값 대로 코드 수행하기
		zoo.displayMenu();
	}

}
