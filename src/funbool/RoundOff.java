package funbool;

public class RoundOff {
	public static int nearestOdd(double a)
	{
		if((int)a%2==0)
		{
			if((a+(int)a<0.1)||(a-(int)a<0.1))
			{
				return (int)a-1;
			}
			else
				return (int)a+1;
		}
		else
			return (int)a;
	}

	public static void main(String[] args) {
		System.out.println(nearestOdd(11.1));
		System.out.println(nearestOdd(12.1));
		System.out.println(nearestOdd(12.0009));
		System.out.println(nearestOdd(18.0001));
		System.out.println(nearestOdd(18.0));

		System.out.println(nearestOdd(-11.000000000001));
		System.out.println(nearestOdd(-10.1));
	}

}
