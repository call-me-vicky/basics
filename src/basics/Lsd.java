package basics;

import java.util.*;

public class Lsd {
	
	public static int lsdigit(int x) {
		int rem;
		rem = x%10;
		return rem;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		System.out.println("least significant digit is:"+lsdigit(x));
		sc.close();

	}

}
