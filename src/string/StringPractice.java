package string;

public class StringPractice {
	
	public static void practice()
	{
//		System.out.println(s1.hashCode());
//		String s2 = s1;
//		String s3 = s1;
//		String s4 = s1;
//		System.out.println(s2.hashCode()+"\n"+s3.hashCode()+"\n"+s4.hashCode());
//		String s5="";
//		for(int i=0;i<s1.length();i++)
//		{
//			s5=s5+s1.charAt(i);
//			System.out.println(s5.hashCode());
//		}
		
		String s1= "vignesh";
		String s2= "vignesh";
		String sb1 = new String("vignesh");
		String sb2 = new String("vignesh");
		if(s1==sb1)
		{
			System.out.println("equal strings");
		}
		
		if(sb1==sb2 && sb2==s2)
		{
			System.out.println("equal strings 2");
		}
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(sb1.hashCode());
//		System.out.println(sb1.hashCode());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		practice();

	}

}
