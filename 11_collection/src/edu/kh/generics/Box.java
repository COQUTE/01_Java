package edu.kh.generics;

// 제네릭 클래스 선언
public class Box<T> {
	// T는 타입 파라미터로,
	// 실제 사용 시 구체적인 타입(String, Integer 등)으로 변환됨
	private T item; // T 타입 변수 선언

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
