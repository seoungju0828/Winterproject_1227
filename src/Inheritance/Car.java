package Inheritance;

public class Car {
	
	String maunfacturer;
	String name;
	int displacement;
	
	public Car() {
		super();
		System.out.println("(Car) 생성자 호출 됨");
	}
	
	public void start() {
		System.out.println("(Car) 시동을 걸다");
	}

	public Car(String maunfacturer, String name, int displacement) {
		super();
		this.maunfacturer = maunfacturer;
		this.name = name;
		this.displacement = displacement;
		
		System.out.println("(Car) String maunfacturer, String name, int displacement");
	}

}
