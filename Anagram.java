public class Anagram 
{
	public static String toUprFirst(String s1)
	{
		String str = "";
		for (int i = 0; i < s1.length(); i++) 
		{
			//char ch = s1.charAt(i);
			if(s1.charAt(i) > 90)
			{
				str += (char)(s1.charAt(i)-32);
			}
			else if(s1.charAt(i) < 90)
				str += (char)(s1.charAt(i));
		}
		return str;
	}
	public static String sortString(String str)
	{
		String sortString = "";
		char[] ar=str.toCharArray();
		int []r=new int[ar.length];
		for (int i = 0; i < r.length; i++) 
		{
			r[i]=ar[i];
		}
		for (int i = 0; i < r.length; i++)
		{
			for (int j = i+1; j < r.length; j++) 
			{
				if(r[j] < r[i])
				{
					int temp=r[i];
					r[i]=r[j];
					r[j]=temp;
				}
			}
		}
		for (int i = 0; i < r.length; i++) {
			sortString+=(char)r[i];
		}
		return sortString;
	}
	public static boolean isAnagram(String s1, String s2)
	{
		boolean b = false;
		for (int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
				return false;
			else
				b = true;
		}
		return b;
	}
	public static void main(String[] args)
	{
		String s1 = "silent";
		String s2 = "listen";
		if(s1.length() != s2.length())
		{
			System.out.println("String is not Anagram");
		}
		else
		{
			String str1 = toUprFirst(s1);
			String str2 = toUprFirst(s2);
			String strSort1 = sortString(str1);
			String strSort2 = sortString(str2);
			boolean b = isAnagram(strSort1,strSort2);
			if(b)
				System.out.println(strSort1+" and "+strSort2+" are anagram");
			else
				System.out.println(strSort1+" and "+strSort2+" are not anagram");
		}
	}
}
