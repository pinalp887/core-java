package collection;

import java.util.ArrayList;
import java.util.List;

public class Listexample {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("pinal");
		list.add("harsh");
		list.add("chintan");
		list.add("asmita");
		List<String> list2=new ArrayList<String>();
		list2.add("kalal");
		list2.add("kd");
		list.addAll(list2);
		for(String s:list)
		{
			System.out.println(s);
		}
	}
}
