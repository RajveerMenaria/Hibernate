public class UsingMethod 
{
	public static String remove(String s, char c)
	{
		String str = "";
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != c)
			{
				str += s.charAt(i);
				//System.out.println(str);
			}
		}
		return str;
	}
	public static void main(String[] args) 
	{
		String s = "Prime minister Narendra modi is best for Hindustanp";
		for (int i = 0; i <= s.length(); i++) 
		{
			int count=0;
			i=0 ;
			char c=s.charAt(i);
			for (int j = i; j < s.length(); j++) 
			{
				//if(Character.toUpperCase(c) == Character.toUpperCase(s.charAt(j)))
				if(c == s.charAt(j))
				{
					count++;
				}
			}
			System.out.println(c+"  "+count);
			s = remove(s,c);
			//s=s.replaceAll(String.valueOf(c), "");
		}
	}
}
