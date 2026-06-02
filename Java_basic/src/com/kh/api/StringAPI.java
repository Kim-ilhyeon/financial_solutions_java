package com.kh.api;

import java.util.StringTokenizer;

public class StringAPI {
	public void method1 () {
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2.toString());
		// String 클래스에서 toString()메소드를 오버라이딩 하고 있다.
		// => 그래서 참조변수 출력 시 Object의 toString()이 아닌 문자열을 반환하는 String의 toString()이 호출됨.
		
		System.out.println(str1 == str2);	// 주소값을 비교하기 때문에 false가 출력됨.
		
		System.out.println(str1.equals(str2));
		// Object의 equals()메소드는 주소값 비교하는 메소드 이지만, String 클래스에서 실제 값을 비교하도록 오버라이딩(재정의) 되어있음.
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// hash는 원본비교에 유리하다.(버전 비교 느낌) -> 실제 값을 가지고 본인만의 알고리즘을 가지고 만드는 값
		// -> 즉, String클래스에서 오버라이딩(재정의) 한 메소드이다.
		
		// 메모리 값 기반으로 해시값을 보고싶다.
		// SYstem.identityHashCode(참조변수);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		// 2. 문자열을 리터럴 값으로 생성
		String str3 = "hello";
		String str4 = "hello";
		// 문자열 리터럴 사용 시 상수풀영역에 문자열을 생성.
		// String pool : 동일한 문자열을 중복해서 가지지 않는다. -> 동일한 리터럴이 있는 경우 같은 것을 가리키는 참조변수를 만든다.
		
		str3 = str3 + " world";
		// 상수풀에 "hello world"라는 값이 새로 생김.
		str4 = "bye";
		// String 리터럴의 특성 상 참조변수에 값을 변경하는 순간, 기존 문자열 메모리에 값을 변경하는 게 아니라
		// 상수이기 때문에 새로운 값을 String pool에 만들고 참조하도록 한다. (= 불변성)	
	}
	
	
	public void method2 () {
		String str1 = "Hello World";
		
		// 문자열.charAt(index) : char
		// => 문자열에서 전달받은 index위치의 문자를 추출
		char ch = str1.charAt(6);
		System.out.println("ch : " + ch);
		
		// 문자열.contains(키워드) : boolean
		// => 문자열에 전달된 키워드가 포함되어 있는지 여부를 확인
		boolean bl1 = str1.contains("llo");
		boolean bl2 = str1.contains("bye");
		System.out.println("str1에서 llo키워드 포함여부 : " + bl1);
		System.out.println("str1에서 bye키워드 포함여부 : " + bl2);
		
		// 문자열.substring(시작위치, [끝 위치]);
		// => 문자열을 시작위치부터 끝위치-1 까지 추출해서 반환
		System.out.println(str1.substring(6));	// index6부터 끝까지 추출
		System.out.println(str1.substring(6, 9));	// index 6 ~ 8까지 추출
		
		// 문자열.replace(대상문자, 변경할문자) : String
		// 문자열에서 대상문자를 찾아 변경할 문자로 치환한 후 변경된 문자열을 반환
		System.out.println(str1.replace('l', 'c'));
		
		System.out.println("모든 문자열 대문자 : " + str1.toUpperCase());
		System.out.println("모든 문자열 소문자 : " + str1.toLowerCase());
		
		// 문자열.trim();
		// 문자열의 앞뒤 공백을 제거
		String str5 = "		Hello		World		";
		System.out.println(str5.trim());
		
		// 문자열.toCharArray()
		// => 문자열을 문자배열로 변환
		char[] cArr = str1.toCharArray();
		for (char c : cArr) {
			System.out.print(c + " ");
		}
	}
	
	
	public void method3 () {
		String str = "Java,Oracle,sql,html,css,jd,jsp,Spring";
		
		// 구분자(,)를 기준으로 문자열을 분리시키는 법
		
		// 방법1. 분리된 문자열을 String[]에 차곡차곡 담아야 할 때
		// 문자열.split(구분자) : String[]
		String[] sArr = str.split(",");
		for (String s : sArr) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// 분리된 문자열 배열을 다시 String으로 연결하는 방법
		// String.join(구분자, 배열)
//		String result = "";
//		for(String s : sArr) {
//			result += s;
//			result += ", ";
//		}
//		System.out.println(result);
		String str2 = String.join(",", sArr);
		System.out.println(str2);
		
		// 방법2. 분리된 문자열을 각각 토큰으로 관리하는 방법
		// 문자열 토큰화 : StringTokenizer
		StringTokenizer stn = new StringTokenizer(str, ",");
		System.out.println(stn.countTokens());	// 토큰의 남은 갯수
		
		System.out.println(stn.nextToken());	// 하나 빼기
		System.out.println(stn.nextToken());	// 하나 빼기
		System.out.println(stn.nextToken());	// 하나 빼기
		System.out.println(stn.nextToken());	// 하나 빼기
		System.out.println(stn.nextToken());	// 하나 빼기
		System.out.println(stn.nextToken());	// 하나 빼기
		System.out.println(stn.nextToken());	// 하나 빼기
		System.out.println(stn.nextToken());	// 하나 빼기
//		System.out.println(stn.nextToken());	// 더이상 토큰이 남아있지 않아서 다음 토큰 호출 시 예외 발생 [NoSuchElementException 예외 발생]
		
		System.out.println(stn.countTokens());	// 토큰의 남은 갯수
		System.out.println();
		
		stn = new StringTokenizer(str, ",");
		int size = stn.countTokens();
		for (int i = 0; i < size; i++) {
			System.out.println(stn.nextToken());
		}
		System.out.println();

		stn = new StringTokenizer(str, ",");
		System.out.println(stn.hasMoreElements());	// 남은 토큰이 있는지 true/false
		while (stn.hasMoreElements()) {
			System.out.println(stn.nextToken());
		}
		System.out.println();
		
	}
	
	
}
