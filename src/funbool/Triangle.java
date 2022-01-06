package funbool;

public class Triangle {
	
	public static boolean isTriangle(int a,int b,int c)
	{
		return ((a+b)>c &&(b+c)>a &&(a+c)>b);
	}
	public static boolean isRightTriangle(int a,int b,int c)
	{
		if(a<c && b<c)
		{
			return((a*a+b*b)==(c*c));
		}
		else if(a<b && c<b)
		{
			return((a*a+c*c)==(b*b));
		}
		else if(b<a &&c<a)
		{
			return((c*c+b*b)==(a*a));
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isTriangle(4,5,6));
		System.out.println(isRightTriangle(4,3,5));
		System.out.println(isRightTriangle(3,5,4));
		System.out.println(isRightTriangle(4,5,3));
		System.out.println(isRightTriangle(4,3,9));
	}

}
