package task21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
public static void main(String[] args) {
	List<String> list=new  ArrayList<String>();
	Scanner s=new Scanner(System.in);
	for(int i=0; i<5; i++){
		int j=s.nextInt();
		list.add("A"+j);
	}
	
	System.out.println(list);
	
	
}
}
