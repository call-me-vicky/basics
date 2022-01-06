package NestedLoops;

import arraylooping.ArrayElements;;

public class RotateUsingNloop {
	
	public static int[] nRotate(int n[], int num)
	{
		if(num>n.length)
		{
			num=num/n.length;
		}
		for(int k=0;k<num;k++)
		{
			ArrayElements.rotate(n);
		}
		return n;
	}

	public static void main(String[] args) {
		int[] result;
		int[] arr = {1,2,3,5,7,12,15,18,23,28,34};
		
		result = nRotate(arr, 35);
		
		ArrayElements.print(result);
		

	}

}
