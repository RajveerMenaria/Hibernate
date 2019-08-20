/*6.Write a java program to reverse the sentence.*/
public class ReverseSentence 
{
	public static void main(String[] args)
	{
		String s = "Rajveer Menaria";
		char ch[] = s.toCharArray();
		System.out.println(s);
		for (int i = ch.length-1; i >= 0; i--) 
		{
			String str = "";
			while(i >= 0 && ch[i] != ' ')
			{
				str += ch[i];
				i--;
			}
			System.out.print(str+" ");
		}
	}
}
