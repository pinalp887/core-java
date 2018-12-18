package task21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {
	static ArrayList<String> listt;
	
	static public List<String> getTokens(String str) {
	    List<String> tokens = new ArrayList<>();
	    StringTokenizer tokenizer = new StringTokenizer(str, ",");
	    while (tokenizer.hasMoreElements()) {
	        tokens.add(tokenizer.nextToken());
	    }
	    return tokens;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name");
		String name=sc.next();
		
		System.out.println(listt);
		listt=new ArrayList<String>();
		listt.addAll(getTokens(name));
		System.out.println("addd "+listt);
	}

}
