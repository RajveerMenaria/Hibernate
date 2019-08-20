public class ReverseWordOfString 
{
	public static void main(String[] args) 
	{
		String st = "Udaipur Rajasthan";
		for (int i = 0; i < st.length(); i++) 
		{
			String str = "";
			while(i < st.length() && st.charAt(i) != ' ')
			{
				str = st.charAt(i)+str;
				i++;
			}
			System.out.print(str+" ");
		}
	}
}
