package c06.sec10.exam02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info = "info";
	
	static {
		info = company + "-" + model;
	}
}
