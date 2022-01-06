package funbool;

public class LeapOrNonLeap {
	
	public static boolean leap(int n)
	{
		return n%400==0 || n%100!=0 &&n%4==0;
	}

	public static void main(String[] args) {
		if(leap(1500)!=false)
		{
			System.out.println("error for 1500");
		}
		if(leap(1700)!=false)
		{
			System.out.println("erro for 1700");
		}
		if(leap(2016)!=true)
		{
			System.out.println("error for 2016");
		}
		else
			System.out.println("all value passed");

	}

}
