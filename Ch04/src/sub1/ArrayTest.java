package sub1;
/*
 * ��¥ : 2023.12.26
 * �̸� : ������
 * ���� : �迭 �ǽ��ϱ�
 */
public class ArrayTest {
	public static void main(String[] args) {
		//�迭
		int[] arr1 = {1, 2, 3, 4, 5};
		char[] arr2 = {'A', 'B', 'C',};
		String[] arr3 = {"����", "����", "�뱸", "�λ�", "����"};
		
		//�������
		System.out.println("arr1[0] : " +arr1[0]);
		System.out.println("arr1[2] : " +arr1[2]);
		System.out.println("arr1[3] : " +arr1[3]);
		
		System.out.println("arr2[C] : " +arr2[2]);
		
		System.out.println("arr3[�λ�] : " +arr3[3]);
		
		//�迭 ����
		System.out.println("arr1 ���Ұ��� : " +arr1.length);
		System.out.println("arr2 ���Ұ��� : " +arr2.length);
		System.out.println("arr3 ���Ұ��� : " +arr3.length);
		
		//�迭 �ݺ���
		for(int i=0; i<arr1.length ; i++) {
			System.out.print(arr1[i]+" ");
		}
			System.out.println();
		
		//*�� ������ �迭 �ݺ���
		for(int n : arr1) {
			System.out.print(n + " ");
		}
		System.out.println();
		for(char j : arr2) {
			System.out.print(j + " ");
		}
		System.out.println();
		for(String z : arr3) {
			System.out.print(z + " ");
		}
		System.out.println();
		//1����
		int[] scores = {80, 60, 78, 62, 92};
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		System.out.println("1���� �迭�� : " +sum);
		
		//2����
		int[][] arr2d = { 	{1,	2,	3,	4},
							{5,	6,	7,	8},
							{9,	10,	11,	12} };
		
		//3, 5, 11 ���
		System.out.print(arr2d[0][2]+" ");
		System.out.print(arr2d[1][0]+" ");
		System.out.print(arr2d[2][2]+" ");
		
		//��ü ��¹�
		for(int a = 0; a<3 ; a++) {
			for(int b = 0 ; b<4 ; b++) {
				System.out.println("arr2d["+a+"]["+b+"] : " +arr2d[a][b]);
			}
		}
		
		//3����
		int[][][] arr3d = {{{1,2,3},{4,5,6},{7,8,9}},
						   {{10,11,12},{13,14,15},{16,17,18}},
						   {{19,20,21},{22,23,24},{25,26,27}}};
		//5, 17, 25 ���
		System.out.println(arr3d[0][1][1]);
		System.out.println(arr3d[1][2][1]);
		System.out.println(arr3d[2][2][0]);
		
		for(int c = 0; c<3 ; c++) {
			for(int d = 0 ; d<3 ; d++) {
				for( int e = 0 ; e<3 ; e++) {
					System.out.println("arr3d["+c+"]["+d+"]["+e+"]"+arr3d[c][d][e]);
				}
			}
		}
		
	}
}
