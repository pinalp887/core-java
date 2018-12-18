package newmovie;

import java.util.ArrayList;

public class Seats {
	static ArrayList<String> plist,glist,slist;

	public Seats() {
		plist=new ArrayList<String>();
		glist=new ArrayList<String>();
		slist=new ArrayList<String>();

		for(int i=1;i<=9;i++)
		{
			plist.add("a"+i);
			slist.add("c"+i);
			glist.add("b"+i);
		}
	}
	void dis()
	{
		System.out.println("premium "+plist);
		System.out.println("gold "+glist);
		System.out.println("silver "+slist);
	}


}

