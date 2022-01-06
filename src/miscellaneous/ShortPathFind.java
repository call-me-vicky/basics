package miscellaneous;

public class ShortPathFind {
	
//	public static int spf(int a,int b)
//	{
//		int count=0;
//		for(int i=b;i>=a;)
//		{
//			if(i==a)
//				return count;
//			
//			if(i%2==0 && i>a && i/2>a)
//			{
//				count=count+1;
//				i=i/2;
//			}
//			else if(i>a)
//			{
//				count=count+1;
//				i=i-1;
//			}
//			System.out.print(i+" ");
//			
//		}
//		return 0;
//	}
	
	public static void spfRecur(int a,int b)
	{
		
		if(a==b)
		{
			System.out.print(b+" ");
			return;
		}
		if(b%2==0 && b/2>a)
		{
			spfRecur(a,b/2);
			System.out.print(b+" ");
			return;
		}
		else
		{
			spfRecur(a,b-1);
			System.out.print(b+" ");
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("\npath len:"+spf(1,25));
//		System.out.println("\npath len:"+spf(8,70));
//		System.out.println("\npath len:"+spf(5,100));
//		System.out.println("\npath len:"+spf(4,100));
		
		spfRecur(1,25);
		System.out.println();
		spfRecur(8,70);
		System.out.println();
		spfRecur(5,100);
		System.out.println();
		spfRecur(4,100);
		System.out.println();

	}

}
