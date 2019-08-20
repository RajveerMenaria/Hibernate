
public class Geeks 
{
	static final int max = 256;
	public static void getOccuringChar(String str)
	{
		int count[] = new int[max];
		for (int i = 0; i < str.length(); i++) 
			count[str.charAt(i)]++;
			
		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) 
		{
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) 
			{
				if(str.charAt(i) == ch[j])
					find++;
			}
			if(find == 1)
				System.out.println(str.charAt(i)+"  "+count[str.charAt(i)]);
		}
	}
	public static void main(String[] args)
	{
		String str = "Prime minister Narendra modi is best for Hindustan";
		getOccuringChar(str);
	}
}
