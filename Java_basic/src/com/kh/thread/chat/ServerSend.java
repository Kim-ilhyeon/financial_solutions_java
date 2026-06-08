package com.kh.thread.chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSend extends Thread {
	
	private Socket socket;

	public ServerSend(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		// 클라이언트로 메세지를 계속 보내기
		
		try (Scanner sc = new Scanner(System.in);
				PrintWriter pw = new PrintWriter(socket.getOutputStream());) {
			
			while (true) {
				System.out.print("cli로 보낼 내용 : ");
				String sendMsg = sc.nextLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
