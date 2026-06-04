package com.kh.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Run {
	/*
	 * 컬렉션
	 * : 자료구조 개념이 내장되어 있는 인터페이스로 자바에서 기본으로 제공.
	 * 
	 * - 자료구조 : 데이터를 효율적으로 관리(추가, 조회, 수정, 삭제, 정렬)할 수 있도록 해주는 구조.
	 */
	public static void main(String[] args) {
		/*
		 * List(순서O, 중복O)
		 * - ArrayList(배열 기반)
		 * - LinkedList(노드 기반)
		 * - Vector
		 * - Stack(Vector 기반, FILO=LIFO구조) 
		 */
		List list = new ArrayList();	// 제네릭설정을 안했으므로 자료타입은 Object이다.
//		List list = new ArrayList(10);	// 원하는 크기가 있다면 처음에 지정 가능!
		System.out.println(list);	// [툴력] : [] -> toString()이 오버라이딩(재정의) 되어있다.
		
		// 1. add(E e) : 자료구조 마지막(끝)에 전달된 데이터를 추가한다.
		list.add(new Human("이무진", 25));
		list.add(new String("이무진"));	// 여러가지 타입을 저장할 수 있다.
		list.add(new Human("이창섭", 30));
		list.add(new Human("임재현", 29));
		
		System.out.println(list);	// list를 출력하면 각 요소의 toString()을 활용해서 출력
		// 지정된 크기보다 많이 추가해도 에러발생x, 	장점1. 크기제약이 없다.
		// 다양한 타입의 데이터를 담을 수 있음. 		장점2. 여러 타입을 보관할 수 있다.
		
		// 2. add(int index, E e) : 직접 인덱스를 지정해서 해당 위치에 데이터를 추가할 수도 있다.
		list.add(1, new Human("김일현", 26));
		System.out.println(list.toString());
		
		// 3. remove(int index) : 해당 인덱스 위치의 데이터를 삭제
		list.remove(1);
		System.out.println(list);
		
		// 4. remove(E e) : 객체를 직접 지정해서 삭제 가능
		list.remove("이무진");
		System.out.println(list);	// String("이무진") 정상삭제
		
		list.remove(new Human("이무진", 25));	
		System.out.println(list);	// Human클래스의 오버라이딩(재정의)된 equals메소드로 비교를 하게 됨. -> 개발자가 따로 작성해야됨.
		
		// 5. set(int index, E e) : 해당 인덱스의 값을 전달받은 e객체로 덮어씌움.
		list.set(0, new Human("이무진", 25));
		System.out.println(list);
		
		// 6. size() : 리스트의 길이를 반환한다.
		System.out.println(list.size());
		
		// 7. get(int index) : 해당 인덱스의 요소를 반환한다.
		System.out.println(list.get(1));
		
		// 8. addAll(Collection c) : 컬렉션을 구현하는 모든 자료구조는 통째로 뒤에 추가 가능하다.
		List sub = new ArrayList();
		sub.add(new Human("이창섭", 30));
		sub.add(new Human("김일현", 26));
		
		list.addAll(sub);
		System.out.println(list);
//		list.addAll(1, sub);	// 중간부터 추가도 가능하다.
		
		// 9. isEmpty() : boolean -> 컬렉션이 비어있는지 확인
		System.out.println(list.isEmpty());
		System.out.println("--------------------");
		
//		// 10. clear() : 컬렉션의 모든 요소를 삭제
//		list.clear();
//		System.out.println(list.isEmpty());
//		System.out.println(list);
		
		// 리스트 전체 접근 방법
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=== 구분선 ===");
		
		for (Object ob : list) {
			System.out.println(ob);
		}
		
		// Stack (Vector 기반), FILO/LIFO 구조
		Stack<String> st = new Stack<>();
		
		
		// 1. push() : 데이터 추가
		st.push("첫번째");
		st.push("두번째");
		st.push("세번째");
		
		System.out.println(st);
		
		// 2. peek() : 맨 위에 데이터를 확인 (자료구조 안에서 데이터가 남아있음)
		System.out.println(st.peek());
		System.out.println(st);
		
		// 3. pop() : 데이터를 자료구조에서 꺼낸다. (자료구조 안에는 꺼낸 데이터는 남아있지 않음)
		String data = st.pop();
		System.out.println(data);
		System.out.println(st);		// 데이터를 꺼내오고 난 후에는 그 데이터가 Stack자료구조에서는 삭제된다.
		
		// 4. search(E e) : 데이터 검색 후 존재하면 위치 반환 (여기서 위치는 위에서부터 1부터 센다.) / 존재하지 않을 경우 -1 반환
		st.push("세번째");
		System.out.println(st.search("첫번째"));
		
		// Stack전체 꺼내기
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
		
	}

}
