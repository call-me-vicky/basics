package arraylooping;

import java.util.Arrays;

public class MedianOfArray {
	
	public static int median(int arr[])
	{
		return median(arr, 0, arr.length);
	}
	
	public static int median(int arr[],int start,int end)
	{
		int mid = (arr.length-1)/2;
		int p = Partitioning.partition(arr);
		System.out.println(Arrays.toString(arr));
		
		if(mid==p)
			return arr[mid];
		
		if(p<mid)
			return median(arr,p+1,end);
		else //if(p>mid)
			return median(arr,start,p);
		
	}

	public static void main(String[] args) {
		int[] arr1= {28,79,40,9,98,16,55,34,76,51,41,65,13,85,60,52,67,90,34};
//		System.out.println(median(arr1));
//
//		arr1= new int[] {34,76,51,41,65,13,155,60,52,67,90,34};
//		System.out.println(median(arr1));
		
		arr1 = new int[] {8,6,2,5,4,3,9,0,1,7};
		System.out.println(median(arr1));
		
		Arrays.parallelSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}

}
