package com.kh.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class ServeStream {
	// 프로그램 -> 파일 (출력)
	public void fileSave() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// 1. 기반 스트림 생성 -> 파일을 2바이트씩 내보낼 수 있는 스트림
			fw = new FileWriter("1_buffer.txt");			
			
			// 2. 보조 스트림 생성(기반스트림을 전달) -> 한줄씩 쓰기위한 버퍼 공간을 할당.
			bw = new BufferedWriter(fw);
			
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
			bw.newLine();
			bw.write("끝\n");
			bw.flush();	 // 강제로 다 내보냄.
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 파일 -> 프로그램
	public void fileRead() {
		// FileReader : 파일을 직접적으로 연결해서 2바이트 단위로 입력받을 수 있는 기반스트림
		// BufferedReader : 한줄씩 읽어오는 기능이 추가된 보조스트림
		
		try (BufferedReader br = new BufferedReader(new FileReader("1_buffer.txt"))) {
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());	// 파일의 모든 내용을 읽어오면 이후는 null이 반환됨.
			*/
			String text = "";
			do {
				text = br.readLine();
				if (text == null) {
					break;
				}
				System.out.println(text);
			} while (true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void fileSaveWithStream () {
		try {
			// 1. 기반스트림
			FileOutputStream fo = new FileOutputStream("2_buffer.txt");
			
			// 2. OutputStream스트림 기반의 Writer 스트림 생성
			OutputStreamWriter osw = new OutputStreamWriter(fo, "UTF-8");
			
			// 3. 보조 스트림 -> 한줄씩 쓰기위한
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
			bw.newLine();
			bw.write("끝\n");
			bw.flush();	// 강제로 다 내보냄.
			
		} catch (FileNotFoundException e) {	// IOException을 상속 받기 때문에 삭제 가능
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 직렬화
	 * 객체는 메모리 안에서 존재하는 인스턴스 개념이기 때문에 그대로 전송할 수 없음,
	 * 직렬화 후 이진데이터로 외부에 전송이 가능.
	 * - 객체(Object)를 바이트 형태로 변환하는 과정
	 * - 파일에 저장하거나 네트워크로 전송할 수 있도록 함.
	 * - Java에서는 클래스를 직렬화하기 위해직렬화 대상 클래스에게 Implements Serializable 해야 함.
	 * 
	 * 역직력화
	 * 저장해두거나 전송했던 데이터를 다시 원래 객체로 사용하기 위해 하는 행위.
	 * - 저장된 바이트데이터를 다시 객체로 복원.
	 */
	
	// 프로그램 -> 파일(출력) : 객체 직렬화
	public void objectSave () {
		Product p1 = new Product("갤럭시 s26", 1200000, "삼성");
		Product p2 = new Product("아이폰 17", 1500000, "애플");
		Product p3 = new Product("갤럭시 노트 12", 1300000, "삼성");
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Product1.txt"));) {
			oos.writeObject(p1);	// 객체를 파일에 저장
			oos.writeObject(p2);	// 객체를 파일에 저장
			oos.writeObject(p3);	// 객체를 파일에 저장
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 파일 -> 프로그램 객체 입력 : 역직렬화
	public void objectRead () {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Product1.txt"));) {
			while (true) {
				Object obj = ois.readObject();
				if (obj instanceof Product) {
					Product p1 = (Product)obj;
					System.out.println(p1);
				}
			}
			
		} catch (EOFException e) {
//			e.printStackTrace();
			System.out.println("끝까지 출력 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
