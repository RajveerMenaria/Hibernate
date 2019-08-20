public class SortString 
{
	public static String sortString(String st)
	{
		String str= "";
		char ch[] = st.toCharArray();
		int ar[] = new int[ch.length];
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i] = ch[i];
		}
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = i+1; j < ar.length; j++) 
			{
				if(ar[i] > ar[j])
				{
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			ch[i] = (char) ar[i];
			str += ch[i];
		}
		return str;
	}
	public static String intoUpr(String st)
	{
		String str = "";
		for (int i = 0; i < st.length(); i++)
		{
			if(st.charAt(i) > 90)
				str += (char)(st.charAt(i)-32);
			else
				str += st.charAt(i);
		}
		return str;
	}
	public static String removeSpace(String st)
	{
		String str = "";
		for (int i = 0; i < st.length(); i++) 
		{
			if(st.charAt(i) != ' ')
				str += st.charAt(i);
		}
		return str;
	}
	public static void main(String[] args)
	{
		String st = "baVji Ki jaI ho";
		 st = intoUpr(st);
		 st = sortString(st);
		 st = removeSpace(st);
		System.out.println(st);
		System.out.println(st);
	}
}
