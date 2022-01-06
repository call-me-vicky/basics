package miscellaneous;

public class Inversion {
	
	public static void printInversions(int[] arr)
	{
	
		/* brute force method,  the time complexity is O(n*n) and it uses space complexity of O(1)*/
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
					System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= new int[] {2,4,3,6,1,5};
		printInversions(arr);
	}

}
