/*14.Write a java program to check specified string present in main string or not.*/
public class SearchString 
{
	public static char toUpr(char st)
	{
		char ch;
		if(st > 90)
			ch = (char) (st-32);
		else
			ch = (char)(st);
		return ch;
	}
	public static boolean isEqual(String search,String str)
	{
		boolean b=true;
		if(search.length() != str.length())
			return false;
		else
		{
//			System.out.println(search+"   "+str);
			for (int i = 0; i < search.length(); i++) 
			{
					char ch1 = toUpr(search.charAt(i));
					char ch2 = toUpr(str.charAt(i));
					if(ch1 == ch2)
						b=true;
					else
						return false;
			}
		}
		return b;
	}
	public static void main(String[] args)
	{
		String st = "Shree Narendra modi is Prime minister of Bharat";
		String search = "MODI";
		boolean b=false;
		for (int i = 0; i < st.length(); i++) 
		{
			String str ="";
			while(i < st.length() && st.charAt(i) != ' ')
			{
				str += st.charAt(i);
				i++;
			}
			/*if(search.equalsIgnoreCase(str))
			{
				b=true;
				//i=st.length();
			}*/

			 b = isEqual(search,str);
			 if(b)
				 i=st.length();
		}
		if(b)
			System.out.println(search+" word is present");
		else
			System.out.println(search+" word is not present");
	}
}
