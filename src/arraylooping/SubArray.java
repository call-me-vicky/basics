package arraylooping;


public class SubArray {
	public static int[] reverse(int m[],int start,int end)
	{
		int temp;
		
		for(int i=start,j=end-1;i<=j;i++,j--)
		{
			temp=m[i];
			m[i]=m[j];
			m[j]=temp;
		}
		return m;
	}
	public static int[] rotateArray(int[] n, int num)
	{
		reverse(n, 0, n.length-num);
		reverse(n, n.length-num,n.length);
		reverse(n, 0,n.length);
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		ArrayElements.print(rotateArray(array,1));
		System.out.println();
		
		int[] array2 = {5,202,-3,04,15,66,72,89,9};
		ArrayElements.print(rotateArray(array2,1));

	}

}
