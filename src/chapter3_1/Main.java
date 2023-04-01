package chapter3_1;

public class Main {
	public static void main(String args[]) {
		Electronics b = new Electronics();
		b.turnOn(10);
		int a = b.getVoltage();
		
		System.out.println(a);
		
	}
}
