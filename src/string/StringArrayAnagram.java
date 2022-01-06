package string;

public class StringArrayAnagram {
	
	public static String[] arrayAnagram(String s1[])
	{
		String[] ResStr = new String[s1.length];
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i;j<s1.length;j++)
			{
				if(i!=j && StringFunctions.anaogramChAr(s1[i], s1[j]))
				{
					ResStr[i]=s1[i];
					break;
				}
			}
		}
		return ResStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s1 = new String[] {"listen","life","file","enlist","abbc","bbc","silent"};
		StringArrayPrint.prints(arrayAnagram(s1));

	}

}
