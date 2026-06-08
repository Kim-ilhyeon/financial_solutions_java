package com.kh.thread.chat;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

// 입출력을 동시에 할 수 있는 서버를 만들어보자
public class TCPServer {
	public static void main(String[] args) {
		// 1) 포트 지정
		int port = 3000;
		try {
			ServerSocket server = new ServerSocket(port);
			
			System.out.println("클라이언트의 요청을 기다리는 중. . .");
			Socket socket = server.accept();
			
			InetAddress clientIp = socket.getInetAddress();
			System.out.println(clientIp.getHostAddress() + "가 연결을 요청함. . .");
			
			ServerReceive
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
