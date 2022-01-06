package arraylooping;

public class EvenOddArrange {
	
	public static void evenOdd(int[] arr)
	{
		int l=0,r=arr.length-1;
		int temp=0;
		
		for(;l<=r;)
		{	
			while(arr[l]%2!=1 )
				l++;
			
			while(arr[r]%2!=0 && r>0)
				r--;
			
			if(l>=r)
				break;
			
			temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
		}
	}

	public static void main(String[] args) {
	
		int[] arr1 = new int[] {1,13,4,7,10,15,6,34,2,2,3,1};
		evenOdd(arr1);
		ArrayElements.print(arr1);
		
		arr1 = new int[] {3,7,9,13,11,15,20,16,12,6,2,0};
		evenOdd(arr1);
		ArrayElements.print(arr1);

	}

}
