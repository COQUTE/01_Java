package edu.kh.network.client.model.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientService {

	public void clientStart() {
		
		// 1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
		
		// String serverIP - InetAddress.getLocalHost().getAddress();
		// 1) 현재 컴퓨터의 로컬 IP 주소를 얻어오는 방법
		
		String serverIP = "127.0.0.1";
		// 2) loop back IP (현재 컴퓨터를 나타내는 IP)
		
		// ex) 서버 IP 주소 : 198.50.212.22
		// String serverIP = "198.50.212.22";
		// -> 다른 컴퓨터가 서버일때는
		//    그 컴퓨터의 IP 주소를 작성해야 한다!
		
		int port = 8500;
		
		Socket clientSocket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		Scanner sc = null;
		
		try {
			System.out.println("[Client]");
			
			clientSocket = new Socket(serverIP, port);
			
			// 2. 서버와의 입출력 스트림 오픈
			if(clientSocket != null) { // 서버와 연결에 성공한 경우
				
				is = clientSocket.getInputStream();
				os = clientSocket.getOutputStream();
				
				// 3. 보조 스트림을 통해 성능 개선
				br = new BufferedReader(new InputStreamReader(is));
				
				pw = new PrintWriter(os);
				
				// 4. 스트림을 통해 읽고 쓰기
				// 서버 -> 클라이언트에게 보낸 날짜 메시지를 한 줄 읽어와 콘솔창에 출력
				String serverMessage = br.readLine();
				System.out.println(serverMessage);
				
				// -----------------------------------
				
				// 클라이언트 -> 서버로 메시지 전송
				sc = new Scanner(System.in);
				
				System.out.print("서버로 전달할 메시지 : ");
				String str = sc.nextLine();
				
				pw.println(str); // 메시지를 클라이언트 -> 서버쪽으로 출력
				pw.flush();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			// 5. 통신 종료
			
			try {
				// 스트림/소켓 닫기
				if(br != null) br.close();
				if(pw != null) pw.close();
				
				if(clientSocket != null) clientSocket.close();
				
				if(sc != null) sc.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
