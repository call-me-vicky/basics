package looping;

public class FibonacciSeries {
	
	public static void fib(int n)
	{
		int a=1;
		int b=0;
		int c=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(c+" ");
			c=a+b;
			b=a;
			a=c;
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		fib(8);
		fib(1);
		fib(3);
		fib(0);
		fib(5);
	}

}
