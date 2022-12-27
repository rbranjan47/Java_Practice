package extraConcept;

/*
 * >>>> Interface inside a class/interfaces called nested interface
 * 
 */
class nestedInterfacesPart {

	interface first {
		int getMen();

		void setMan(int menCount);

		int getWomen();

		void SetWomen(int womenCount);

	}
}

class speedTest implements nestedInterfacesPart.first {
	int menCounts = 45;
	int womenCounts = 30;

	@Override
	public int getMen() {
		return this.menCounts;

	}

	@Override
	public void setMan(int menCount) {
		this.menCounts = menCount;
	}

	@Override
	public int getWomen() {
		return this.womenCounts;

	}

	@Override
	public void SetWomen(int womenCount) {
		this.womenCounts = womenCount;
	}
}

public class nestedInterfaces {
	public static void main(String[] args) {
		speedTest nestedInterfaceTest = new speedTest();
		System.out.println("Men Counts:" + nestedInterfaceTest.menCounts);
		System.out.println("Women Counts:" + nestedInterfaceTest.womenCounts);
	}
}