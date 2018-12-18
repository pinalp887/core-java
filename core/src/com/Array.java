package com;

public class Array {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=6;
		arr[4]=10;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int[] arry={1,2,3,4,5,6};
		for(int ar:arry)
		{
			System.out.println("new array "+ar);
		}
		
		String[] fruits={"apple","banana","orange","pear","kiwi"};
		for(String fruit:fruits)
		{
			System.out.println("fruit is "+fruit);
		}
	}

}
