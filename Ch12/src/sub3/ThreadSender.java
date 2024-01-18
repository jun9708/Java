package sub3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 	날짜 : 2024.01.17
 * 	이름 : 김준형
 *  내용 : 채팅프로그램 실습하기
 */
public class ThreadSender extends Thread {
	private Socket socket;

	public ThreadSender(Socket socket) {
		this.socket = socket;
	}


	@Override
	public void run(){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String msg = br.readLine();

				if(msg.equals("bye")) {
					break;
				}
				
				
				writer.println(msg);
				writer.flush();
				
				System.out.println(msg);
			}

		} catch (Exception e) {
		}finally {
			try {
				socket.close();				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
