package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.omg.Messaging.SyncScopeHelper;

public class CollectionToArray {
public static void main(String[] args) {
	List<Integer> li=new ArrayList<Integer>();
	li.add(12);
	li.add(14);
	li.add(16);
	li.add(14);
	li.add(16);
	li.add(18);
	li.add(19);
	
	Integer[] arr=li.stream().toArray(Integer[]::new);
	/*for(Integer l:arr)
	{
		System.out.println(l);
	}*/
	Stream.of(arr).forEach(System.out::println);
}
}
