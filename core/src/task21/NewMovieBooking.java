package task21;

import java.util.ArrayList;
import java.util.Scanner;

public class NewMovieBooking {
 	static ArrayList<String> list=new  ArrayList<String>();
	static ArrayList<String> temp=new  ArrayList<String>();
	public static void main(String[] args) {

		ArrayList<String> glist=new ArrayList<String>();
		glist.add("a1");
		glist.add("a2");
		glist.add("a3");
		glist.add("a4");
		glist.add("a5");
		glist.add("a6");
		glist.add("a7");
		glist.add("a8");
		glist.add("a9");
		
		
		ArrayList<String> slist=new ArrayList<String>();
		slist.add("b1");
		slist.add("b2");
		slist.add("b3");
		slist.add("b4");
		slist.add("b5");
		slist.add("b6");
		slist.add("b7");
		slist.add("b8");
		slist.add("b9");
		
		ArrayList<String> plist=new ArrayList<String>();
		plist.add("c1");
		plist.add("c2");
		plist.add("c3");
		plist.add("c4");
		plist.add("c5");
		plist.add("c6");
		plist.add("c7");
		plist.add("c8");
		plist.add("c9");
		
		System.out.println("platinium "+plist);
		System.out.println("golden "+glist);
		System.out.println("silver"+slist);
		String decesion;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("select g for gold   s for silver    p for platinium :");
		
		String selec=sc.next();
		if(selec.equalsIgnoreCase("p"))
		{
			
			
			System.out.println("enter number of seats in platinium ");
			int n=sc.nextInt();
			
			System.out.println("enter the seat number");
			for(int i=0;i<n;i++)
			{
				int j=sc.nextInt();
				list.add("c"+j);
				for(String s1:temp)
				{
					if(list.contains(s1))
					{
						System.err.print("c"+j+" is already booked select another");
						break;
					}
					else
					{
						continue;
					}
				}
			}	
			for(String s:plist){
				if(list.contains(s)){
					
					System.out.print("*"+s+" ");
				}
				else{
					System.out.print(s+" ");
				}
				
			}
			temp.addAll(list);
			
		}
		else if(selec.equalsIgnoreCase("s"))
		{
			System.out.println("silver "+slist);
			System.out.println("enter number of seats in silver ");
			int n=sc.nextInt();
			System.out.println("enter the seat number");
			for(int i=0;i<n;i++)
			{
				int j=sc.nextInt();
				list.add("b"+j);
				for(String s1:temp)
				{
					if(list.contains(s1))
					{
						System.err.print("b"+j+" is already booked select another");
						break;
					}
				}
			}	
			System.out.println("Selected seats : "+list);
			for(String s:slist){
				if(list.contains(s)){
					System.out.print("*"+s+" ");
					
				}
				else{
					System.out.print(s+" ");
				}
			}
			temp.addAll(list);
		}
		else if(selec.equalsIgnoreCase("g"))
		{
			System.out.println("golden  "+glist);
			System.out.println("enter number of seats in gold ");
			int n=sc.nextInt();
			System.out.println("enter the seat number");
			for(int i=0;i<n;i++)
			{
				int j=sc.nextInt();
				list.add("a"+j);
				for(String s1:temp)
				{
					if(list.contains(s1))
					{
						System.err.print("a"+j+" is already booked select another");
						break;
					}
				}
			}	
			System.out.println("Selected seats : "+list);
			for(String s:glist){
				if(list.contains(s)){
					System.out.print("*"+s+" ");
					
				}
				else{
					System.out.print(s+" ");
				}
			}
			temp.addAll(list);
		}
		else
		{
			System.out.println("select proper");
		}
			System.out.println("do you want to book more seats?? y/n");
			decesion=sc.next();
			System.out.println("temp "+temp);
		}while(decesion.equalsIgnoreCase("y"));
	}

}