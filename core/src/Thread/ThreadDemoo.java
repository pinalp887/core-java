package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemoo implements Runnable{
	String name;
	public ThreadDemoo(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println(name+"...job started by the Thread"+Thread.currentThread().getName());
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(name+"...job completed by Thread"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadDemoo[] pin= {
			new ThreadDemoo("pinal"),
			new ThreadDemoo("rahil"),
			new ThreadDemoo("ram"),
			new ThreadDemoo("aalap"),
			new ThreadDemoo("ramji"),
			new ThreadDemoo("chintan"),
			new ThreadDemoo("chuno"),
		};
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(ThreadDemoo t:pin)
		{
			service.submit(t);
		}
		service.shutdown();
	}
}
