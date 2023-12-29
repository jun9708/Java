package sub4;
/*
 * 날짜 : 2023.12.28
 * 이름 : 김준형
 * 내용 : while 반복문
 */
public class WhileTest {
	public static void main(String[] args) {
		//1부터 10까지 합
		int sum = 0;
		int k  = 1;
		while(k <= 10 ) {
			sum += k;
			k++;
		}
		System.out.println("1부터 10까지 합 : " +sum);

		//1부터 10까지 홀수합
		int tot = 0;
		int j = 1;
		while( j <= 10) {
			if(j % 2 ==0) {
				tot += j;
			}
			j++;
		}
		System.out.println("1부터 10까지 홀수합" +tot);

		//do - while 최초로 한번 수행하는 반복문
		int eSum = 0;
		int i = 1;

		do {
		    if (i % 2 == 0) {
		        eSum += i;
		    }
		    i++;
		} while (i <= 10);

		System.out.println("1부터 10까지 짝수합: " + eSum);
		
		//break
		int num =1;
		while(true) {
			if(num%5==0&&num%7==0) {
				break;
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수 : " +num);		
		//continue
		int total = 0;
		int n = 1;

		while (n <= 10) {
		    n++;
		    if (n % 2 == 1) {
		        continue; // 홀수일 경우 루프 처음으로 이동
		    }
		    total += n; // 짝수일 경우에만 누적합 계산
		}

		System.out.println("1부터 10까지 짝수합: " + total);
	}
}