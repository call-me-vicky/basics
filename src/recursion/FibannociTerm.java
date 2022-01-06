package recursion;

public class FibannociTerm {
	
	static int[] memory = new int[50];
	
//	public static int fib(int n)
//	{
//		int res;
//		if(n==1 || n==2)
//			return 1;
//		res = fib(n-1)+fib(n-2);
//		return res;
//	}
	
	public static int fibRecur(int n)
	{
		if(memory[n]!=0)
			return memory[n];
		
		if(n==1 || n==2)
		{
			memory[n]=1;
			return 1;
		}
		else
			memory[n]=fibRecur(n-1)+fibRecur(n-2);
		return memory[n];
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fibRecur(15));
		System.out.println(fibRecur(6));

	}

}
