package basics;

import java.util.*;

public class TempConv {
	
	public static double tmpconv(int celsius)
	{
		double farenheit;
		farenheit = ((9.0/5.0)*celsius+32);
		System.out.println(farenheit);
		return farenheit;
	}
	public static int tempconvc(float farenheit)
	{
		int celsius;
		int far = (int)farenheit;
		celsius = (far-32)*5/9;
		return celsius;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cel;
		float far;
		String input;
		input= sc.nextLine();
		if(input.equals("f"))
		{
			cel = sc.nextInt();
			System.out.println("the farenheit:"+tmpconv(cel));
		}
		else if(input.contentEquals("c"))
		{
			far = sc.nextFloat();
			System.out.println("the celsius is:"+tempconvc(far));
		}
		sc.close();

	}

}
