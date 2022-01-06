package arraylooping;

public class InserstionSort {
	
	public static int[] iSort(int[] array)
	{
		int small;
		for(int i=1;i<array.length;i++)
		{
			small=array[i];
			for(int j=i;j>=0;j--)
			{
				if(j==0 && array[j]>small)
				{
					array[0]=small;
				}
				else if(small>array[j])
				{
					array[j+1]=small;
					break;
				}
				else if(small<=array[j]&&j>0)
				{
					array[j]=array[j-1];
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		
		
		int[] arr = {20,12,9,18,5,15};
		ArrayElements.print(iSort(arr));
		System.out.println();
		
		int[] arr1 = {100,94,9,-8,0,500,-9000};
		ArrayElements.print(iSort(arr1));

	}

}
