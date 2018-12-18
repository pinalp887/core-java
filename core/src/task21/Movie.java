package task21;

import java.util.ArrayList;
import java.util.Scanner;

public class Movie {

	static ArrayList<String> seats=new ArrayList<String>();
	static ArrayList<String> temp=new ArrayList<String>();
	static Seats s1=new Seats();
	static void selected(String s)
	{
		
		Scanner sc;
		int n;
		System.err.println("total seats are booked  ::"+seats);
		System.out.println("enter a seat number you want to book");
		sc=new Scanner(System.in);
		n=sc.nextInt();
		
		if(n<=9)
		{
			System.out.println("enter a seat numbers ");
			for(int i=0;i<n;i++)
			{
				int j=sc.nextInt();
				temp.add(s+""+j);
				
				for(String selection:seats)
				{
					if(temp.contains(selection))
					{
						System.err.println(s+j+" seat is already booked by someone please select another seats");
						temp.clear();
					}
					else
					{
						
					}
				}
				
			}
		}
		else
		{
			System.err.println("you can book maximum 9 seats:::");
		}
		//System.out.println("temp is "+temp);
		seats.addAll(temp);
		temp.clear();
		//System.out.println(" seats "+seats);
		switch(s)
		{
		case "a":
			//System.out.println("in a platinium ");
			for(String sel:s1.plist)
			{
				if(seats.contains(sel))
				{
					
					System.out.print("<"+sel+">"+"\t");
				}
				else
				{
					System.out.print(sel+"\t");
				}
			}
			
			break;
		case "b":
			//System.out.println("in a gold ");
			
			for(String sel:s1.glist)
			{
				if(seats.contains(sel))
				{
					System.out.print("<"+sel+">"+"\t");
				}
				else
				{
					System.out.print(sel+"\t");
				}
			}
			
			break;
		case "c":
			//System.out.println("in a silver ");
			for(String sel:s1.slist)
			{
				if(seats.contains(sel))
				{
					System.out.print("<"+sel+">"+"\t");
				}
				else
				{
					System.out.print(sel+"\t");
				}
			}
			
			break;
		default:
			selection();
			break;
		}
		
		
	}
	static void selection()
	{
		System.out.println("enter the row you want to select g  for gold p for platinium s for silver");
		Scanner sc=new Scanner(System.in);
		char selection=sc.next().charAt(0);
		switch(selection)
		{
			case 'p':
				//System.out.println("you were selected  platinium row");
				//System.out.println(s1.plist);
				selected("a");
				
				break;
			case 'g':
				System.out.println("you were selected gold row");
				System.out.println(s1.glist);
				selected("b");
				break;
			case 's':
				System.out.println("you were selected silver row");
				System.out.println(s1.slist);
				selected("c");
				break;
			default:
				System.err.println("enter a proper value :::");
				selection();
		}
	}
	static String decision;

	public static void main(String[] args) {
		Seats s=new Seats();
		s.display();
		do{
			new Movie().selection();
			
			System.out.println("do you want to book another seats?????  then press y");
			Scanner sc=new Scanner(System.in);
			decision=sc.next();
		}while(decision.equalsIgnoreCase("y"));
	}

}
