package arraylooping;

public class Search {
	
	public static int binarySearch(int m[],int n)
	{
		int small=0;
		int lar=m.length;
		while(lar>=small)
		{
			int mid=(small +lar)/2;
			if(n<m[mid])
			{
				lar=mid-1;
			}
			else if(n>m[mid])
			{
				small=mid+1;
		
			}
			else
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m= {1,4,5,6,9,15,18,21};
		System.out.println(binarySearch(m,21));

	}

}
