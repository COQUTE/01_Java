package com.hw.run;

import com.hw.model.service.ToyFactory;

/* 이 프로젝트는 ToyFactory을 모델링하고 그 공장에서의 장난감 관리를 자동화하는 Java 어플리케이션입니다.
 * 1. 장난감의 정보를 효과적으로 관리하고 출력할 수 있는 클래스를 구현.
 * 2. 사용자로부터 입력을 받고, 입력에 따라 적절한 동작을 수행하는 메서드를 작성
 * 3. 컬렉션을 활용하여 장난감 정보를 저장하고 관리
 * 4. 장난감의 제조일에 따라 정렬하고, 연령별로 사용 가능한 장난감을 출력하는 기능을 구현
 */

public class Run {

	public static void main(String[] args) {

		ToyFactory service = new ToyFactory();
		
		service.displayMenu();
	}

}
