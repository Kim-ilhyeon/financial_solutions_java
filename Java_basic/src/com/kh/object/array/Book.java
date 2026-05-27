package com.kh.object.array;

public class Book {
	// 필드
	private String title;
	private String genre; // 장르
	private String author;
	private int maxPage; // 페이지 수

	// 생성자
	public Book() {
		super();
	}

	public Book(String title, String genre, String author, int maxPage) {
		super();
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.maxPage = maxPage;
	}

	// 메소드
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getMaxPage() {
		return maxPage;
	}
	
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", genre=" + genre + ", author=" + author + ", maxPage=" + maxPage + "]";
	}
	
	
	

}
