package funbool;

public class CharPrblms {
	
	public static boolean isLower(char a)
	{
		return(a>='a' && a<='z');
	}
	public static boolean isUpper(char a)
	{
		return(a>='A'&&a<='Z');
	}
	public static boolean isalphabet(char a)
	{
		return((a>='A'&&a<='Z')||(a>='a'&&a<='z'));
	}
	public static boolean isNumeral(char a)
	{
		return(a>='0'&&a<='9');
	}
	public static boolean isAlphNumeric(char a)
	{
		return((a>='0'&&a<='9')||(a>='A'&&a<='Z')||(a>='a'&& a<='z'));
	}
	public static boolean isPunctuation(char a)
	{
		return(a<'0' || a>'9')&&(a<'A'||a>'Z')&&(a<'a'|| a>'z');
	}
	public static char toLower(char a)
	{
		if(a>='A' && a<='Z')
		{
			return (char)(a+32);
		}
		else
			return a;
		
	}
	public static char toUpper(char a)
	{
		if(a>='a' && a<='z')
		{
			return (char)(a-32);
		}
		
		return a;
		
	}

	public static void main(String[] args) {
		
		if(isLower('b')!=true)
		{
			System.out.println("lower case");
		}
		if(isUpper('M')!=true)
		{
			System.out.println("error");
		}
		if(isLower('Z')!=false)
		{
			System.out.println("error");
		}
		System.out.println(isPunctuation('0'));
		System.out.println(isPunctuation(']'));
		System.out.println(isPunctuation(':'));
		//System.out.println(isAlphNumeric('B'));
		System.out.println(toUpper('w'));
		System.out.println(toLower('L'));

	}

}
