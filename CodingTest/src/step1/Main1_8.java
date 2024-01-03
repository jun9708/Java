package step1;

import java.util.Scanner;

public class Main1_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int rs = num1 * num2;
		
		for(int i=3 ; i <= 6 ; i++) {
			
			int rs3= rs% 10;
			rs/=10;
			
			System.out.println(+i);
		}
		
	}
}
