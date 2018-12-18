package task21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Cinema {

	static ArrayList<String> seats=new ArrayList<String>();
	static ArrayList<String> temp=new ArrayList<String>();
	static Seats s1=new Seats();
	static public List<String> getTokens(String str) {
	    List<String> tokens = new ArrayList<>();
	    StringTokenizer tokenizer = new StringTokenizer(str, ",");
	    while (tokenizer.hasMoreElements()) {
	        tokens.add(tokenizer.nextToken());
	    }
	    return tokens;
	}
	static void selected()
	{
		
		Scanner sc;
		int n;
		System.err.println("total seats are booked  ::"+seats);
		System.out.println("enter a seat number you want to book");
		sc=new Scanner(System.in);
		n=sc.nextInt();
		
		if(n<=9)
		{
			System.out.println("enter a seat number ");
			for(int i=0;i<n;i++)
			{
				String name=sc.next();
				temp.addAll(getTokens(name));
			}
			System.out.println("temppppp "+temp);
		}
		else
		{
			System.err.println("you can book maximum 9 seats:::");
		}
		seats.addAll(temp);
		System.out.println("seatss "+seats);
		
	}
	
	static String decision;

	public static void main(String[] args) {
		Seats s=new Seats();
		s.display();
		do{
			new Cinema().selected();
			
			System.out.println("do you want to book another seats?????  then press y");
			Scanner sc=new Scanner(System.in);
			decision=sc.next();
		}while(decision.equalsIgnoreCase("y"));
	}

}
