/*8.Write a java progaram to replace space by length of previous word.*/
public class SpaceFill 
{
	public static void main(String[] args) 
	{
		String s = "Maharana pratap , this is not a name only the proud of mewad";
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
			String str = "";
			int count = 0;
			while (i < s.length() && s.charAt(i) != ' ') 
			{
				count ++;
				str += s.charAt(i);
				i++;
			}
			if(i<s.length())
				s1+=str+count;
			else
				s1+=str+count;
		}
		System.out.println(s1);
	}
}
