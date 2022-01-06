package recursion;

public class BinarySearch {
	
	public static int binarySearch(int arr[],int num)
	{
		return binarySearch(arr,num,0,arr.length);
	}
	public static int binarySearch(int arr[],int n,int start,int end)
	{
		int mid=(start+end)/2;
		if(start>end || mid>arr.length-1)
			return -1;
		if(n==arr[mid])
			return mid;
		else if(n<arr[mid])
			return binarySearch(arr,n,start,mid);
		else if(n>arr[mid])
			return binarySearch(arr,n,mid+1,end);
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] m= {1,4,5,6,9,15,18,21,33,41,90};
		System.out.println(binarySearch(m,6));
	}

}
