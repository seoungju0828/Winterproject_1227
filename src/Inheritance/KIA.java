package Inheritance;

public class KIA extends Car {
	
	int modelNumber;
	String color;
	
	public KIA() {
		super("기아자동차", "기아", 2500);
		System.out.println("(KIA) 생성자 호출 됨");
	}
	
	public void drive() {
		System.out.println("KIA 자동차가 주행 중 입니다");
	}
	
	public void stop() {
		System.out.println("KIA 자동차가 멈췄습니다");
	}
	
	public void turn(String direction) {
		System.out.println("KIA 자동차가 " + direction + "회전 했습니다");
	}

}
