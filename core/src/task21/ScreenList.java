package task21;

import java.util.Scanner;


public class ScreenList {

		static Scanner sc=new Scanner(System.in);
		public static void selection()
		{
			System.out.println("select the screen 1 2 3 ");
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println("in 1 ");
				new Newmovi().finalmethod();;
				//selection();
			}
			if(n==2)
			{
				System.out.println("in 2");
				new Newmovi().finalmethod();;
				//selection();
			}
			if(n==3)
			{
				new Newmovi().finalmethod();;
				//selection();
			}
		}
	public static void main(String[] args) {
		selection();
}

}
