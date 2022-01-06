package miscellaneous;

public class XpowerN {

	public static int xPowerN(int x,int n)
	{
		int result=1;
		int px = 1;	// power of x.
		for(int i=1;i<=n;i++)
		{
			px = px * x;
			result = result+px;
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(xPowerN(2,5));
		
		System.out.println(xPowerN(10,3));

	}

}
