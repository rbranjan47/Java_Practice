package Java_Gromming;
class thread_class implements Runnable {
	public void run() {
		try {
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		}
		catch(Exception e) {
			System.out.println("Exception occured!");
		}
	}
}
class implement_runnableInterface  {
	public static void main(String[] args) {
		int n=8;
		for (int i=0; i<n;i++) {
			Thread obj = new Thread(new thread_class());
			obj.start();
		}
	}
}
