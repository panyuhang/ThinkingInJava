package twentyOne.two.two.test;

public class Test1MainThread {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			new Thread(new Test1()).start();
		}
		Thread.sleep(500);
		System.gc();
	}
}
