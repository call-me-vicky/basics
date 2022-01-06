package arraylooping;

public class DutchFlag {
	
	public static int[] flagClrArrange(int arr[])
	{
		int s=0,m=0,e=arr.length-1;
		while(m<=e)
		{
			if(arr[m]==0)
			{
				swap(arr,s,m);
				m++;
				s++;
			}
			else if(arr[m]==1)
			{
				m++;
			}
			else if(arr[m]==2)
			{
				swap(arr,m,e);
				e--;
			}
		}
		return arr;
	}
	
	public static int[] swap(int arr[],int i,int j) {
		int temp=0;
		
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = new int[] {0,0,1,2,1,1,1,0,0,0,0,1};
		flagClrArrange(arr);
		ArrayElements.print(arr);
		
		arr = new int[] {2,2,2,2,2,2,2,2,2,2,2,0};
		flagClrArrange(arr);
		ArrayElements.print(arr);
		
		arr = new int[] {2,2,2,2,2,1,1,1,1,1,1,0};
		flagClrArrange(arr);
		ArrayElements.print(arr);
		
		arr = new int[] {1,1,2,2,2,1,1,0,0,1,1,0};
		flagClrArrange(arr);
		ArrayElements.print(arr);

	}

}
