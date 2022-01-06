package funbool;

public class TriangleTypes {
	
	public static void triangleType(int a,int b,int c)
	{
		if(a>c-b && b>a-c && c > b-a)
		{
			if(BooleanPractice.isEqual(a, b, c)==true)
			{
				System.out.println("equilateral");
			}
			else if(BooleanPractice.isDifferent(a, b, c)==true)
			{
				System.out.println("scalene");
			}
			else //if(BooleanPractice.isAny2Equal(a, b, c)==true)
			{
				System.out.println("Isoceles");
			}
		}
		else
			System.out.println("Not formed");
	}

	public static void main(String[] args) {
		triangleType(10,10,10);
		triangleType(1,3,1);
		triangleType(1,2,-3);
		triangleType(11,21,31);
		triangleType(11,21,11);
		triangleType(2000000000,2000000000,2000000000);
		triangleType(Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);

		triangleType(0,0,0);
		triangleType(-2000000000,-2000000000,-2000000000);
	}

}
