package funbool;

public class Grade {
	
	public static char toGrade(int n)
	{
		if(n>=90)
		{
			return 'A';
		}
		else if(n>=80)
		{
			return 'B';
		}
		else if(n>=70)
		{
			return 'c';
		}
		else if(n>=60)
		{
			return 'D';
		}
		else if(n>=50)
		{
			return 'E';
		}
		else if( n>0)
		{
			return 'F';
		}
		else
			return '?';
	}

	public static void main(String[] args) {
		System.out.println(toGrade(98));
		System.out.println(toGrade(48));
		System.out.println(toGrade(-1));

	}

}
