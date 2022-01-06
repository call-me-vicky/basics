package funbool;

public class IntCmpr {
	
	public static int compare(int a,int b)
	{
//		if(a==b)
//		{
//			return 0;
//		}
//		else if(a<b)
//		{
//			return -1;
//		}
//		else
//			return 1;
		return a-b;
	}

	public static void main(String[] args) {
		if(compare(0,0)!=0)
		{
			System.out.println("error a=b");
		}
		if(compare(-1,-1)!=0)
		{
			System.out.println("error a=b");
		}if(compare(15,4)<0)
		{
			System.out.println("error a>b");
		}if(compare(4,15)>0)
		{
			System.out.println("error a<b");
		}
		System.out.println("test completed");
		

	}

}
