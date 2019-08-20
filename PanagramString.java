/*11.Write a java program to check your string is panagram or not.*/
public class PanagramString 
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
		String str = toUpr(st);
		int ar[] = new int[26];
		for (int i = 0; i < str.length(); i++)
		{
			ar[str.charAt(i)-65]++;
		}
		boolean b=true;
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]<1) 
				b=false;
		}
		if(b)
			System.out.println(st+"  <--- is panagram");
		else
			System.out.println(st+"  <--- is not panagram");
	}
}
