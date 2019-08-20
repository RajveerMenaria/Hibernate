
public class RespOfUpperLowerCase 
{
	public static String remove(char c, String s)
	{
		String str = "";
		for (int i = 0; i < s.length(); i++)
		{
			if(c != s.charAt(i))
				str += s.charAt(i);
		}
		return str;
	}
	public static void main(String[] args) 
	{
		String s = "Prime ministerM Narendra NmoPdi is best Hfor Hindustan";
		for (int i = 0; i < s.length(); i++) 
		{
			int count = 0;
			i = 0;
			char c = s.charAt(i);
			for (int j = i; j < s.length(); j++) 
			{
				if(Character.toLowerCase(c) == Character.toLowerCase(s.charAt(j)))
				{
					count++;
				}
			}
			System.out.println(c+" "+count);
			s = remove(c,s);
			//s = s.replaceAll(String.valueOf(c), "");
		}
	}
}
