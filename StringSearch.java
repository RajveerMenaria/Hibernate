public class StringSearch 
{
	public static char toUpr(char ch)
	{
		char chr = ' ';
		if(ch > 90)
			chr += ch-32;
		else
			chr += ch;
		return chr;
	}
	public static boolean searchStr(String str, String srh)
	{
		boolean b = true;
		if(str.length() != srh.length())
			return false;
		else
		{
			for (int i = 0; i < str.length(); i++) 
			{
				char ch1 = toUpr(str.charAt(i));
				char ch2 = toUpr(srh.charAt(i));
				if(ch1 == ch2)
				{
					b = true;
				}
				else
					return false;
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		String st = "Udaipur is first class tourism place of India";
		String srh = "udaipur";
		boolean b = false;
		for (int i = 0; i < st.length(); i++)
		{
			String str = "";
			while(i < st.length() && st.charAt(i) != ' ')
			{
				str += st.charAt(i);
				i++;
			}
			b = searchStr(str,srh);
			if(b == true)
				i = st.length();
		}
		if(b)
			System.out.println(srh+" present in string");
		else
			System.out.println(srh+" not present string");
	}
}
