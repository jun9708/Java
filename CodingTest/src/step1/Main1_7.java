package step1;

import java.util.Scanner;

public class Main1_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int y = sc.nextInt();
		
		if(y>=1000 && y <=3000) {
			y += 543;
		}
		System.out.println(y);
	}
}

