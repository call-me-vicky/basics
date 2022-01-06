package basics;

public class Moneyprblm1 {
	
	
	public static void atm45(int amount)
	{
		if(amount>=12)
		{
			int rem1,rem2;
			rem1 = amount%4;
			amount = amount-rem1*5;
			rem2 = amount/4;
			
			System.out.println(rem2 +", "+rem1);
		}
		
	}
	public static void main(String[] args) {
		atm45(13);
		atm45(15);

		atm45(25);

	}

}
