package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Colll {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "pinal");
		map.put(2, "asmita");
		
		
		map.forEach((k,v)->System.out.println(map.get(k)));
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		
		list.stream().forEach((s)->System.out.println(s));
	}
}
