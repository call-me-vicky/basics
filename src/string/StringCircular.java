package string;

public class StringCircular {
	
	public static boolean isStringCircular(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		
		String temp;
		for(int i=0;i<s2.length();i++)
		{
			temp = rotate(s1,i);
			if(temp.equals(s2))
				return true;
		}
		return false;
	}
	
//	public static String rotate(String s2,int start,int end)
//	{
//			StringBuilder sb1 = new StringBuilder(s2);
//			StringBuilder sb2 = new StringBuilder();
//			sb2.append(sb1.charAt(end-1));
//			for(int i=start;i<end-1;i++)
//			{
//				sb2.append(sb1.charAt(i));
//			}
//			
//			for(int j=end;j<s2.length();j++)
//			{
//				sb2.append(sb1.charAt(j));
//			}
//			s2= sb2.toString();
//			
//			return s2;
//	}
	
	public static String rotate(String s2,int n)
	{
		
		StringBuilder sb2 = new StringBuilder();
		
		sb2.append(subString(s2,s2.length()-n,s2.length()));
		sb2.append(subString(s2,0,s2.length()-n));

		s2 = sb2.toString();
		return s2;
	}
	public static StringBuilder subString(String s2,int start,int end)
	{
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=start;i<end;i++)
			sb2.append(s2.charAt(i));
		
		return sb2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isStringCircular("listen", "enlisten"));

	}

}
