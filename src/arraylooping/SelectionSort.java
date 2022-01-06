package arraylooping;

public class SelectionSort {

	public static int[] sSort(int[] array)
	{
		int small_loc=0;
		int lar=0;
		for(int i=0;i<array.length;i++)
		{
			small_loc=i;
			
			for(int j=i+1;j<array.length;j++)
			{
				if(array[small_loc]>array[j])
				{
					small_loc=j;
				}
			}
			
			lar=array[i];
			array[i]=array[small_loc];
			array[small_loc]=lar;
		}
		return array;
	}
	public static void main(String[] args) {
		
		int[] arr = {20,12,9,18,5,15};
		ArrayElements.print(sSort(arr));
		System.out.println();
		
		int[] arr1 = {100,94,9,-8,0,500};
		ArrayElements.print(sSort(arr1));

	}

}
