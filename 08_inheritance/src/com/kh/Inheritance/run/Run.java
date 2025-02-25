package com.kh.Inheritance.run;

import com.kh.Inheritance.model.dto.BasicPhone;
import com.kh.Inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {

		// SmartPhone 객체 생성
				SmartPhone sp = new SmartPhone("Samsung", "Galaxy S20", 2020, 1200000, "Android", 128);
				
				// BasicPhone 객체 생성
				BasicPhone bp = new BasicPhone("Nokia", "3310", 2000, 100000, true);
				
				sp.printInfo();
				
				System.out.println("=======================================");
				
				bp.checkKeyboard();
	}

}
