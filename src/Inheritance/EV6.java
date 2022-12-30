package Inheritance;

public class EV6 extends KIA {
	
	int chargeBattery;
	String softwareModel;
	
	public EV6() {
		System.out.println("(EV6) 생성자 호출 됨");
	}
	
	public void driveAutonomously() {
		System.out.println("EV6가 자율주행 중 입니다");
	}
	
	@Override
	public void stop() {
		System.out.println("EV6가 주행을 멈췄습니다");
	}
	
	@Override
	public void turn(String direction) {
		System.out.println("EV6 자동차가 " + direction + "회전 했습니다");
	}

}
