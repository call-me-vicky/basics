package funbool;

public class NumberNature {
	
	public static boolean isEven(int a)
	{
		 return a%2==0;
	}
	public static boolean isOdd(int a)
	{
		return a%2!=0;

	}

	public static void main(String[] args) {
		if(isOdd(10000001)!=true)
		{
			System.out.println("error");
		}
		if(isEven(2)!=true)
		{
			System.out.println("error");
		}
		if(isEven(100)!=true)
		{
			System.out.println("error");
		}
		if(isOdd(25)!=true)
		{
			System.out.println("error");
		}
		else
			System.out.println("sucessful");
	}

}
