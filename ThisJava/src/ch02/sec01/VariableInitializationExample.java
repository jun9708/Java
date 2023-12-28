package ch02.sec01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		//변수 선언
		int	hour=3;
		int minute=5;
		System.out.println(hour+"시간 "+minute+"분");
		
		//연산 결과를 변수 result의 초기값으로 대입
		int totalMinute =(hour*60) + minute;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println("총 "+totalMinute+ " 분");
	}
}
