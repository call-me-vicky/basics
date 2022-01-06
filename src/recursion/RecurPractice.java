package recursion;

public class RecurPractice {
	
	
	public static void recur(int n)
	{
		if(n==0)
			return;
		System.out.println("entry:"+n);
		recur(n-1);
		System.out.println("leaving:"+n);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		recur(5);

	}

}
