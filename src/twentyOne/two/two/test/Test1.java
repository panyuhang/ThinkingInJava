package twentyOne.two.two.test;

public class Test1 implements Runnable{
	private static int taskCount = 0;
	private final int id = taskCount++;
	public Test1() {
		System.out.println("new Test1");
	}
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(id + "run" + i);
			Thread.yield();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("destroy Test1" + id);
	}
}
