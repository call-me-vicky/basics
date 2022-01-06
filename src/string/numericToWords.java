package string;

public class numericToWords {
	
	public static String convert(int n)
	{
		String[] ones = {" ","one","two","three","four","five","six","seven","eight","nine"};
		String[] tens = {" ","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String[] hundreds = {" ","one","two","three","four","five","six","seven","eight","nine"};
		
		StringBuilder sb = new StringBuilder();
		int count=1;
		
		return null;
	}

	public static void main(String[] args) {
		
		
		int n=143;
		String s = convert(n);
		System.out.println(s);

	}

}
