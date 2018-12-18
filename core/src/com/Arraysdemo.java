package com;

import java.util.Arrays;

public class Arraysdemo {

	public static void main(String[] args) {
		int arr[]={1,9,6,4,5};
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(i->System.out.println(i));
	}

}
