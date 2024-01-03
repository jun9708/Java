package sub5;

public class Truck extends Car {
	private int caparcity;
	
	public Truck(String name, String color, int speed, int caparcity) {
		super(name, color, speed); //부모클래스 생성자 호출
		this.caparcity = caparcity;

	}	
	public void load(int capacity) {
		this.caparcity += capacity;
	}
	
	@Override
	public void speedDown(int speed) {
		this.speed -= speed -10;
	}
	
	public void show() {
		super.show();
		System.out.println("적재용량 : " +this.caparcity);
	}
	
}
