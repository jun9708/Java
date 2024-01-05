package test3;
/*
 * 	날짜 : 2024.01.04
 * 	이름 : 김준형
 * 	내용 : 디형성  연습문제
 */
class Product {
	protected String category;
	protected int price;
	
	public Product(String category, int price) {
		this.category = category;
		this.price = price;
	}
	public void info() {} //Television 클래스에 오버라이드가 있기떄문에 info가 정의되어 있어야함
}

class Television extends Product{
	public Television(String category, int price) {
		super(category, price);
	}
	@Override
	public void info() {
		System.out.println("제품분류 : " +category);
		System.out.println("제품가격 : " +price);
	}
}
class Computer extends Product{

	public Computer(String category, int price) {
		super(category, price);
	}

	@Override
	public void info() {
		System.out.println("제품분류 : " +category);
		System.out.println("제품가격 : " +price);
	}

}

public class Test08 {
	public static void main(String[] args) {
		Product p1 = new Television("가전", 100);
		Product p2 = new Computer("컴퓨터", 150);
		
		p1.info();
		p2.info();
	}
}
 