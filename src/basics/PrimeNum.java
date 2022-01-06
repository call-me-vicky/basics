package basics;

public class PrimeNum {
	
	public static boolean isPrime(int num)
	{
		if(num!=2 && num%2==0)
			return false;
		
		int n = (int)Math.sqrt(num);
		for(int i=3;i<n;i=i+2)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static void allPrime(int n)
	{
		
		for(int i=3;i<n;i=i+2)
		{
			if(isPrime(i)) 
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(101));
		
		allPrime(1000);
		
	}

}
