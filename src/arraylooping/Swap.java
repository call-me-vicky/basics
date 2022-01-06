package arraylooping;

public class Swap {

	
	public static int[] swap(int[] arr,int index1,int index2)
	{
		int temp=0;
		temp= arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
