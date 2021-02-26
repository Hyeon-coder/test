package net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * 최초작성자 : 이주현
 * 최초작성일 : 2021-02-26
 * 최종변경일 : 2021-02-26
 * 목적 : 오류 수정
 */

public class MyClient {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1", 5000));
			System.out.println("MyServer에 접속되었습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// socket을 닫아야 합니다.
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
