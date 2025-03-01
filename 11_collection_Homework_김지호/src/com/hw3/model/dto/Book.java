package com.hw3.model.dto;

public class Book {

	private static int serialNum = 0000;
	private int id;				// 도서 번호
	private String name;		// 도서 제목
	private String author;		// 저자
	private int price;			// 가격
	private String publisher;	// 출판사
	
	public Book() {}

	// 시리얼 넘버로 자동적으로 id 생성해주는 생성자
	public Book(String name, String author, int price, String publisher) {
		serialNum += 1111;
		id = serialNum;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	// 모든 멤버변수 입력해줘야 하는 생성자
	public Book(int id, String name, String author, int price, String publisher) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return id + "번 도서 : [도서제목 : " + name + " / 도서저자 : " + author + " / 도서가격 : " + price + " / 출판사 : "
				+ publisher + "]";
	}
	
}
