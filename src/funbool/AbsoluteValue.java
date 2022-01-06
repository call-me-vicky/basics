package funbool;

public class AbsoluteValue {

	public static int abs(int a)
	{
		if(a<0)
		{
			return a*-1;
		}
		else
			return a;
	}
	public static void main(String[] args) {
		System.out.println(abs(-38));
		System.out.println(abs(0));
		System.out.println(abs(10));

	}

}
