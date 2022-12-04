package extraConcept;

public class IncreamentConcept {
	public static void main(String[] args) {
		String[][] multiArray = new String[10][10];

		for (String[] rows : multiArray) {
			for (String column : rows) {
				System.out.print("|" + column + "");
			}
			System.out.println("|");
		}
	}
}
