import java.util.*; 
public class UniqueString 
{
	    public static String unique(String s) 
	    { 
	        String str = "";
	        int len = s.length(); 
	        for (int i = 0; i < s.length(); i++)  
	        { 
	            char c = s.charAt(i); 
	            if (str.indexOf(c) < 0) 
	            { 
	                str += c; 
	            } 
	        } 
	        return str; 
	    } 
	    public static void main(String[] args) 
	    { 
	        String s = "Prime minister Narendra modi is best for Hindustan"; 
	        System.out.println(unique(s)); 
	    } 
	} 

