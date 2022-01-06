package looping;

public class Power {
	
	public static int pow(int a,int n)
	{
			int pwr=1;
			for(int i=1;i<=n;i++)
			{
				pwr=pwr*a;
			}
			return pwr;
			
	}
	public static double pow2(int a,int n)
	{
		double pwr=1.0;
		for(int j=-1;j>=n;j--)
		{
			pwr=pwr*1.0/a;
		}
		return pwr;
	}
	public static int exponent(int a,int n)
	{
		int total=1;
		int pwr=a;
		while(n>0)
		{
			if(n%2==1)
			{
				total=total*pwr;
			}
			n=n/2;	
			pwr=pwr*pwr;
			
		}
		return total;
		
	}
	public static int exponent1(int a,int n)
	{
		int total=1;
		int pwr=a;
		while(n>1)
		{
			if(n%2==1)
			{
				pwr=pwr*pwr*a;
			}
			else
				pwr=pwr*pwr;
			n=n/2;
		}
		total=total*pwr;
		return total;
	}

	public static void main(String[] args) {
		//testing a raised to power n
//		System.out.println(pow(10,15));
//		System.out.println(pow(Integer.MAX_VALUE,0));
//		System.out.println(pow(1,2));
//		System.out.println(pow(2,10));
		//testing -a raised to power n
//		System.out.println(pow(-1,0));
//		System.out.println(pow(-5,3));
//		System.out.println(pow(-10,2));
		//testing a raised to power -n
//		System.out.println(pow2(1,-10));
//		System.out.println(pow2(10,-2));
//		System.out.println(pow2(100,-1));
//		System.out.println(pow2(0,-1));
		//testing -a rasied to power -n
//		System.out.println(pow2(-100,-1));
//		System.out.println(pow2(-10,-2));
//		System.out.println(pow2(-1,10));
//		System.out.println(pow(-8,3));
//		System.out.println(pow2(-2,-4));
//		System.out.println(pow2(0,-5));
		System.out.println(exponent(0,5));
		System.out.println(exponent(10,0));
		System.out.println(exponent(2,3));
		System.out.println(exponent(2,4));
		System.out.println(exponent(2,5));
		System.out.println(exponent(2,6));
		System.out.println(exponent(2,7));
		System.out.println(exponent(2,8));
		System.out.println(exponent(5,13));

	}

}
