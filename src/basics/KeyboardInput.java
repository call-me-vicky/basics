package basics;

import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(args.length);
		
		int i=0;
		while(i<args.length)
		{
			int x = Integer.parseInt(args[i]);
			System.out.println(x);
			i++;
		}
	}

	public static void experimentScanner()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Pls enter an integer");
		
		while(s.hasNextInt())
		{
			int x = s.nextInt();
			System.out.println(x);
		}
		s.close();
		
	}
}
