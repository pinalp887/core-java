package newmovie;
 
import java.util.ArrayList;
import java.util.Scanner;

public class NewBooking {
	static ArrayList<Double> earning=new ArrayList<Double>();
	ArrayList<String> totalbookedseats=new ArrayList<String>();
	static ArrayList<String> temp=new ArrayList<String>();
	ArrayList<String> seat=new ArrayList<String>();
	static int pcount=0,scount=0,gcount=0;
	static int pcountt=0,scountt=0,gcountt=0;
	static double gst=18,kkt=5,sbt=5;
	static double gstt,kktt,sbtt;
	static double pprice=250,gprice=200,sprice=150;
	static Scanner sc=new Scanner(System.in);
	static NewBooking n=new NewBooking();
	static Seats s=new Seats();
	double ggtotal,gtotal,stotal,ptotal,total;
	void check(String ss)
	{
		for(String sc:seat)
		{
			if(temp.contains(sc))
			{
				System.err.println(ss+"this seat is already booked by someone");
				if(ss.startsWith("a"))
				{
					pcount--;
					pcountt--;
				}
				if(ss.startsWith("b"))
				{
					gcount--;
					gcountt--;
				}
				if(ss.startsWith("c"))
				{
					scount--;
					scountt--;
				}
				temp.clear();
			}
		}
	}
	void showAvailable()
	{
		System.out.println("Available seats are :-");
		System.out.println("final temp i s "+temp);
		System.out.println("final seats is "+seat);
		System.out.println("final booked is "+totalbookedseats);
		for(String as:s.plist)
		{
			if(seat.contains(as))
			{
				System.out.print("<<"+as+">> \t");
			}
			else
			{
				System.out.print(as+" \t");
			}
		}

		System.out.println(" ");
		for(String as:s.glist)
		{
			if(seat.contains(as))
			{
				System.out.print("<<"+as+">> \t");
			}
			else
			{
				System.out.print(as+" \t");
			}
		}
		System.out.println(" " );
		for(String as:s.slist)
		{
			if(seat.contains(as))
			{
				System.out.print("<<"+as+">> \t");
			}
			else
			{
				System.out.print(as+" \t");
			}
		}
	}

	void dailyreport(){
		
		System.out.println("------------------this is the report of the day------------------");
		System.out.println("total platinium tickets   =="+pcountt);
		System.out.println("total silver tickets   =="+scountt);
		System.out.println("total gold tickets   =="+gcountt);
	}
	void billCount()
	{
		System.out.println("pcount is "+pcount);
		System.out.println("scount is "+scount);
		System.out.println("gcount is "+gcount);

		if(pcount>0)
		{
			total=pprice*pcount;
			gstt=total*gst/100;
			kktt=total*kkt/100;
			sbtt=total*sbt/100;
			ptotal=total+gstt+kkt+sbtt;
			System.out.println(total+"\t+"+gstt+"\t+"+kktt+"\t+"+sbtt+"\t+"+ptotal);
		}
		if(gcount>0)
		{
			total=gprice*gcount;
			gstt=total*gst/100;
			kktt=total*kkt/100;
			sbtt=total*sbt/100;
			gtotal=total+gstt+kkt+sbtt;
			System.out.println(total+"\t+"+gstt+"\t+"+kktt+"\t+"+sbtt+"\t+"+gtotal);
		}
		if(scount>0)
		{
			total=sprice*scount;
			gstt=total*gst/100;
			kktt=total*kkt/100;
			sbtt=total*sbt/100;
			stotal=total+gstt+kkt+sbtt;
			System.out.println(total+"\t+"+gstt+"\t+"+kktt+"\t+"+sbtt+"\t+"+stotal);
		}
		ggtotal=ptotal+gtotal+stotal;
		earning.add(ggtotal);
		System.out.println(earning);
		ptotal=0;
		gtotal=0;
		stotal=0;
		
	}


	void rebooking()
	{
		showAvailable();
		System.out.println("do you want to book more tickets ?? then press 'Y' else 'N' ");
		char dec=sc.next().toUpperCase().charAt(0);

		if(dec=='Y')
		{
			selection();
			rebooking();
		}
		if(dec=='N')
		{
			System.out.println("thank you ");
			billCount();
			dailyreport();
			pcount=0;
			gcount=0;
			scount=0;
			ScreenList.screenselection();
		}
	}

	void selection()
	{
		System.out.println("enter a number of seats you want to book :");
		int n=sc.nextInt();
		System.out.println("enter a seat number :");
		for(int i=0;i<n;i++)
		{
			String j=sc.next();


			if(j.startsWith("a"))
			{
				pcount++;
				pcountt++;
			}
			if(j.startsWith("b"))
			{
				gcount++;
				gcountt++;
			}
			if(j.startsWith("c"))
			{
				scount++;
				scountt++;
			}

			temp.add(j);
			check(j);
		}

		seat.addAll(temp);
		temp.clear();
		//totalbookedseats.addAll(seat);
		System.out.println("sel "+pcount);
		System.out.println(gcount);
		System.out.println(scount);
		System.out.println("seatttttttttt  "+seat);

	}
	void finalmethod()
	{
		showAvailable();
		selection();
		rebooking();
		showAvailable();
	}
}
