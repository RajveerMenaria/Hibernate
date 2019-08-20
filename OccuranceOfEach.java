/*7.Write a java program to count No of occance of each charactor in a sentence.*/
public class OccuranceOfEach 
{
	//public static removeChar(String s,)
	public static void main(String[] args) 
	{
		String s = "Prime minister Narendra modi is best for Hindustan";
		for (int i = 0; i <= s.length(); i++) 
		{
			int count=0;
			i=0 ;
			char c=s.charAt(i);
			for (int j = i; j <s.length(); j++) 
			{
//				if(Character.toUpperCase(c)==Character.toUpperCase(s.charAt(j)))
				if(c==(s.charAt(j)))
				{
					count++;
				}
			}
			System.out.println(c+"  "+count);
			s=s.replaceAll(String.valueOf(c), "");
		}
	}
}
