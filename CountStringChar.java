/*1.Write a java program to count how many charactor in each Word.*/
public class CountStringChar 
{
	public static void main(String[] args)
	{
		String s = "Rajveer is Good boy ";
		char st[] = s.toCharArray();
		//int count = 0;
		for (int i = 0; i < st.length; i++) 
		{
			int count = 0;
			String s1 = "";
			while(i<st.length && st[i] != ' ')
			{
				s1 = s1+st[i];
				count++;
				i++;
			}
			System.out.println(s1+"  "+count);
		}
	}
}
