package com.hw1.model.dto;

public class Novel extends Book {

	private String genre; // 장르
	
	public Novel() {}
	
	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void displayinfo() {
		System.out.printf("[소설] 제목 : %s / 저자 : %s / 장르 : %s\n", getTitle(), getAuthor(), genre);
	}

}
