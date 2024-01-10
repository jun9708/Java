package sub5;

public class Apple {
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
	public void show() {
		System.out.println("----------------------------------------");
		System.out.println("원산자 : " +country);
		System.out.println("가격 : " +price);
		System.out.println("----------------------------------------");
	}
	
}
