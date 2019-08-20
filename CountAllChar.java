/*2.Write a java program to count vowel,consonent,digit,uper case,lower case and special charactor in string.*/
public class CountAllChar 
{
	public static void main(String[] args) 
	{
		String s = "abcd 12EFG@ 34hijklm$ #-&^%!09NOPQRSTU 87vwx 65Yz";
		char st[] = s.toCharArray();
		int vovelCount = 0;
		String vovel = "";
		int constantCount = 0;
		String constant = "";
		int digitCount = 0;
		String digit = "";
		int UCCount = 0;
		String UC = "";
		int LCCount = 0;
		String LC = "";
		int splCount = 0;
		String spl = "";
		for (int i = 0; i < st.length; i++) 
		{
		
				if(st[i] == 'a' || st[i] == 'A' || st[i] == 'e' || st[i] == 'E' || st[i] == 'i' || st[i] == 'I' || st[i] == 'o' || st[i] == 'O' || st[i] == 'u' || st[i] == 'U')
				{
					vovel = vovel + st[i];
					vovelCount++;
				}
				if(st[i] >= 'A' && st[i] <=  'Z' || st[i] >= 'a' && st[i] <= 'z')
				{
					constant += st[i];
					constantCount++;
				}
				if(st[i] >= 48 && st[i] <= 57)
				{
					digit += st[i];
					digitCount++;
				}
				if(st[i] >= 'A' && st[i] <=  'Z')
				{
					UC += st[i];
					UCCount++;
				}
				if(st[i] >= 'a' && st[i] <=  'z')
				{
					LC += st[i];
					LCCount++;
				}
				if(st[i] >= 0 && st[i] <= 47)
				{
					spl += st[i];
					splCount++;
				}
		}

		System.out.println(vovel+" =Vovels= "+vovelCount);
		System.out.println(constant+" =Constants= "+constantCount);
		System.out.println(UC+" =Upper Case= "+UCCount);
		System.out.println(LC+" =Lower Case= "+LCCount);
		System.out.println(spl+" =Special Character= "+splCount);
		System.out.println(digit+" =Digits= "+digitCount);
	}
}
