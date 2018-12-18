package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashmap2 {

	public static void testmap(Map<Integer, String> map) {
		map.put(1, "banana");
		map.put(3, "orange");
		map.put(2, "apple");
		map.put(4, "guavava");

		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + " :" + value);
		}
	}

	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		Map<Integer, String> linkHashmap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treemap=new TreeMap<Integer,String>();
		testmap(linkHashmap);
		testmap(hashmap);
		testmap(treemap);
	}

}
