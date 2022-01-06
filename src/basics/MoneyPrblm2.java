package basics;

public class MoneyPrblm2 {
	
	public static void maniCount(int amount)
	{
		if(amount%100==0)
		{
			int x,y,z;
			int count=0;
			while(amount>0)
			{
				x=amount/100;
				y=amount/500;
				z=amount/2000;
				if(x>4 & y>4)
				{
					amount= amount-2000*z;
					count =count+1*z;
					x=0;
					y=0;
				}
				else if(x>4)
				{
					amount=amount-500*y;
					count=count+1*y;
					x=0;
				}
				else
					amount=amount-100*x;
					count=count+1*x;
			}
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		
		maniCount(4000);
		maniCount(400);
		maniCount(2600);
		maniCount(800);
		maniCount(10000);

		

	}

}
