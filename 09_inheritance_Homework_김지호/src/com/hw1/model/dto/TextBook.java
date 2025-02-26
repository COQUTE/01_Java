package com.hw1.model.dto;

public class TextBook extends Book {

	private String subject; // 과목
	
	public TextBook() {}
	
	public TextBook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void displayinfo() {
		System.out.printf("[전문 서적] 제목 : %s / 저자 : %s / 과목 : %s\n", getTitle(), getAuthor(), subject);
	}

}
