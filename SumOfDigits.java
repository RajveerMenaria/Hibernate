/*9.Write a java program to calculate the sum of digits in the sentence.*/
public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		String s = "Shree5atal4bihari6vajpaye78";
		String str = s.replaceAll("[^0-9]", "");
		System.out.println(str);
		int  sum = 0;
		for (int i = 0; i < str.length(); i++)
		{
			int rem = 0;
			int c = str.charAt(i)-48;
			System.out.println(c);
				sum += c;
		}
		System.out.println(sum);
	}
}
