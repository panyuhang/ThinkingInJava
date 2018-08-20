package twentyOne.two.exceptionThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread implements Runnable{

	@Override
	public void run() {
//		try {
			throw new RuntimeException();
//		}catch (Exception e) {
//			System.out.println("catch");
//		}
	}
	 public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new ExceptionThread());
	}

}
