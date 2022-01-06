package funbool;

public class BooleanPractice {
	public static boolean isSmallest(int a, int b, int c) 
	{
		return(b>a && c>a);
	}
	public static boolean isLargest(int a, int b, int c)
	{
		return (b<a && c<a);
	}
	public static boolean isBetween(int a, int b, int c)
	{
		return((b<a && c>a)||(b>a && c<a));	
	
	}
	public static boolean isOutside(int a, int b, int c)
	{
//		return((b>a || c<a)&&(b<a || c>a));
//		return b>a && c>a || b<a && c<a;
		return a<b == a<c;
	}
	public static boolean isEqual(int a, int b, int c)
	{
		return(b==a && c==a);
	}
	public static boolean isAny2Equal(int a, int b, int c)
	{
		return(b==a || c==a || b==c);
	}
	public static boolean isOnly2Equal(int a,int b,int c) 
	{
		if(b==a || c==a)
		{
			if(b==a && c==a)
			{
				return false;
			}
			else
				return true;
		}
		return false;
		
	}
	public static boolean isDifferent(int a, int b, int c)
	{
		return(a!=b && a!=c && b!=c);
	}
	public static boolean isOverFlow(int a,int b)
	{
		return a+b<0;
	}

	public static void main(String[] args) {
		int a=10;
		int b=10;
		int c=10;
		System.out.println(isSmallest(a,b,c));
		System.out.println(isLargest(a,b,c));
		System.out.println(isBetween(a,b,c));
		System.out.println(isOutside(a,b,c));
		System.out.println(isEqual(a,b,c));
		System.out.println(isAny2Equal(a,b,c)); 
		System.out.println(isOnly2Equal(a,b,c));
		System.out.println(isDifferent(a,b,c));
		System.out.println(isOverFlow(1000000000,2000000000));


	}

}
