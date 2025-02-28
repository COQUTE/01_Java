package com.hw2.model.dto;

public class Monkey extends Animal {

	public Monkey() {}

	public Monkey(String name) {
		super(name);
	}
	
	@Override
	public void sound() {
		System.out.println("원숭이가 우끼끼 소리를 냅니다.");
	}
}
