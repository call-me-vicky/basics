package arraylooping;

public class MissingNum {
	
	public static int missingNum(int arr[])
	{
		int[] mis= new int[2*arr.length];
		for(int i=0;i<arr.length;i++)
			mis[arr[i]]++;
		
		for(int i=0;i<mis.length;i++)
		{
			if(mis[i]==0)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {9,3,5,1,2,0,8,6,4};
		System.out.println(missingNum(arr));
	}

}
