package string;

public class StringPrblems {
	
//	public static int countLowercase(String s) {
//		int count=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)>='a' && s.charAt(i)<='z')
//			{
//				count=count+1;
//			}
//		}
//		return count;
//	}
//	public static int countVowels(String s) 
//	{
//		int count=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' || s.charAt(i)=='u')
//			{
//				count=count+1;
//			}
//		}
//		return count;
//	}
//	public static int countConsonants(String s) 
//	{
//		int count=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u')
//			{
//				count=count+1;
//			}
//		}
//		return count;
//	}
	public static boolean isPalindrome(String s)
	{
		int j;
		int i;
		for(j=0,i=s.length()-1; j<i ;i--,j++)
		{
			if(s.charAt(j)!=s.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
	public static int wordCount(String s)
	{
		int i=0;
		int count1=0;
		int count2=0;
		while(i<s.length())
		{
			while(s.charAt(i)!=' ' && i<s.length()-1)
			{
				count1=count1+1;
				i++;
			}
			if(s.charAt(i)==' ' && count1>0 || i==s.length()-1)
			{
				count2=count2+1;
				count1=0;
			}
			i++;
		}
		return count2;
	}
//	public static boolean isEqual(String s1,String s2)
//	{
//		if(s1.length()!=s2.length())
//		{
//			return false;
//		}
//		else if(s1.length()==s2.length())
//		{
//			for(int i=0;i<s1.length();i++)
//			{
//				if(s1.charAt(i)!=s2.charAt(i))
//				{
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//	public static int compare(String s1,String s2)
//	{
//		for(int i=0;i<s1.length() && i<s1.length();i++)
//		{	
//			if(s1.charAt(i)!=s2.charAt(i))
//			{
//				return s1.charAt(i)-s2.charAt(i);
//			}
//		}
//		return 0;
//	}
//		
//	public static int int2String(String s)
//	{
//		int number=0;
//		for(int i=0;i<s.length();i++)
//		{
//			number= number*10+s.charAt(i)-48;
//		}
//		return number;
//	}
//
	public static void main(String[] args) {
		//System.out.println(countLowercase(s));
		//System.out.println(isPalindrome("deed"));
		//String k="have a nice day,wish you many more happy birthday? is it your birthday";
		//System.out.println(compare("apply", "appoinment"));
		//System.out.println(isEqual("apply", "apply"));
		//System.out.println(int2String("09234798"));

	
		//System.out.println(wordCount(k));
		System.out.println(wordCount("this is a string"));
		
		System.out.println(wordCount(" abc def ijk "));
		
		System.out.println(wordCount("good morning,have nice day "));

		//if (s == s2)
			//System.out.println("Hello");
	}

}
