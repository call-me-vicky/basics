package twoDarray;

public class TwoDarrayPrint {
	
	public static void print(int arr[][])
	{
		int col = arr.length;
		int row = arr[0].length;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
