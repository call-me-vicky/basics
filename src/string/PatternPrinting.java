package string;

public class PatternPrinting {
	
	public static void trianglePattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}
	public static void InvtrianglePattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void rightTriangle(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trianglePattern(4);
		InvtrianglePattern(4);
		rightTriangle(10);

	}

}
