package com.kh.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAPI {
	public void method () {
		/*
		 * 1. java.util.Date
		 * : 자바 초기부터 사용하던 날짜, 시간 클래스
		 * (현재는 직접 사용을 권장하지 않음.)
		 * 이유
		 * - 연도 계산이 불편함 : 실제년도 -1900를 해야함.
		 * - 월 계산도 불편함 : 실제 월 -1을 해야함.
		 * - 날짜 변경이 가능해서 안전하지 않음.
		 * - getter/setter 대부분 deprecated 처리됨.(=이전에는 많이 사용하였지만 이제는 딱히 권장하지 않아.라는 뜻)
		 */
		
		Date date1 = new Date();
		// 컴퓨터의 현재 날짜와 시간이 들어감.
		System.out.println("현재 Date : " + date1);
		
		// 원하는 날짜 만들기
		// 2026년 3월 1일
		// 연도 : 2026 -1900
		// 월 : 3 - 1
		// 일 : 1
		
		Date date2 = new Date(2026-1900, 3-1, 1);
		System.out.println("지정한 날짜 : " + date2);
		
		// 날짜, 시간을 변경
		// setter를 사용해서 변경
		date2.setYear(2025-1900);
		date2.setMonth(5-1);
		date2.setDate(2);
		date2.setHours(12);
		date2.setMinutes(30);
		date2.setSeconds(15);
		
		System.out.println("시간까지 변경된 Date : " + date2);
		System.out.println("연도 : " + (date2.getYear() + 1900) + "년");
		
		/*
		 * 2. LocalDateTime (java8부터)
		 * : 날짜, 시간 클래스 (날짜, 시간을 함께 표현함)
		 * 
		 * 특징
		 * - 연도, 월을 있는 그대로 사용함
		 * - 날짜/시간 계산이 편함
		 * - 객체가 불변이라 안전함
		 * - 실제로 많이 사용됨.
		 */
		LocalDateTime now = LocalDateTime.now();
		// 현재 날짜와 시간
		
		System.out.println("날짜 및 시간 : " + now);
		
		// 특정 날짜와 시간으로 생성
		// 2025년 5월 25일 12시 39분 15초
		LocalDateTime date3 = LocalDateTime.of(2025, 5, 25, 12, 39, 15);
		System.out.println("지정한 날짜 및 시간 : " + date3);
		
		/*
		 * 날짜 / 시간 계산
		 * plusDays(10); -> 10일 뒤
		 * minusHours(5) -> 5시간 전
		 * 
		 * LocalDateTime은 원본객체를 바꾸지 않고, 계산 결과를 새로운 객체로 반환
		 */
		System.out.println("date3의 17일 뒤 : " + date3.plusDays(17));
		System.out.println("date3의 원본 : " + date3);
		
		// 날짜와 시간 분리
		LocalDate onlyDate = date3.toLocalDate();
		LocalTime onlyTime = date3.toLocalTime();
		
		System.out.println("날짜만 : " + onlyDate);
		System.out.println("시간만 : " + onlyTime);
		
		/*
		 * 날짜/시간 포멧팅
		 * 
		 * yyyy : 연도
		 * MM : 월
		 * dd : 일
		 * HH : 시
		 * mm : 분
		 * ss : 초
		 */
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 MM분 ss초");
		String formatDate = date3.format(formatter);
		System.out.println(formatDate);
	}
	
	
	
	
	
}
