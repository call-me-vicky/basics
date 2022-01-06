package funbool;

public class SmallestValue {
	
	public static int smallest(int a,int b,int c)
	{
		int smallest=a;
		if(smallest>b)
		{
			smallest=b;
		}
		if(smallest>c)
		{
			smallest=c;
		}
		return smallest;
	}
	public static void main(String[] args) {
	
		int res;
		res = smallest(0,0,0);
		if(res!=0)
			System.out.println("failed: case1: 0,"+res);
		
		res = smallest(1,10,7);
		if(res!=1)
			System.out.println("failed: case2: 1,"+res);

		res = smallest(3,2,8);
		if(res!=2)
			System.out.println("failed: case3: 2,"+res);

		res = smallest(3,2,1);
		if(res!=1)
			System.out.println("failed: case4: 1,"+res);
		

		System.out.println("test completed");


	}

}
