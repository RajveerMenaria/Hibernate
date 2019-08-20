/*5.Write a java program to reverse the word in sentence.*/
public class ReverseWord 
{
	public static void main(String[] args)
	{
		String s = "Rajveer Menaria";
		char ch[] = s.toCharArray();
		System.out.println(s);
		for (int i = 0; i < ch.length; i++) 
		{
			String str = "";
			while(i < ch.length && ch[i] != ' ')
			{
				str = ch[i] + str;
				i++;
			}
			System.out.print(str+" ");
		}
 	}
}
