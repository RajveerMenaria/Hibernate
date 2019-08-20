public class MaxOccurChar 
{
	public static void main(String[] args)
	{
		String st = "sonu nigum having lot of variation in his voice";
		int c = 0;
		char chr = ' ';
		for (int i = 0; i < st.length(); i++)
		{
			char ch1 = st.charAt(i);
			int count = 0;
			for (int j = i; j < st.length(); j++)
			{
				char ch2 = st.charAt(j);
				if(ch1 == ch2 && ch1 !=' ')
				{
					count++;
				}
			}
			if(count > c)
			{
				c = count;
				chr = ch1;
			}
		}
		System.out.println(chr);
	}
}
