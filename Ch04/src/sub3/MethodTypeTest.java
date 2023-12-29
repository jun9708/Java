package sub3;
/*
 * 날짜 : 2023.12.29
 * 이름 : 김준형
 * 내용 : 메서드 형태 실습하기
 */
public class MethodTypeTest {
	public static void main(String[] args) {
		
		double y1 = type1(1.5);
		double y2 = type1(1.7);
		
		System.out.println("y1 : " +y1);
		System.out.println("y2 : " +y2);
		
		type2(true); //리턴할값이 없기떄문에 앞에 대입연산자 필요x
		type2(false); //리턴할값이 없기떄문에 앞에 대입연산자 필요x
		
		
		boolean result = type3();
		System.out.println(" result : " +result);
		
	}
	
	//형태1 - 매개변수 0, 리턴값 0
	public static double type1(double x) {
		
		double y = ( x * x ) + 3.14;
		return y;
		
	}
	
	
	//형태2 - 매개변수 0, 리턴값 x
	public static void type2(boolean status) {
		
		if(status) {
			System.out.println("참 입니다 ");
		}else {
			System.out.println("거짓 입니다");
		}
		
	}
	
	
	//형태3 - 매개변수 x, 리턴값 0
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	
	//형태4 - 매개변수 x, 리턴값 x
	public static void type4() {
		double result = type1(2.5);
		System.out.println("반지름 길이가 2.5인 원의 넓이 : " +result);
	}
	
}
