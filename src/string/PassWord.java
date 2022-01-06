package string;

public class PassWord {
	
//	public static boolean pssLower(String s)
//	{
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)>='a' && s.charAt(i)<='z')
//			{
//				return true;
//			}
//		}
//		return false;
//	}
//	public static boolean pssUpper(String s)
//	{
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
//			{
//				return true;
//			}
//		}
//		return false;
//	}
//	public static boolean pssNumeral(String s)
//	{
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)>='0' && s.charAt(i)<='9')
//			{
//				return true;
//			}
//		}
//		return false;
//	}
//	public static boolean pssLength(String s)
//	{
//		if(s.length()==5)
//		{
//			return true;
//		}
//		else
//			return false;
//	}
	public static boolean isStrongPassword(String s)
	{
		boolean str1=false;
		boolean str2=false;
		boolean numerical=false;
		for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='a' && s.charAt(i)<='z')
				{
					str1=true;
				}
				else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				{
					str2=true;
				}
				else if(s.charAt(i)>='0' && s.charAt(i)<='9')
				{
					numerical=true;
				}
			}
		return str1 && str2 && numerical && s.length()>=5;
	}

	public static void main(String[] args) {
		String s="5KvCl";
		System.out.println("password is strong: "+isStrongPassword(s));

	}

}
