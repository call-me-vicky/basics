package arraylooping;


public class QuickSort {
	
	public static void quickSort(int arr[])
	{
		quickSort(arr,0,arr.length);
	}
	public static void quickSort(int arr[],int start,int end)
	{
		if(start<end) {
			int p = Partitioning.partition(arr);
			quickSort(arr,start,p);
			quickSort(arr,p+1,end);
		}
		return ;
	}

	public static void main(String[] args) {
		
		int[] arr1= {28,79,40,9,98,16,55,34,76,51,41,65,13,85,60,52};
		quickSort(arr1);
		ArrayElements.print(arr1);

		int[] arr2= new int[] {13,4,89,32,0,0,0,0};
		quickSort(arr2,0,arr2.length);
		ArrayElements.print(arr2);

		//performanceTest();
		
		arr2= new int[] {0,-1,90,3,0,0,0,0};
		quickSort(arr2,0,arr2.length);
		ArrayElements.print(arr2);

	}

}
