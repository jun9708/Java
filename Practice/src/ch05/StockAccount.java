package ch05;

public class StockAccount extends Account {
	
	private String stock;
	private int amount;
	private int price;
	
	public StockAccount(String bank, String id, String name, int balance, String stock, int amount, int price) {
		super(bank, id, name, balance);
		
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		this.balance += amount * price;
	}
	
}
