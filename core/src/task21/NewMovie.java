package task21;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NewMovie {
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
		ArrayList<String> list=new  ArrayList<String>();
		System.out.println("enter number of seats in platinium ");
		int n=sc.nextInt();
		System.out.println("enter the seat number");
		for(int i=0;i<n;i++)
		{
			int j=sc.nextInt();
			list.add("c"+j);
		}	
		System.out.println("Selected seats : "+list);
		for(String s:plist){
			if(list.contains(s)){
				System.out.print("*"+s+" ");
			}
			else{
				System.out.print(s+" ");
			}
		}
		
		
	}
	else if(selec.equalsIgnoreCase("s"))
	{
		System.out.println("silver "+slist);
		ArrayList<String> list=new  ArrayList<String>();
		System.out.println("enter number of seats in silver ");
		int n=sc.nextInt();
		System.out.println("enter the seat number");
		for(int i=0;i<n;i++)
		{
			int j=sc.nextInt();
			list.add("b"+j);
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
	}
	else if(selec.equalsIgnoreCase("g"))
	{
		System.out.println("golden  "+glist);
		ArrayList<String> list=new  ArrayList<String>();
		System.out.println("enter number of seats in gold ");
		int n=sc.nextInt();
		System.out.println("enter the seat number");
		for(int i=0;i<n;i++)
		{
			int j=sc.nextInt();
			list.add("a"+j);
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
	}
	else
	{
		System.out.println("select proper");
	}
	System.out.println("do you want to book more seats?? y/n");
	 decesion=sc.next();
	}while(decesion.equalsIgnoreCase("y"));
}
}
