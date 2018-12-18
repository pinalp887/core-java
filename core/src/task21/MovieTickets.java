package task21;

import java.util.Arrays;
import java.util.Scanner;

public class MovieTickets {

	public static void main(String[] args) {
		String silver[]={"b1","b2","b3","b4","b5","b6","b7","b8","b9"};
		String golden[]={"c1","c2","c3","c4","c5","c6","c7","c8","c9"};
		String platinium[]={"a1","a2","a3","a4","a5","a6","a7","a8","a9"};
		System.out.println("platinium :"+Arrays.toString(platinium));
		System.out.println("golden :"+Arrays.toString(golden));
		System.out.println("silver :"+Arrays.toString(silver));
		Scanner sc=new Scanner(System.in);
		System.out.println("please select the row :");
		String selec=sc.next();
		if(selec.equalsIgnoreCase("p"))
		{
			
			
			
			
			/*for(int i=0;i<platinium.length;i++)
			{
				System.out.println(platinium[i]);
			}
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter the platinium seat numbers you want to book : ");
			int n=sc1.nextInt();
			String selected[]=new String[n];
			int i=0;
			for( i=0;i<n;i++)
			{
				selected[i]=sc1.next();
				System.out.println("your selected seats are :"+selected[i]);
				
			}*/
		}
		else if(selec.equalsIgnoreCase("g"))
		{
			//System.out.println(Arrays.toString(golden));
			for(int i=0;i<golden.length;i++)
			{
				System.out.println(golden[i]);
			}
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter the golden seat numbers you want to book : ");
			int n=sc1.nextInt();
			String selected[]=new String[n];
			int i=0;
			for( i=0;i<n;i++)
			{
				selected[i]=sc1.next();
				System.out.println("your selected seats are :"+selected[i]);
				
			}
		}
		else if(selec.equalsIgnoreCase("s"))
		{
			//System.out.println(Arrays.toString(silver));
			for(int i=0;i<silver.length;i++)
			{
				System.out.println(silver[i]);
			}
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter the silver seat numbers you want to book : ");
			int n=sc1.nextInt();
			String selected[]=new String[n];
			int i=0;
			for( i=0;i<n;i++)
			{
				selected[i]=sc1.next();
				System.out.println("your selected seats are :"+selected[i]);
				
			}
		}
		else
		{
			System.out.println("please enter p or g or s");
		}
		
		
		//System.out.println("your selected seats are :"+selected[i]);
	}

}
