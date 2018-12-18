package Thread;

public class ThreadPooling implements Runnable {
	String name;
	public ThreadPooling(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" "+name);
		message();
		System.out.println(Thread.currentThread().getName()+"end  "+name);
	}
	public void message() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
