package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLength implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int i1 = o1.length();
		int i2 = o2.length();
		if (i1 > i2) {
			return 1;
		}
		if (i1 < i2) {
			return -1;
		}
		return 0;
	}
}

class alphbetical implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

}

class student {
	int id;
	String name;

	public student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}

}

public class ComparatorExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("monkey");
		list.add("lion");
		list.add("cat");
		list.add("elephant");

		// Collections.sort(list, new StringLength());
		Collections.sort(list, new alphbetical());
		for (String ls : list) {
			System.out.println(ls);
		}

		List<Integer> num = new ArrayList<>();
		num.add(01);
		num.add(33);
		num.add(44);
		num.add(98);
		num.add(02);

		Collections.sort(num, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
		});
		for (Integer nu : num) {
			System.out.println(nu);
		}

		List<student> stu = new ArrayList<student>();
		stu.add(new student(1, "pinal"));
		stu.add(new student(3, "saloni"));
		stu.add(new student(2, "harsh"));
		Collections.sort(stu,new Comparator<student>() {

			@Override
			public int compare(student s1, student s2) {
				if(s1.getId()>s2.getId())
				{
					return 1;
				}
				if(s1.getId()<s2.getId())
				{
					return -1;
				}
				return 0;
			}
		});
		for(student s:stu)
		{
			System.out.println(s);
		}
	}

}
