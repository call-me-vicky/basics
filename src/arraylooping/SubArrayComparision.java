package arraylooping;

public class SubArrayComparision {
	
	public static int findPivot(int arr[])
	{
		int pivot=1;
		int l_add=0;
		int r= pivot+1;
		int r_add=0;
		
		while(r<arr.length)
		{
			r_add=r_add+arr[r];
			r++;
		}
		for(int l=0;l<arr.length-2;l++)
		{
			l_add= l_add+arr[l];
			
			if(l_add==r_add)
				return arr[pivot];
			else
			{
				pivot++;
				r_add=r_add-arr[pivot];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[] {2,3,4,5,4,3,2};
		System.out.println(findPivot(arr1));
		
		
		arr1 = new int[] {2,3,4,5,8,9,3,4,3,2};
		System.out.println(findPivot(arr1));
		
		
		
	}

}
