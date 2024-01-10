package sub1;

public class Banana {
	
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		super();
		this.country = country;
		this.price = 0;
	}

	@Override
	public String toString() {
		return "Banana [country=" + country + ", price=" + price + "]";
	}
}
