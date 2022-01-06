package arraylooping;

public class MergeSort {
	
	public static int[] mSort(int[] arr)
	{
		return mSort(arr,0,arr.length);
	}
	
	public static int[] mSort(int arr[],int start,int end)
	{
		int mid= (start+end)/2;
		int[] la = new int[(mid-start)+1];
		int[] ra = new int[end-mid];
		
		for(int i=0;i<(mid-start)+1;i++)
			la[i] = arr[start+i];
		
		for(int j=0;j<(end-mid);j++)
			ra[j] = arr[mid+j];
		
		
		if(end-start>5)
		{
			mSort(arr,start,mid);
			mSort(arr,mid,end);
		}
		SelectionSort.sSort(la);
		SelectionSort.sSort(ra);
		return Merge.sortedMerge(la,ra);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = new int[] {10,7,9,8,0,4,2,3,1,6};
//		ArrayElements.print(mSort(arr,0,arr.length));
		
		System.out.println("test started");
		
		int[] arr1= RandomNumbersArray.generateData(10);
//		QuickSort.quickSort(arr1);
		System.out.println("quick sort test completed");
		mSort(arr1);
		System.out.println("merge sort test completed");
	}

}
