package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execu {
	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			ThreadPooling t=new ThreadPooling("pinal");
			executorService.execute(t);
		}
		executorService.shutdown();
		while(!executorService.isTerminated())
		{
		
		}
		System.out.println("finish");
	}
}
