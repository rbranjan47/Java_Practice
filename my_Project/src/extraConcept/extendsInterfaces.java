package extraConcept;

public class extendsInterfaces implements interfaceTasks {

	int numofWheels = 2;
	double theSpeed = 0;

	int carStrength = 0;

	// get wheel
	@Override
	public int getWheel() {

		return this.numofWheels;
	}

	// set wheel
	@Override
	public void setWheel(int numWheel) {
		this.numofWheels = numWheel;

	}

	// get speed
	@Override
	public double getSpeed() {
		return this.theSpeed;
	}

	// set wheel
	@Override
	public void setSpeed(double speed) {
		this.theSpeed = speed;

	}

	public extendsInterfaces(int wheels, int speed) {
		this.numofWheels = wheels;
		this.theSpeed = speed;
	}

	public static void main(String[] args) {
		extendsInterfaces usedInterfaceObject = new extendsInterfaces(4, 100);
		System.out.println("num of wheels: " + usedInterfaceObject.numofWheels);
		System.out.println("speed: " + usedInterfaceObject.theSpeed);

	}
}
