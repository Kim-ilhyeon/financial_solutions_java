package com.kh.example.collection1;

import java.util.ArrayList;
import java.util.List;

public class MusicController {
	// 필드
	private final List<Music> list = new ArrayList<>();
	
	
	// 메소드
	public int addList(Music music) {
		boolean result = list.add(music);
		if (result) {
			return 1;
		}
		return 0;
	}
	
	public int addAtZero(Music music) {
		if (music == null) {
			return 0;
		}
		list.add(0, music);
		boolean result = music.equals(list.get(0));
		if (result) {
			return 1;
		}
		return 0;
	}
	
	public List<Music> printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		for (Music m : list) {
			if (title.equals(m.getTitle())) {
				return m;
			}
		}
		
		return null;
	}
	
	public Music removeMusic(String title) {
		for (Music m : list) {
			if (title.equals(m.getTitle())) {
				int index = list.indexOf(m);
				if (index == -1) {
					return null;
				}
				list.remove(index);
				return m;
			}
		}
		
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for (Music m : list) {
			if (title.equals(m.getTitle())) {
				int index = list.indexOf(m);
				if (index == -1) {
					return null;
				}
				list.set(index, music);
				return m;
			}
		}
		
		return null;
	}
	
	public int ascTitle() {
//		list.sort(((o1, o2) -> o1.getTitle().compareTo(o2.getTitle())));
		AscTitle at = new AscTitle();
		int result = at.compare(at, at);
		
		return result;
	}
	
	public int descSinger() {
		return 0;
	}
	
	
}
