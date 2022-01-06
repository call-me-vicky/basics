package funbool;

public class RandomNumbers {
	
	public static void randInt(int no_1,int no_2)
	{
		double random;
		random = (no_2-no_1)*Math.random()+no_1;
		int rand = (int)random;
		System.out.println(rand);
	}

	public static void main(String[] args) {
		randInt(2,10);
		
	}

}
