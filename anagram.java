public class anagram 
{
	public static String sortStr(String str)
	{
		String sortStr = "";
		int ar[] = new int[str.length()];
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i] = str.charAt(i);
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
			sortStr += (char)ar[i];
		}
		return sortStr;
	}
	public static String toUpr(String str)
	{
		String cap = "";
		for (int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) > 90)
				cap += (char)(str.charAt(i)-32);
			else
				cap += (char)(str.charAt(i));
		}
		return cap;
	}
	public static boolean isAnagram(String s1,String s2)
	{
		boolean b = true;
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i) == s2.charAt(i))
			{
				b = true;
			}
			else
				return false;
		}
		return b;
	}
	public static void main(String[] args)
	{
		String st1 = "silent";
		String st2 = "listen";
		boolean b = false;
		if(st1.length() != st2.length())
		{
			System.out.println("String is not anagram");
		}
		else
		{
			String str1 = sortStr(st1);
			String str2 = sortStr(st2);
			System.out.println(str1+" sort "+str2);
			str1 = toUpr(str1);
			str2 = toUpr(str2);
			System.out.println(str1+" UpperCase "+str2);
			b = isAnagram(str1,str2);
		}
		if(b == true)
			System.out.println(st1+" and "+st2+"  are anagram");
		else
			System.out.println(st1+" and "+st2+"  are not anagram");
	}
}
