package sub3;
/*
 * ��¥ : 2023.12.29
 * �̸� : ������
 * ���� : �޼��� ���� �ǽ��ϱ�
 */
public class MethodTypeTest {
	public static void main(String[] args) {
		
		double y1 = type1(1.5);
		double y2 = type1(1.7);
		
		System.out.println("y1 : " +y1);
		System.out.println("y2 : " +y2);
		
		type2(true); //�����Ұ��� ���⋚���� �տ� ���Կ����� �ʿ�x
		type2(false); //�����Ұ��� ���⋚���� �տ� ���Կ����� �ʿ�x
		
		
		boolean result = type3();
		System.out.println(" result : " +result);
		
	}
	
	//����1 - �Ű����� 0, ���ϰ� 0
	public static double type1(double x) {
		
		double y = ( x * x ) + 3.14;
		return y;
		
	}
	
	
	//����2 - �Ű����� 0, ���ϰ� x
	public static void type2(boolean status) {
		
		if(status) {
			System.out.println("�� �Դϴ� ");
		}else {
			System.out.println("���� �Դϴ�");
		}
		
	}
	
	
	//����3 - �Ű����� x, ���ϰ� 0
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	
	//����4 - �Ű����� x, ���ϰ� x
	public static void type4() {
		double result = type1(2.5);
		System.out.println("������ ���̰� 2.5�� ���� ���� : " +result);
	}
	
}
