
package funbool;

public class DistancePoint {
	
	public static double dist(int a, int b, int c, int d)
	{
		double dist;
		dist = Math.sqrt(((c-a)*(c-a)+(d-b)*(d-b)));
		return dist;

	}

	public static void main(String[] args) {
		
		
		System.out.println(dist(4,5,6,7));
		System.out.println(dist(14,5,24,7));
		System.out.println(dist(41,27,66,19));
		System.out.println(dist(0,3,0,7));


	}

}
