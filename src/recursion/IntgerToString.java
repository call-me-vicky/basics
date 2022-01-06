package recursion;

public class IntgerToString {
	
	
//	public static String int2String(int n)
//	{
//	
//		StringBuilder sb1 = new StringBuilder();
//		if(n<=9 && n>0)
//		{
//			sb1.append(n);
//			String str2= sb1.toString();
//			return str2;
//		}
//		String str1 = int2String(n/10);
//		sb1 = new StringBuilder(str1);
//		sb1.append(n%10);
//		str1= sb1.toString();
//		return str1;
//	}
	public static String int2String(int n)
	{
		StringBuilder sb1 = new StringBuilder();
		int2String(n,sb1);
		return sb1.toString();
	}
	public static void int2String(int n,StringBuilder sb1)
	{
		if(n<=9 && n>0)
		{
			sb1.append(n);
			return;
		}
		int2String(n/10,sb1);
		sb1.append(n%10);
		return ;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(int2String(432));
		System.out.println(int2String(76));
		
	}

}
