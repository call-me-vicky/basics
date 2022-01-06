package string;

public class SubSequence {

	public static boolean isSubString(String s1,String s2)
	{
		int count=0;
		int j=0;
		if(s1.length()<s2.length())
			return false;
		for(int i=0;i<s2.length();i++)
		{
			for(;j<s1.length();j++)
			{
				if(s2.charAt(i)==s1.charAt(j))
				{
					count= count+1;
					break;
				}
			}
		}
		return count==s2.length();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isSubString("happybirthdayabcxyz", "pitay"));

	}

}
