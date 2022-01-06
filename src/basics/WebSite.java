package basics;

public class WebSite {
	
	public static int webPages(int x)
	{
		if(x%10==0)
		{
			return x/10;
		}
		else
			return x/10+1;
	}

	public static void main(String[] args) {
		
		if(webPages(57)!=6)
		{
			System.out.println("error1");
		}
		if(webPages(7)!=1)
		{
			System.out.println("error2");
		}if(webPages(37)!=4)
		{
			System.out.println("error3");
		}if(webPages(50)!=5)
		{
			System.out.println("error4");
		}if(webPages(87)!=9)
		{
			System.out.println("error5");
		}
		if(webPages(577)!=58)
		{
			System.out.println("error6");
		}
		else
			System.out.println("sucessfull");
		

	}

}
