package com.kh.example.collection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController {
	// 필드
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();

	// 메소드
	public boolean insertObject(Lottery l) {
		boolean result = lottery.add(l);
		return result;
	}

	public boolean deleteObject(Lottery l) {
		boolean result = lottery.remove(l);
		
		if (result && win != null) {
			win.remove(l);
		}
		return result;
	}
	
	public HashSet<Lottery> winObject() {
		List<Lottery> list = new ArrayList<>(4);
		list.addAll(lottery);
		if (lottery.size() >= 4) {
			while (win.size() < 4) {	
				int random = (int)(Math.random() * (list.size()-1) + 1);
				win.add(list.get(random));
				list.remove(random);
			}
			return win;
		} else {
			return null;
		}
	}
	
	public TreeSet<Lottery> sortedWinObject () {
		return null;
	}
	
	public boolean searchWinner(Lottery l) {
		return false;
	}

}
