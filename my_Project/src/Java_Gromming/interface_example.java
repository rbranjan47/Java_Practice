package Java_Gromming;

interface vehicle{
	void change_gear(int a);
	void speedUp(int a);
	void applyBreak(int a);
}

class  vehicle_implementation implements vehicle{
	int speed;
	int gear;
	
	@Override
	public void change_gear(int newGear) {
		gear = newGear;
	}
	
	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}
	
	@Override
	public void applyBreak(int decrement) {
		speed = speed - decrement;
	}
	
	public void printState() {
		System.out.println(speed +gear);
	}
}

class skateBinterface_exampleoard{
	public static void main(String[] args) {
		
		
		//creating object of vehicle_implementation to use the implementations on the abstract methods of interface
		vehicle_implementation inter = new vehicle_implementation();
		inter.change_gear(2);
		inter.speedUp(5);
		inter.applyBreak(4);
		
		System.out.println("Speed and Break data:");
		inter.printState();
	}
}
