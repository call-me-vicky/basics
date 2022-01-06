package recursion;

public class EuclidianAlgo {
	
	public static int gcd(int a,int b)
	{
		if(a==0)
		{
			return b;
		}
		else 
			return gcd(b%a,a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(gcd(36,60));
		System.out.println(gcd(20,24));

	}

}
