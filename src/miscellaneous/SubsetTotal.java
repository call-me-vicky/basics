package miscellaneous;

import looping.Power;

public class SubsetTotal {
	
	public static int subsetSquare(int arr[])
	{
		int len=Power.exponent(2,arr.length-1);
		int result=1;
		int m = (1000000000+7);
		
		for(int i=0;i<arr.length;i++)
		{
			result=(result *(arr[i]*arr[i])%m)%m;
		}
		
		return (len*result)%m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {30000,50000};
		System.out.println(subsetSquare(arr));

		System.out.println(100000*100000);
	}

}
