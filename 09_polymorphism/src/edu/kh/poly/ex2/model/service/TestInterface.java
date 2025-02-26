package edu.kh.poly.ex2.model.service;

public interface TestInterface {

	public abstract int plus(int num1, int num2);
	
	public abstract String test();
	
	// Java 8 이후에는 디폴트 메서드(구현부가 있는 메서드)가 추가
	default void desplay() {
		System.out.println("TestInterface의 display()");
	}
}
