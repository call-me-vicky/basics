package funbool;

public class IntegerCmpr {
	
	public static boolean isPos(int n)
	{
		return n>0;
	}
	public static boolean isNeg(int n)
	{
		return n<0;
	}
	public static boolean isPosOrNeg(int n)
	{
		return (n>0 || n<0);
	}
	public static boolean isNePosNoNeg(int n)
	{
		return n==0;
	}
	public static boolean sameSign(int a, int b)
	{
		return ((a>0 && b>0)||(a<0&&b<0));
	}

	public static void main(String[] args) {
		 if(isPos(10)!=true)
		 {
			 System.out.println("error in postive value");
		 }
		 if(isNeg(-23)!=true)
		 {
			 System.out.println("error in negativ value");
		 }
		 if(isPosOrNeg(0)==true)
		 {
			 System.out.println("error");
		 }
		 if(isNePosNoNeg(0)==false)
		 {
			 System.out.println("error");
		 }
		 if(sameSign(5,4)==false)
		 {
			 System.out.println("error");
		 }
		 else
			 System.out.println("code run successfully");
	}

}
