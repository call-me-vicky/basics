package looping;

public class Histogram {
	
	public static void horizonalHistogram(int a,int b,int c)
	{
		for(int i=0;i<a;i++)
		{
			System.out.print("-");
		}
		System.out.println(" ");
		for(int i=0;i<b;i++)
		{
			System.out.print("-");
		}
		System.out.println(" ");
		for(int i=0;i<c;i++)
		{
			System.out.print("-");
		}
		System.out.println(" ");
	
		
	}
	public static void verticalHistogram(int a,int b,int c) 
	{
		//vertical histogram 
		int lar = largestValue(a, b, c);
			for(int j=lar;j>0;j--)
			{
				if(a>=j)
				{
					System.out.print("| ");
				}
				else
				{
					System.out.print("  ");
				}
				if(b>=j)
				{
					System.out.print("| ");
				}
				else
				{
					System.out.print("  ");
				}
				if(c>=j)
				{
					System.out.print("| ");
				}
				else
				{
					System.out.print("  ");
				}
			System.out.println();
			}
	}
	public static int largestValue(int a,int b,int c)
	{
		// finding largest value
		int lar=a;
		if(b>lar)
		{
			lar=b;
		}
		if(c>lar)
		{
			lar=c;
		}
		return lar;
		
	}

	public static void main(String[] args) {
		//horizonalHistogram(6, 4, 7);
		verticalHistogram(9, 3, 7);

	}

}
