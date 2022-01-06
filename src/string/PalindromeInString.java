package string;

public class PalindromeInString {
	
	public static String largestPalindrome(String s1)
	{
		
		int max=0,j=0;
		String res= new String();
		
		for(int i=0;i<s1.length()-1;i++)
		{
			
			for(j=i+1;j<s1.length()-1;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
					break;
			}
			String str = stringNeed(s1,i,j);
			
			if(StringPrblems.isPalindrome(str.toString()))
			{
				if(str.length()>max)
				{
					max=str.length();
					res = str;
				}
			}
		}
		return res;
	}
	
	public static String stringNeed(String s,int start,int end)
	{
		StringBuilder ss = new StringBuilder();
		
		for(int i=start;i<=end;i++)
		{
			ss.append(s.charAt(i));
		}
		return ss.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		largestPalindrome("abbcccbbmalayalam");
		
		System.out.println(largestPalindrome("mammalayalam"));
	}

}
