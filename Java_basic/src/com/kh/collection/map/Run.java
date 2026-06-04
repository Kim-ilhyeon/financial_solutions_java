package com.kh.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Run {

	/*
	 * Map
	 * : Key와 value를 쌍으로 저장하는 자료구조
	 * (key는 식별용도로 중복x, value는 값을 저장하는 것으로 중복을 허용)
	 * - HashMap : 보편적인
	 * - LinkedHashMap : 입력 순서를 보장
	 * - TreeMap : 자동 정렬Key 순서 보장
	 */
	public static void main(String[] args) {
		Map<Integer, Human> hMap = new HashMap<>(); 
		
		// 1. put() : Map구조에 key, value 쌍으로 값을 추가하는 메소드
		hMap.put(10, new Human("김일현", 15));
		hMap.put(20, new Human("김이현", 20));
		hMap.put(30, new Human("김삼현", 30));
		hMap.put(40, new Human("김사현", 40));
		hMap.put(50, new Human("김사현", 45));
		hMap.put(40, new Human("김오현", 50));	// 키를 기준으로 중복된 키값이 있는 경우 해당 키값의 value값을 덮어씌운다.
		System.out.println(hMap);	// 저장된 순서 보장이 안됨.
		
		// 2. get(key값) : 해당 key값을 통해 value를 반환.
		System.out.println(hMap.get(30));
		
		// 3. size() : 담겨있는 객체의 수를 반환
		System.out.println(hMap.size());
		
		// 4. remove(key값) : 해당 key값의 kwy값과 value값을 모두 제거
		hMap.remove(40);
		System.out.println(hMap.get(40));
		System.out.println();
		
		// map에 전체 요소에 접근하는 방법
		// for-each 이용X, index로 반복X, iterator 이용X
		// 다른 자료구조로 변경 후 반복 -> Set
		
		// 1. keySet() :  key를 모아서 Set자료구조 형태로 반환
		Set<Integer> ks = hMap.keySet();		// ks = key값만 모아둔 Set구조(10, 20, 30 ,50)
		System.out.println(ks);
				
		for (int key : ks) {
			System.out.println("키 : " + key + ", 값 : " + hMap.get(key));
		}
		System.out.println();
		
		// 2. entrySet()을 이용한 전체 탐색
		// Map은 Key와 Value를 쌍으로 저장 -> keySet()을 활용하면 Key만 가져옴.
		// Set이지만 Key, Value를 쌍으로 저장하는 하나의 자료구조
		// Set<Map.Entry<K,V>>
		Set<Entry<Integer, Human>> entrySet = hMap.entrySet();
		for (Entry e : entrySet) {
			System.out.println("키 : " + e.getKey() + ", 값 : " + e.getValue());
		}
		System.out.println();
		
		
	}

}
