/*4.Write a java program to display the smallest length word.*/
public class LowestLengthWord 
{
	public static void main(String[] args)
	{
		String s = "Rahul khan pappu chutiya";
		char ch[] = s.toCharArray();
		String st = "";
		int c = 50;
		for (int i = 0; i < ch.length; i++) 
		{
			String str = "";
			int count = 0;
			while(i < ch.length && ch[i] != ' ')
			{
				count++;
				str += ch[i];
				i++;
			}
			if(count < c)
			{
				c = count;
				st = str;
			}
		}
		System.out.println(st+"  "+c);
	}
}
