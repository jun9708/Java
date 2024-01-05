package test3;
/*
 * 날짜 : 2024.01.04
 * 이름 : 김준형
 * 내용 : 클래스 연습문제
 */
class Car{
	private String brand;
	private String name;
	private String price;
	
	public Car(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price += price;
		
		
	}
	public void drive() {
		System.out.println(name+ "운행 중 ....");
	}
	public void info() {
		System.out.println("브랜드 : " +brand);
		System.out.println("차량명 : " +name);
		System.out.println("가격 : " +price);
	}
}

public class Test03{
	public static void main(String[] args) {
		Car sonata = null;
		Car bmw = null;
		
		sonata = new Car("현대","소나타",3000); //생성자 생성
		bmw = new Car("bmw","520d",3000);
		
		sonata.drive();
		sonata.info();
		
		bmw.drive();
		bmw.info();
	}
}