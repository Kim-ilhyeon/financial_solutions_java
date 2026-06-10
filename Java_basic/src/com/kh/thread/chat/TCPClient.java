package com.kh.thread.chat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) {
		String serverIp = "localhost";
		int port = 3000;
		
		try {
			Socket socket = new Socket(serverIp, port);
			
			if (socket != null) {
				ClientReceive cr = new ClientReceive(socket);
				cr.start();
				
				ClientSend cs = new ClientSend(socket);
				cs.start();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
