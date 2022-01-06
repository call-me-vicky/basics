package string;

public class StringArrayPractice {
	
	static String[] str1 = new String[] {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	
	public static int dayOfWeek(String s1)
	{
		s1=s1.toLowerCase();
		
		for(int i=0;i<7;i++)
		{
			if(SubString.isSubString(str1[i],s1))
				return i;
		}
		return -1;
	}
	
	public static String weekDay(int n)
	{
		if(n<=7)
			return str1[n];
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(dayOfWeek("tues"));
		System.out.println(dayOfWeek("MoNdAY"));
		
		System.out.println(weekDay(9));

	}

}
