package sub1;

public class Account {
    private String accountNum;
    private String name;
    private int cash;

    public Account(String accountNum, String name, int cash) {
        this.accountNum = accountNum;
        this.name = name;
        this.cash = cash;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            cash += amount;
        } else {
            System.out.println("다시 입력하세요");
        }
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && cash >= amount) {
            cash -= amount;
            return true;
        } else {
            return false; 
        }
    }
}