package com.kh.example.collection1;

import java.util.Objects;

public class Music {
	// 필드
	private String title;	// 곡명
	private String singer;	// 가수 명
	
	// 생성자
	public Music() {
		super();
	}
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	
	// 메소드
	public int compareTo(Object o) {
		return 0;
	}
	
	
	
	// getter / setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Music) {
			Music m = (Music)obj;
			return this.title.equals(m.getTitle()) && this.singer.equals(m.getSinger());
		}
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// Objects.hash(비교한 필드값1, 2 . .필드값1 .);
		// 비교값을 통한 해시코드를 만들어 주는 메소드
		return Objects.hash(title, singer);
	}
	@Override
	public String toString() {
		return this.singer + " - " + this.title;
	}
	
	
	
	
}
