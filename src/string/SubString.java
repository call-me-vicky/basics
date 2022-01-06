

package string;

public class SubString {
	
	public static boolean isSubString(String s1,String s2)
	{
		if(s2.length()>s1.length())
			return false;
		for(int i=0;i<s1.length();i++)
		{
			int count=0;
			for(int j=0,k=i;j<s2.length() && k<s1.length();j++,k++)
			{
				if(s1.charAt(k)==s2.charAt(j))
				{
					count=count+1;
				}
			}
			if(count==s2.length())
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isSubString("abracadabraka", "cada"));
		System.out.println(isSubString("abracadabraka", "aDa"));
		System.out.println(isSubString("listentome", "istenme"));

	}

}
