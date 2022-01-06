package looping;

public class NumberReverse {
	
	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		return rev;
	}
	public static boolean isPalindrome(int n)
	{
		return reverse(n)==n;
	}
	public static int countDigits(int n)
	{
		int count=0;
		while(n>0)
		{
			count=count+1;
			n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(reverse(2056));
		//this case fails
		System.out.println(reverse(190000));
		//this case fails, when max value is reversed the  value got overflowed
		System.out.println(reverse(Integer.MAX_VALUE));
		System.out.println(isPalindrome(1331));
		System.out.println(countDigits(1331));
		System.out.println(countDigits(133100));
	}

}
