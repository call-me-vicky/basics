package NestedLoops;


public class PatternPrinting {
	
	public static void printRow(String sh,int n)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print(sh);
		}
	}
	
	public static void trianglePattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			printRow("* ",i);
			System.out.println();
		}
		System.out.println("\n");
	}
	public static void InvtrianglePattern(int n)
	{
		for(int i=n;i>0;i--)
		{
			printRow("* ",i);
			System.out.println();
		}
		System.out.println();
	}
	public static void pyramid(int n)
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
	public static void pyramidModified(int n)
	{
		for(int i=0,j=n;i<n;i++,j--)
		{
			printRow(" ",j);
			printRow("* ",i);
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trianglePattern(4);
		InvtrianglePattern(4);
		pyramid(10);
		
		pyramidModified(10);
		
		
	}

}
