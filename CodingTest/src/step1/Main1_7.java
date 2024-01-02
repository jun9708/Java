package step1;

import java.util.Scanner;

public class Main1_7 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a>=1000 && a <=3000) {
			int y = a - 543;
			System.out.println(y);
		}else {
			System.out.println("재입력");
		}
	}
}

