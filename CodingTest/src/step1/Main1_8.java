package step1;

import java.util.Scanner;

public class Main1_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if(A >= 2 && A <= 10000 && B >= 2 && B <= 10000 && C >= 2 && C <= 10000) {
			int rs1 = (A+B)%C;
			int rs2 = ((A%C) + (B%C))%C;
			int rs3 = (A*B)%C;
			int rs4 = ((A%C) * (B%C))%C;

			System.out.println(rs1);
			System.out.println(rs2);
			System.out.println(rs3);
			System.out.println(rs4);
		}else {
			System.out.println("재입력");
		}
	}
}
