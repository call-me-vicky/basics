package string;

public class Sbuilders {
	
	public static String reverse(String s)
	{
		StringBuilder nev = new StringBuilder(s);
		
		nev = nev.reverse();
		s = nev.toString();
		
		return s;
	}
	public static String toLower(String s)
	{
		
		StringBuilder rev = new StringBuilder();
		char t;
		for(int i=0;i<s.length();i++)
		{
			t = Character.toLowerCase(s.charAt(i));
			rev.append(t);
		}
		s = rev.toString();
		return s;
	}
	public static String delVowels(String s)
	{
		StringBuilder nev = new StringBuilder(s.toLowerCase());
		StringBuilder a = new StringBuilder();
		for(int i=0;i<nev.length();i++)
		{
			if(nev.charAt(i)!='a' && nev.charAt(i)!='e' && nev.charAt(i)!='i' && nev.charAt(i)!='o' && nev.charAt(i)!='u')
			{
				a.append(nev.charAt(i));
			}
		}
		s = a.toString();
		return s;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("grammer"));
		System.out.println(toLower("GraMmEr"));
		System.out.println(delVowels("hellow world"));
		

	}

}
