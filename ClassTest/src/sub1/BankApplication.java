package sub1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
	private static List<Account> accountList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 |");
			System.out.println("-------------------------------------------");

			System.out.print("선택 > ");

			int select = sc.nextInt();
			sc.nextLine(); 

			switch (select) {
			case 1:
				createAccount(sc);
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit(sc);
                break;
            case 4:
                withdraw(sc);
				break;
			case 5:
				System.out.println("프로그램 종료");
				sc.close();
				return;
			default:
				System.out.println("다시 입력해주세요");
			}
		}
	}

	static void createAccount(Scanner sc) {
		System.out.println("-------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------");
		System.out.print("계좌번호: ");
		String accountNum = sc.nextLine();

		System.out.print("계좌주: ");
		String name = sc.nextLine();

		System.out.print("초기입금액: ");
		int cash = sc.nextInt();
		sc.nextLine(); 

		Account newAccount = new Account(accountNum, name, cash);


		accountList.add(newAccount);

		System.out.println("계좌가 생성되었습니다.");
	}

	static void accountList() {
		System.out.println("-------------------------------------------");
		System.out.println("게좌조회");
		System.out.println("-------------------------------------------");
		if (accountList.isEmpty()) {
			System.out.println("계좌 목록이 비어 있습니다.");
		} else {
			System.out.println("계좌 목록:");
			for (Account account : accountList) {
				System.out.println("계좌번호: " + account.getAccountNum()+
						", 예금주: " +account.getName()+ 
						", 잔액: " + account.getCash());
			}
		}
	}

	static void deposit(Scanner sc) {
		System.out.println("-------------------------------------------");
		System.out.println("입금");
		System.out.println("-------------------------------------------");
		System.out.print("계좌번호: ");
		String accountNum = sc.nextLine();

		System.out.print("예금액: ");
		int depositAmount = sc.nextInt();
		sc.nextLine(); // 개행 문자 처리

		Account account = findAccount(accountNum);

		if (account != null) {
			account.deposit(depositAmount);
			System.out.println("예금이 완료되었습니다. 현재 잔액: " + account.getCash());
		} else {
			System.out.println("계좌를 찾을 수 없습니다.");
		}
	}

	static void withdraw(Scanner sc) {
		
		System.out.println("-------------------------------------------");
		System.out.println("출금");
		System.out.println("-------------------------------------------");
		System.out.print("계좌번호: ");
		String accountNum = sc.nextLine();

		System.out.print("출금액: ");
		int withdrawAmount = sc.nextInt();
		sc.nextLine(); 
		Account account = findAccount(accountNum);

		if (account != null) {
			if (account.withdraw(withdrawAmount)) {
				System.out.println("출금이 완료되었습니다. 현재 잔액: " + account.getCash());
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else {
			System.out.println("계좌를 찾을 수 없습니다.");
		}
	}

	static Account findAccount(String accountNum) {
		for (Account account : accountList) {
			if (account.getAccountNum().equals(accountNum)) {
				return account;
			}
		}
		return null;
	}
}

