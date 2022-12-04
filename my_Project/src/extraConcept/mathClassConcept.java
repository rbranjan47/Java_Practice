package extraConcept;

public class mathClassConcept {
	public static void main(String[] args) {
		System.out.println(Float.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);

		int numCeiling = (int) Math.ceil(5.23);
		System.out.println(numCeiling);

		int numFlooring = (int) Math.floor(5.23);
		System.out.println(numFlooring);

		int numRound1 = (int) Math.round(5.23);
		System.out.println(numRound1);

		int numRound2 = (int) Math.round(5.68);
		System.out.println(numRound2);

		// random numbers, between 0.00 to 0.99
		int randomInt = (int) (Math.random() * 10);
		System.out.println(randomInt);
	}
}
