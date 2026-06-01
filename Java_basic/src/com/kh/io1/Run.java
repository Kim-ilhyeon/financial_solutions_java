package com.kh.io1;

import java.io.File;
import java.io.IOException;

public class Run {
	/*
	 * 간단하게 파일/폴더 생성, 정보 확인
	 * java.io.File 클래스를 활용 -> Java코드에서 파일/폴더/경로를 다루는 객체
	 * 
	 * 상대 경로
	 * : 현재 내 위치 기준으로 정해진 경로
	 * ex) 
	 * ./~	: .(지금 내 위치)
	 * 
	 * 절대 경로
	 * : 특정 기준점을 바탕으로 정해진 경로
	 * 
	 * ex)
	 * C://~ D://~, /root/~
	 */
	public static void main(String[] args) {
		// 1. 경로 지정 없이 객체를 생성 (상대 경로 - 현재 작업 폴더 기준)
		File f1 = new File("test.txt");
		
		File f2 = new File("C:\\test.txt");

		File f3 = new File("C:\\tmp\\test.txt");
		
		try {
			f1.createNewFile();		// f1 파일 객체의 정보를 기준으로 실제 파일을 만들어줘.
			f2.createNewFile();
//			f3.createNewFile();		// 존재하지 않는 경로로 생성 시 예외 -> IOException
			
			
			File tmpForder = new File("C\\tmp");
			tmpForder.mkdir();	// 폴더 생성 함수 mkdir();
			f3.createNewFile();
			
			File f4 = new File("ttt.txt");	// 먼저 경로에 있는 파일이 있는지 확인하고, 있다면 해당 파일의 정보를 가져와서 객체를 만듬.
			
			System.out.println("파일 존재 여부 : " + f4.exists());
			
			System.out.println("파일 여부 : " + tmpForder.isFile());
			System.out.println("파일 여부 : " + f4.isFile());
			
			System.out.println("파일명 : " + f4.getName());
			System.out.println("파일 경로 : " + f4.getAbsolutePath());
			System.out.println("파일 용량 : " + f4.length());
			System.out.println("파일의 상위 폴더 : " + f4.getParent());
		} catch (IOException e) {	// f1파일 객체의 정보를 기준으로 실제 파일을 만들어줘
			e.printStackTrace();
		}

	}

}
