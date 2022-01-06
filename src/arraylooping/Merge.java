package arraylooping;

public class Merge {
	
	public static int[] sortedMerge(int m[],int n[])
	{
		int dim = m.length+n.length-1;
		int i=0,j=0;
		int l=0;
		int[] k = new int[dim];
		
		while(i<m.length && j<n.length)
		{
			if(m[i]<n[j])
			{
				k[l]=m[i];
				i++;
				l++;
			}
			else if(m[i]>n[j])
			{
				k[l]=n[j];
				j++;
				l++;
			}
			else
			{
				k[l]=m[i];
				i++;
				j++;
				l++;
			}
		}
		while(i<m.length)
		{
			k[l]=m[i];
			i++;
			l++;
		}
		while(j<n.length)
		{
			k[l]=n[j];
			j++;
			l++;
		}
		return k;
	}

	public static void main(String[] args) {
		int[] m= {1,5,9,14,18,20,56,89};
		int[] n= {2,3,7,9,12,14,16,150};
		ArrayElements.print(sortedMerge(m, n));
		

	}

}
