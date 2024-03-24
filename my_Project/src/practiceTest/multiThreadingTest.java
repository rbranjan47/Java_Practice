package practiceTest;

//custom Defined Exception
class myException extends Exception{
	public  myException(String str) {
		super(str);
	}
}

//thread clas
class threadMultiple extends Thread {
	@SuppressWarnings("deprecation")
	public void run() {
		try {
			// Thread.currentThread().setPriority(10);
			System.out.println("Current Thread " + Thread.currentThread().getId() + " is running!" + "Having Priority: "
					+ Thread.currentThread().getPriority());
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}

public class multiThreadingTest {

	public static void main(String[] args) {
		int n = 10;

		for (int i = 0; i < n; i++) {
			threadMultiple threadsMulti = new threadMultiple();
			threadsMulti.start();
		}
	}
}


