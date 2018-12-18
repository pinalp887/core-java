package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set1=new HashSet<String>();
		set1.add("pinal");
		set1.add("sheradiya");
		set1.add("raj");
		
		System.out.println(set1);
		
		for(String s:set1)
		{
			System.out.println(s);
		}
		
		Set<String> set2=new TreeSet<String>();
		set2.add("pinal");
		set2.add("raj");
		set2.add("patel");
		
		Set<String> diff=new HashSet<String>(set1);
		diff.retainAll(set2);
		System.out.println(diff);
		
		Set<String> remove=new HashSet<String>(set1);
		remove.removeAll(set2);
		System.out.println(remove);
	}

}
