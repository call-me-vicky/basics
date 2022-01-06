package basics;

public class ValueCmp {
	
	public static int lwstMiddle(int a, int b)
	{
		int c;
		//c = (a+b)/2;
		c = a+(b-a)/2;
		
		return c;
	}

	public static void main(String[] args) {
		
	
		System.out.println(lwstMiddle(1000000000,2000000000));
		System.out.println(lwstMiddle(Integer.MAX_VALUE,Integer.MAX_VALUE));
	}

}
