package looping;

public class Factorial {
	public static int fact(int n)
	{
		int e=1;
		for(int i=1;i<=n;i++)
		{
			e= e*i;
		}
		return e;
	}

	public static void main(String[] args) {
		System.out.println(fact(0));
		System.out.println(fact(12));
		System.out.println(fact(6));

	}


}
