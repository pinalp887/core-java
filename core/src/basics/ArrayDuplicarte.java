package basics;

public class ArrayDuplicarte {
static int ar;
	public static void main(String[] args) {
		int[] arr= {3,2,3,4,4,4,4,7};
		for(int i=0;i<arr.length;i++)
		{	
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("matched "+arr[j]);
				}
			}
		}
	}
}
