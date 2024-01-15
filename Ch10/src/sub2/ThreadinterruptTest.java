package sub2;
/*
 *	날짜 : 2024.01.15
 *	이름 : 김준형
 *	내용 : Java Thread 상태 실습하기
 */
class SubThread extends Thread {
	@Override
	public void run() {
		int i =1;
		
		try {
			while(true) {
				System.out.println(" i : " +i);
				
				i++;
				
				sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadinterruptTest {
	public static void main(String[] args) {
		
		SubThread sub = new SubThread();
		sub.setName("Sub");
		
		//자식 스레드 실행
		sub.start();
		
		try {
			//메인 스레드 10초 일시정지
			Thread.sleep(1000 * 10);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Main Thread 종료... ");
	}
}
