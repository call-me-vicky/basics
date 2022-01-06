package arraylooping;

public class Partitioning {
	
	
	public static int partition(int arr[])
	{
		return partition(arr,0,arr.length);
	}
	
	private static int partition(int arr[],int start, int end)
	{
		if(arr.length==0)
			return 0;

		int l=start,r=end-2;
		int pivot= end-1;
		int temp=0;
		
		for(;l<=r;)
		{	
			while(arr[l]<arr[pivot] )
				l++;
			
			while(arr[r]>=arr[pivot] && r>start)
				r--;
			
			if(l>=r)
				break;
			
			temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
		}
		
		temp=arr[l];
		arr[l]=arr[pivot];
		arr[pivot]=temp;
		
		return l;
	}

	public static void main(String[] args) {
	
		
	}

}
