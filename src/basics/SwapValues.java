package basics;

public class SwapValues {
	
	public static void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"\t"+b);
	}

	public static void main(String[] args) {
		swap(3,5);
		swap(3,8);
		swap(17,5);
		swap(3,50);

	}

}
