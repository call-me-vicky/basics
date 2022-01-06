package arraylooping;

public class ArrayElements {

	public static void print(int m[])
	{
		for(int i=0;i<m.length;i++)
		{
			System.out.print(m[i]+" ");
		}
		System.out.println();
	}
//	public static void reversePrint(int m[])
//	{
//		for(int j=m.length-1;j>=0;j--)
//		{
//			System.out.print(m[j]+" ");
//		}
//	}
//	public static int smallest(int m[])
//	{
//		int small=m[0];
//		for(int i=1;i<m.length;i++)
//		{
//			if(m[i]<small)
//			{
//				small=m[i];
//			}
//		}
//		return small;
//	}
//	public static double mean(int m[])
//	{
//		int mean_val=0;
//		for(int i=0;i<m.length;i++)
//		{
//			mean_val=mean_val+m[i];
//		}
//		return (double)mean_val/m.length;
//	}
	public static int[] reverse(int m[],int start,int end)
	{
		int inter1;
		int inter2;
		int lar_index= end-1;
		for(int i=start;i<=lar_index;i++)
		{
			inter1=m[i];
			inter2=m[lar_index];
			m[i]=inter2;
			m[lar_index]=inter1;
			lar_index=lar_index-1;
			
		}
		return m;
	}
//	public static int linearSearch(int m[],int n)
//	{
//		for(int i=0;i<m.length;i++)
//		{
//			if(m[i]==n)
//			{
//				return i;
//			}
//		}
//		return -1;
//	}
//	public static boolean isEqual(int m[],int n[])
//	{
//		if(m.length< n.length || m.length>n.length)
//		{
//			return false;
//		}
//		else
//			for(int i=0;i<m.length;i++)
//			{
//				if(m[i]!=n[i])
//				{
//					return false;
//				}
//			}
//		return true;
//	}
//	public static void counts(int l[])
//	{
//		int[] count = {0,0,0};
//		//int[] r = {0,1,2,3,4,5,6,7,8,9};
//		for(int i=0;i<l.length;i++)
//		{
//			count[l[i]%10]++;
//		}
//		System.out.println("0's: "+count[0]+" 1's: "+count[1]+" 2's: "+count[2]);
//	}
//	public static boolean isAscending(int k[])
//	{
//		for(int i=0;i<k.length-1;i++)
//		{
//			if(k[i]>k[i+1])
//			{
//				return false;
//			}
//		}
//		return true;
//	}
//	public static int[] duplicate(int n[])
//	{
//		int dup[]= new int[n.length];
//		for(int i=0;i<n.length;i++)
//		{
//			dup[i]=n[i];
//		}
//		return dup;
//	}
	public static int[] rotate(int n[])
	{
		int lst_value = n[n.length-1];
		for(int i=n.length-1;i>0;i--)
		{
			n[i]=n[i-1];
		}
		n[0]=lst_value;
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] m= {1,2,3,4,5,6,8};
//		print(m);
//		System.out.println();
//		reversePrint(m);
//		System.out.println();
//		System.out.println(smallest(m));
//		System.out.println(mean(m));
//		reverse(m);
//		System.out.println();
//		System.out.println(linearSearch(m, 5));
//		int[] n= {8,6,5,4,3,2,1};
//		int[] k= {1,2,3,4,5,6,8};
//		System.out.println(isEqual(k, n));
//		int[] l= {31,30,30,32,30,31,32,31,32,30,31,30,30,32,32,32,32};
//		counts(l);
//		System.out.println(isAscending(n));
//		int[] s= {8,6,5,4,3,2,1};
//		int[] dup = duplicate(s);
//		for(int i=0;i<dup.length;i++)
//		{
//			System.out.print(dup[i]);
//		}
		//int[] s= {1,2,3,4,5,6,7,8};
		//rotate(s);

	}

}
