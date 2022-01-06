package string;

import java.util.Arrays;


public class StringFunctions {
	
	public static boolean anaogramChAr(String s1,String s2)
	{
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		
		if(str1.length==str2.length)
		{
			Arrays.sort(str1);
			Arrays.sort(str2);
			for(int i=0;i<s1.length();i++)
			{
				if(str1[i]!=str2[i])
				{
					return false;
				}
				
			}
			return true;
		}
		else
			return false;
	}
	public static boolean anaogramInAr(String s1,String s2)
	{
		int[] sarr1= characterCount(s1);
		int[] sarr2= characterCount(s2);
		if(sarr1.length==sarr2.length)
		{
			for(int i=0;i<26;i++)
			{
				if(sarr1[i]!=sarr2[i])
				{
					return false;
				}
			}
			return true;
		}
		else
			return false;
	}
	public static int[] characterCount(String s1)
	{
		int[] arr = new int[26];
		for(int i=0;i<s1.length();i++)
		{
			arr[s1.charAt(i)-'a']++;
		}
		return arr;
		
		
	}
	public static void main(String[] args) 
		{
//		System.out.println(anaogramChAr("file", "life"));
//		System.out.println(anaogramChAr("abcc", "abbc"));
		//System.out.println(anaogram("file", "life"));
		
		//int[] arr = characterCount("abracadapraka");
		//ArrayElements.print(arr);
		
		
		System.out.print(anaogramInAr("file", "life"));
		System.out.print(anaogramInAr("abcc", "abbc"));
		System.out.print(anaogramInAr("silent", "listen"));
		System.out.print(anaogramInAr("abc", "abbc"));
		System.out.println(anaogramInAr("mnmnzz", "zmmznn"));
		
		System.out.print(anaogramChAr("file", "life"));
		System.out.print(anaogramChAr("abcc", "abbc"));
		System.out.print(anaogramChAr("silent", "listen"));
		System.out.print(anaogramChAr("abc", "abbc"));
		System.out.print(anaogramChAr("mnmnzz", "zmmznn"));


	}

}
