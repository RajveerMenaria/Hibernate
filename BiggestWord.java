/*3.Write a java program to display the biggest length word.*/
public class BiggestWord 
{
	public static void main(String[] args) 
	{
		String s = "Prime Ministe Narendra modi is very important for hindustan";
		char s1[] = s.toCharArray();
		int c=0;
		String st="";
		for (int i = 0; i < s1.length; i++)
		{
			int count = 0 ;
			String str = "";
			while(i < s1.length && s1[i] != ' ')
			{
				count++;
				str+=s1[i];
				i++;
			}
			if(count>c)
			{
				c=count;
				st=str;	
			}
		}
		System.out.println(st+" "+c);
	}
	
}
