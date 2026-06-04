package com.kh.example.collection3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {
	// 필드
	Map<String, Member> map = new HashMap<>();
	
	// 메소드
	public boolean joinMember(String id, Member m) {
		boolean duplicateCheck = map.containsKey(id);
		if (!duplicateCheck) {
			map.put(id, m);
			return true;
		}
		return false;
	}
	
	public String logIn (String id, String password) {
		boolean duplicateCheck = map.containsKey(id);
		if (duplicateCheck) {
			Member mem = map.get(id);
			if (password.equals(mem.getPassword())) {
				return mem.getName();
			}
		}
		return null;
	}
	
	public boolean changePassword (String id, String oldPw, String newPw) {
		boolean duplicateCheck = map.containsKey(id);
		if (duplicateCheck) {
			Member mem = map.get(id);
			if (oldPw.equals(mem.getPassword())) {
				mem.setPassword(newPw);
				String newPassword = mem.getPassword();
				if (newPw.equals(newPassword)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void changeName (String id, String newName) {
		boolean duplicateCheck = map.containsKey(id);
		if (duplicateCheck) {
			Member mem = map.get(id);
			mem.setName(newName);
			String nName = mem.getName();
		}
	}
	
	public TreeMap<String, String> sameName (String name) {
		Set<Entry<String, Member>> set = map.entrySet();
		for (Entry<String, Member> s : set) {
//			boolean result = s.getValue().getName().equals(name);	// 여기부터 다시 수정해야됨
		}
		return null;
	}
	
	
	
}
