package basics;

public class MoneyPrblm2_1 {
	
	public static void mainCount(int amount)
	{
		int x,y,z,tot;
		x=amount/2000;
		amount = amount%2000;
		y=amount/500;
		amount=amount%500;
		z=amount/100;
		tot=x+y+z;
		System.out.println(tot);
	}

	public static void main(String[] args) {
		mainCount(2600);
		mainCount(400);
		mainCount(600);
	}

}
