package recursion;

public class BasicRecursion {
	
	public static int fact(int n)
	{
		int result;
		if(n==0)
			return 1;
		result = n*fact(n-1);
		return result;
	}
	public static int powRecur(int a,int n)
	{
		int res;
		if(n==0)
			return 1;
		res= a*powRecur(a,n-1);
		return res;
	}

	public static int fExp(int a,int n)
	{
		int total;
		int temp;
		if(n==1)
			return a;
		temp = fExp(a,n/2);
		total=temp*temp;

		if(n%2==1)	
			total=a*total;
			
		return total;
	}
	public static int fExpMod(int a,int n,int mod)
	{
		int total,temp;
		if(n==1)
			return a;
		temp=fExpMod(a,n/2,mod);
		total= temp%mod*temp%mod;
		if(n%2==1)
			total=a*total;
	
		return total%mod;
	}
	public static void main(String[] args) {

		
		System.out.println(fact(8));
		
		System.out.println(powRecur(2,12));
		System.out.println(powRecur(7,5));
		System.out.println(powRecur(5,13));
		
		System.out.println(fExp(2,10));
		System.out.println(fExp(5,13));

		
		System.out.println(fExpMod(2,100,11));
//		System.out.println(fExpMod(2,5,13));
//		System.out.println(fExpMod(2,10,13));

	}

}
