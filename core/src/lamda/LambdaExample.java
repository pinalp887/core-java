package lamda;

interface Executable{
	void executable();
}

class runner{
	public void run(Executable e)
	{
		System.out.println("executing the runner block");
		e.executable();
	}
}
public class LambdaExample {

	public static void main(String[] args) {
		runner run=new runner();
		run.run(new Executable() {
			
			@Override
			public void executable() {
				System.out.println("in the main method ");
			}
		});
		
		
		run.run(()->System.out.println("in lamda"));
	}

}
