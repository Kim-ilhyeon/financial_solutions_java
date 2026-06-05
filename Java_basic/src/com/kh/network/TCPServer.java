package com.kh.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	/*
	 * TCP
	 * - 서버, 클라이언트와 1:1 소켓 통신
	 * - 데이터를 교환하기에 앞서 서버, 클라이언트 연결이 되어 있어야한다.
	 * (서버가 먼저 실행되어 있어야 클라이언트의 연결 요청을 받을 수 있음.)
	 * 
	 * Socket
	 * - 프로세스 간에 통신을 담당
	 * - input/outputStream을 가지고 있음(입출력이 가능)
	 * 
	 * ServerSocket
	 * - 포트와 연결되어 외부의 연결 요청을 기다림 -> 요청이 들어오면 수락해줌
	 * (수락해준다는 것은 통신할 수 있는 Socket생성되었다는 의미임)
	 */
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = null;
		BufferedReader br = null;
		
		// 1) 포트(port) 지정
		int port = 3000;
		
		try {
			// 2) ServerSocket 객체 생성 (port와 결합)
			ServerSocket server = new ServerSocket(port);
			
			System.out.println("클라이언트의 요청을 기다리는 중. . .");
			Socket socket = server.accept();
			
			InetAddress clientIp = socket.getInetAddress();
			System.out.println(clientIp.getHostAddress() + "가 연결을 요청함");
			
			// 입력용 스트림(클라이언트로부터 전달된 값을 읽기 위함)
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 출력용 스트림(클라이언트로 전달하기 위함)
			pw = new PrintWriter(socket.getOutputStream());
			
			while (true) {
				String msg = br.readLine();
				System.out.println("클라이언트 : " + msg);
				
				System.out.print("보낼 내용 : ");
				String sendMsg = sc.nextLine();
				pw.println(sendMsg);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		
	}
}
