package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(4, "four");
		map.put(3, "three");

		String text = map.get(3);
		System.out.println(text);

		for (Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+": "+value);
		}
	}
}
