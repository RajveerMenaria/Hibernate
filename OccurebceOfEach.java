public class OccurebceOfEach 
{
	public static String remove(char ch, String st)
	{
		String str = "";
		for (int i = 0; i < st.length(); i++)
		{
			if(st.charAt(i) != ch)
				str += st.charAt(i);
		}
		return str;
	}
	public static void main(String[] args)
	{
		String st = "Hindustan best cityh is Udaipur famous for tourism and big Lake";
		System.out.println(st.length());
		for (int i = 0; i < st.length();) 
		{
			int count = 0;
			for (int j = 0; j < st.length(); j++) 
			{
				if(st.charAt(i) == st.charAt(j))
				{
					count++;
				}
			}
			System.out.println(st.charAt(i)+"       "+count);
			st = remove(st.charAt(i),st);
		}
	}
}
