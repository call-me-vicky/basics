package arraylooping;

public class FindingSmallestNum {
	
	
	public static int smallestNum(int arr[])
	{
		int small= arr[0];
		int large = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(small>arr[i])
				small=arr[i];
			if(large<arr[i])
				large=arr[i];
		}
		
		return small;
	}
	
	public static int KthSmallest(int arr[],int start,int end,int k)
	{
		int p = Partitioning.partition(arr);
	
		if(k==p)
			return arr[k];
		
		if(p<k)
			return KthSmallest(arr, p, end, k);
		else if(p>k)
			return KthSmallest(arr, start, p, k);
		else 
			return -1;
	}

	public static void main(String[] args) {
		
		
		int[] arr = new int[] {4,5,6,7,8,0,9,2,3,1};
		System.out.println(smallestNum(arr));
		
		arr = new int[] {4,5,6,7,8,0,9,2,3,1};
		System.out.println(KthSmallest(arr,0,arr.length,3));
		
		arr = new int[] {4,5,6,7,8,0,9};
		System.out.println(KthSmallest(arr,0,arr.length,4));
	}

}
