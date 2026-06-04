package com.kh.example.collection1;

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
			return this.title.equals(((Music) obj).getTitle()) && this.singer.equals(((Music) obj).getSinger());
		}
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	
	
	
}
