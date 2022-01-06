package miscellaneous;

public class StringArrayG {
	
	public static int[] arrayAndstring(int n,int x,int y,String str1)
	{
		int temp=0;
		int col= n;
		int row = n;
		int[] arr = new int[2];
		char c;
		char[] carr = new char[n];
		carr = str1.toCharArray();
		
		for(int i=0,j=1;i<carr.length && j<carr.length;i=i+2,j=j+2)
		{
			temp=(int)str1.charAt(j)-48;
			c= carr[i];
			if(c=='L')
			{	
				y=y-(temp%row);
				if(y<0)
					y=row+y;
			}
			else if(c=='R')
			{
				y=y+(temp%row);
				if(y>=row)
					y=y-row;
			}
			else if(c=='U')
			{
				
				x=x-(temp%col);
				if(x<0)
					x=col+x;
			}
			else if(c=='D')
			{
				x=x+(temp%col);
				if(x>=col)
					x=x-col;
			}
		}
		arr[0]=x;
		arr[1]=y;
		return arr;
	}

	public static void main(String[] args) {
	
		System.out.println("******start******");
		int[] arr = new int[2];
		arr = arrayAndstring(8, 3, 4, "R3D4L4U1");
		if(arr[0]==6 && arr[1]==3)
			System.out.println("test1 success");
		
		System.out.println("******end******");

	}

}
