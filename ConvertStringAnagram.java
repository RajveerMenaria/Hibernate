public class ConvertString 
{
	public static String toUpr(String s1)
	{
		String str = "";
		for (int i = 0; i < s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(ch >= 90)
			{
				str += (char)(ch-32);
			}
			//str += Character.toUpperCase(s1.charAt(i));
		}
		return str;
	}
	public static String toLower(String s2)
	{
		String str = "";
		for (int i = 0; i < s2.length(); i++)
		{
			char ch = s2.charAt(i);
			if(ch <= 90)
			{
				str += (char)(ch+32);
			}
			//str += Character.toLowerCase(s2.charAt(i));
		}
		return str;
	}
	public static boolean isLower(char c1)
	{
		if(c1 > 90)
			return true;
		else
			return false;
	}
	public static char convertLowerUpr(char c2)
	{
		char ch = ' ';
		if(c2 > 90)
			ch = (char) (c2-32);
		else
			ch = (char) (c2+32);
		return ch;
	}
	public static boolean isDigit(char d)
	{
		int d1=d-48;
		if(d1>=0 && d1<=9)
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		String s1 = "abcdef";
		String lowerToUpr = toUpr(s1);
		System.out.println("Lower string to lower --> "+lowerToUpr);
		
		
		String s2 = "ABCDE";
		String uprToLower = toLower(s2);
		System.out.println("Upper string to lower --> "+uprToLower);
		
		char conLowUpr = 'I';
		char lowToUpr = convertLowerUpr(conLowUpr);
		System.out.println("Char convertor ---> "+lowToUpr);
		
		char boolower = 'C';
		boolean b = isLower(boolower);
			if(b)
				System.out.println(boolower+ " <-- Boolean Lower case");
			else
				System.out.println(boolower+ " <-- Boolean No its Not Lower case");
		
		char digit = '5';
		boolean d = isDigit(digit);
			if(d)
				System.out.println(digit+" <-- yes, it is Digit");
			else
				System.out.println(digit+" <-- No, it is not Digit");
	}
}
