package basics;

public class Mean {
	
	
	public static double meanVal(int a,int b,int c)
	{
		double d;
		d = (a+b+c)/3.0;
		System.out.println(d);
		return d;
		
	}

	public static void main(String[] args) {
		
		meanVal(20,25,46);
		meanVal(200,125,46);
		meanVal(0,5,6);
		meanVal(0,0,4);
	}

}
