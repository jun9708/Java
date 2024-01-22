package test;

public class practice {
	public static void main(String[] args) {
		int a =1;
		float b = 3.14f;
		boolean c =true;
		
		int result = 0;
		for(int k = 1 ; k <=10 ; k++ ){
			if(k%2==1) {
			result += k;
			}
		}
		System.out.println(result);
	}
}
