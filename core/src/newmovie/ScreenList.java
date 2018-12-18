package newmovie;

import java.util.Scanner;

public class ScreenList {

	static NewBooking b1=new NewBooking();
	static NewBooking b2=new NewBooking();
	static NewBooking b3=new NewBooking();

	static Scanner sc=new Scanner(System.in);
	NewBooking n=new NewBooking();
	public static void screenselection()
	{
		System.out.println("enter the screen 1 2 3 ");
		int n=sc.nextInt();
		if(n==1)
		{
			b1.finalmethod();
		}
		if(n==2)
		{
			b2.finalmethod();
		}
		if(n==3)
		{
			b3.finalmethod();
		}
	}
	public static void main(String[] args) {
		ScreenList s=new ScreenList();
		s.screenselection();
	}
}
