package com.hw2.model.dto;

public class Tiger extends Animal {

	public Tiger() {}

	public Tiger(String name) {
		super(name);
	}
	
	@Override
	public void sound() {
		System.out.println("호랑이가 어흥하며 포효합니다.");
	}
}
