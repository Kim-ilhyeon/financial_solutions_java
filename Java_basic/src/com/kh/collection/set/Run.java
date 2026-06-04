package com.kh.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Run {

	/*
	 * Set
	 * - 중복이 허용되지 않고, 순서가 없는 자료수조.
	 * (index 개념이 없어서 위치기반 접근이 불가하다.)
	 * - HashSet : 일반적인 해시 알고리즘 기반의 set
	 * - LinkedHashSet : HashSet + 순서 유지
	 * - TreeSet : 자동 정렬 기능 제공
	 */
	public static void main(String[] args) {
		// 생성
//		Set set = new HashSet();
		Set<Human> set = new HashSet<>();	// 제네릭 사용 가능!!
		
		// 데이터 추가
		set.add(new Human("김일현", 25));
		set.add(new Human("김명현", 30));
		set.add(new Human("김명현", 45));
		set.add(new Human("김일현", 25));
		
		System.out.println(set);
		// set에 저장해서 사용하는 객체는 내부적으로 동일 객체인지 판단여부를 equals와 hashCode메소드를 통해 진행한다.
		// (둘다 오버라이딩이 필요하다.) -> hashCode()로 분류 후 equals()로 비교함.
		
		Human h1 = new Human("김명현", 30);
		Human h2 = new Human("김명현", 22);
		
		// contains(E e) : set구조에 포함여부 확인하는 메소드
		System.out.println("김명현이 존재 하는가? : " + set.contains(h1));
		System.out.println("김명현이 존재 하는가? : " + set.contains(h2));
		
		// remove(E e) : set구조 내에서 객체를 통한 제거
		set.remove(h1);
		System.out.println(set);
		System.out.println(set.size());
		
		// set의 모든 요소에 접근하는 방법
		// 1. for-each 반복문
		for (Human h : set) {
			System.out.println(h);
		}
		
		System.out.println("==== 구분선 ====");
		
		// 2. List에 담아서 활용
		List<Human> list = new ArrayList<>();	// 빈 리스트
		list.addAll(set);
		for (int i = 0; i < set.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==== 구분선 ====");

		// 3. Iterator(반복자 인터페이스)를 활용
		// 컬렉션에 저장된 요소를 순차적으로 접근하기 위해 존재하는 인터페이스.
		// (순서가 없는 set같은 요소를 탐색하기 위해서 필요함)
		
		// hasNext() : 다음으로 확인할 요소가 있는가?
		// next() : 다음 요소를 반환
		Iterator<Human> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("==== 구분선 ====");
		
		
	}

}
