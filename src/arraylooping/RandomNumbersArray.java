package arraylooping;

public class RandomNumbersArray {
	
	
	public static int[] randomArray(int array[])
	{
		for(int index=0;index<array.length;index++)
		{
			array[index]= (int)((array.length)*Math.random());
		}
		return array;
	}
	
	public static void performanceTest()
	{
		int baseSize = 100000;
		int d[] = generateData(baseSize);
		QuickSort.quickSort(d);
		System.out.println("quicksort completed");
		//Arrays.sort(d);
		SelectionSort.sSort(d);
		
		System.out.println("test completed");
	}
	
	public static int [] generateData(int size)
	{
		int data[] = new int[size];
		for(int i=0; i<size; i++)
			data[i] = randomInt(0, Integer.MAX_VALUE);
		
		return data;
	}
	public static int randomInt(int a, int b)
	{
		return a + (int)((b-a)*Math.random());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[1000];
		
		
		ArrayElements.print(randomArray(array));

	}

}
