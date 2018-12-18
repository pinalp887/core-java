package basics;

public class SuminArray {
	int sum=0;
	static public void sum(int num[], int number) {
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]+num[j]==number) {
					System.out.println(num[i]+"+"+num[j]+"="+number);
					
				}
			}
		}
	}
public static void main(String[] args) {
	SuminArray.sum(new int[] {1,2,4,5,5,6},10);
}
}
