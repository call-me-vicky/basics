package miscellaneous;

public class TimeFormat {
	
	
	public static String timeFormat(String str1)
	{
		String hr;
		String min;
		String ts;
		
		if(str1.charAt(0)>'0' && str1.charAt(1)>'1')
			ts="PM";
		else
			ts="AM";
		
		hr = hour(str1);
		min= minute(str1);
		
		return hr+":"+min+" "+ts;
	}
	
	public static String hour(String s1)
	{
		int hrs=0;
		int i=0;
		while(s1.charAt(i)!=':')
		{
			hrs=hrs*10;
			hrs=hrs+((int)s1.charAt(i)-48);
			i++;
		}
		if(hrs>12)
			hrs=hrs-12;
		
		if(hrs<10)
			return "0"+hrs;
		else
			return ""+hrs;
	}
	public static String minute(String s1)
	{
		int min=0;
		int i=0;
		while(i<s1.length())
		{
			if(s1.charAt(i)==':')
			{
				i++;
				while(i<s1.length())
				{
					min=min*10;
					min=min+((int)s1.charAt(i)-48);
					i++;
				}
			}
			i++;
		}
		if(min<10)
			return "0"+min;
		else
			return ""+min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(timeFormat("23:43"));
		System.out.println(timeFormat("00:00"));
		
		System.out.println(timeFormat("24:00"));
		System.out.println(timeFormat("1:30"));

	}

}
