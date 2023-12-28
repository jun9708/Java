package sub1;

/*
 * 날짜 : 2023/12/26
 * 이름 : 김준형
 * 내용 : Ch01, Java 개발환경 구축 실습
 */

public class Hello {

	public static void main(String[] args) {
		
		// 기본출력
		System.out.println("Hello world");
		System.out.println("Hello Java");
		
		//한줄출력
		System.out.print("Hello");
		System.out.print("Korea");
		System.out.println("Busan");
		
		//개행처리
		System.out.print("\nWelcome");
		
		System.out.println();
		
		int a = 3;
		int b = 2;
		
		double answer = 0;
		double result = 0;
		
		answer = (double)a/b;
		result = answer * 1000;
		
		System.out.println(answer);
		
	}
}