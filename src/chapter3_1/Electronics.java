package chapter3_1;

public class Electronics {
	private int nVoltage;
	
	public Electronics() {
		this.nVoltage = 0;
	}
	
	public void turnOn(int nInputVoltage) {
		this.nVoltage = nInputVoltage;
	}
	
	public int getVoltage() {
		return this.nVoltage;
	}
}
