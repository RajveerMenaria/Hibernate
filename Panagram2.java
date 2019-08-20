public class Panagram2 
{
	public static String toUpr(String st)
	{
		String str = "";
		for (int i = 0; i < st.length(); i++) 
		{
			if(st.charAt(i) > 90 && st.charAt(i) != ' ')
				str += (char) (st.charAt(i)-32);
			else if(st.charAt(i) != ' ')
				str += (char) (st.charAt(i));
		}
		return str;
	}
	public static void main(String[] args) 
	{
		String st = "The quick Brown  Afox Jumps Over the LaZy Dog";
		st = toUpr(st);
		char ar[] = new char[26];
		for (int i = 0; i < st.length(); i++) 
		{
			if(i < st.length() && st.charAt(i) != ' ')
			{
				ar[st.charAt(i)-65] = st.charAt(i);
			}
		}
		boolean b = true;
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i] < 1)
				b = false;
		}
		if(b == true)
			System.out.println("String is panagram");
		else
			System.out.println("String is not panagram");
	}
}
