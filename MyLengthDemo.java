
public class MyLengthDemo
{
	static int i,c,res;
	public static int myLength(String st)
	{
//		int i = 0;
		/*for (char c : st.toCharArray())
		{
			i++;
		}*/
		try 
		{
			for ( i = 0;i>=0; i++)
			{
				st.charAt(i);
			}
		} catch (Exception e) 
		{
			//e.printStackTrace();
		}
		return i;
	}
	public static void main(String[] args) 
	{
		String st = "jhgasdhadagjhsgdahdkajsdjh";
		//System.out.println(st.length());
		int len = myLength(st);
		System.out.println(len);
	}
}
