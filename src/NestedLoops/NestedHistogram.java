package NestedLoops;

public class NestedHistogram {

	public static void horzHistogram(int m[])
	{
		for(int i=0;i<m.length;i++)
		{
			System.out.print(m[i]+":");
			for(int j=0;j<m[i];j++)
			{
				System.out.print("- ");
			}
			System.out.println();
		}
		System.out.println();
			
	}
	public static int maxValue(int m[])
	{
		int max=m[0];
		for(int i=0;i<m.length;i++)
		{
			if(max<m[i])
			{
				max=m[i];
			}
		}
		return max;
	}
	
	public static void vertHistogram(int m[])
	{
		int max_limit = maxValue(m);
		int l=max_limit;
		
		for(int i=0;i<max_limit;i++) 
		{
			//System.out.print(m[i]+":");
			for(int j=0;j<m.length;j++)
			{
				if(m[j]>=l)
				{
					System.out.print("| ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
			l--;
		}
		for(int i=0;i<m.length;i++)
		{
			System.out.print(m[i]+" ");
		}
		System.out.println("\n\n");
	}

	public static void main(String[] args) {
//		int[] k= {4,2,8,5};
//		horzHistogram(k);
//		
//		int[] z= {0,3,-1,00};
//		horzHistogram(z);
//		
		int[] v= {4,2,3,7,1};
		vertHistogram(v);
		
		int[] v1= {1,02,5,0,3};
		vertHistogram(v1);

	}

}
