package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test2.db");
			
			byte[] array = {10, 20, 30};
			
			os.write(array); //배열의 모든 바이트를 출력
			
			os.flush(); //내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
			os.close(); //츨력 스트림을 닫아서 사용한 메모리 해제
			//메소드 호출시에는 괄호()필수
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
