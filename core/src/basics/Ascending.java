package basics;

public class Ascending {
public static void main(String[] args) {
	int[] arr= {9,8,7,5,6,4,2,3,1};
	int temp;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				System.out.println("temp is "+temp);
				arr[i]=arr[j];
				System.out.println("i is "+arr[i]);
				arr[j]=temp;
				System.out.println("j is "+arr[j]);
			}
			
		}
		System.out.println(arr[i]);
	}
}
}
