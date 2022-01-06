package twoDarray;

public class TwoDarrayTranspose {
	
	
	public static int[][] twoDtranspose(int arr[][])
	{
		int col = arr.length;
		int row = arr[0].length;
		int temp=0;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
					break;
				
				temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int[][] arr = new int[][] {{1,4,6},{2,5,7},{3,8,9}};
		TwoDarrayPrint.print(arr);
		twoDtranspose(arr);
		TwoDarrayPrint.print(arr);

	}

}
