package com.kh.thread.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceive extends Thread {
	private Socket socket;

	public ClientReceive(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		// 서버로부터 전달받은 메세지를 계속 출력
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
			
			while (true) {
				String msg = br.readLine();
				System.out.println("서버 : " + msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
