package looping;

public class CombinationPattern {
	
	public static void zerosOnes(int n)
	{
//		int t=0;
		for(int i=0;i<looping.Power.exponent(2, n);i++)
		{
//			t=i;
//			for(int j=0;j<n;j++)
//			{
//				System.out.print(t%2+"");
//				t=t/2;
//			}
			printBin(i, n);
			System.out.println();
		}
	}

	public static void printBin(int num, int times)
	{
		if(times == 0)
			return;
		
		int rem = num%2;
		times--;
		printBin(num/2, times);

		System.out.print(rem);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		zerosOnes(4);

	}

}
