package sub2;

public class Account {
	
	//속성
	private String bank;
	private String id;
	private String name;
	private int balance;
	
	//생성자
	public Account(String bank, String name, int balance) {
        this.bank = bank;
        this.name = name;
        this.balance = balance;
	}
	
	//기능
	public void desposite(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		balance -= money;
	}
	public void show() {
		System.out.println("은행명 : " +this.bank);
		System.out.println("계좌번호 : " +this.id);
		System.out.println("입금주 : " +this.name);
		System.out.println("현재잔액 : " +this.balance);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
