import org.apache.commons.lang3.StringUtils;


public class LogicImplementation {

	public static void main(String[] args) 
	{		
		System.out.println(reverseString("123456789"));
	}
	
	public static String reverseString(String string)
	{
		String revStr = "";		
		char[] chars = string.toCharArray();
		for(int i = chars.length-1; i>=0; i--)
		{
			revStr = revStr + String.valueOf(chars[i]);
		}
		return revStr;
	}
}
