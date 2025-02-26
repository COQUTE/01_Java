package com.hw1.model.dto;

public class Poetry extends Book {

	private int numberOfPoems; // 시 수
	
	public Poetry() {}
	
	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}

	public int getNumberOfPoems() {
		return numberOfPoems;
	}

	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}

	@Override
	public void displayinfo() {
		System.out.printf("[시집] 제목 : %s / 저자 : %s / 시 수 : %d\n", getTitle(), getAuthor(), numberOfPoems);
	}

}
