
public class Sum 
{
	public static String removeAlfa(String st)
	{
		String str = "";
		for (int i = 0; i < st.length(); i++) 
		{
			if(st.charAt(i) > 47 && st.charAt(i) < 58)
				str += st.charAt(i);
		}
		return str;
	}
	public static void main(String[] args)
	{
		String st = "hg76shj8665sjh65sbdhs4";
		 st = removeAlfa(st);
		 int ar[] = new int[st.length()];
		 int sum = 0;
		 for (int i = 0; i < st.length(); i++)
		 {
			 ar[i] = (int)st.charAt(i)-48;
			 sum = sum + ar[i];
		}
		System.out.println(sum);
	}

}
