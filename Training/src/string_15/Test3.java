package string_15;


/* charAt() Returns the character located at the specified index
 concat() Appends one String to the end of another ( "+" also works)
 equals() Determines the equality of two Strings
 equalsIgnoreCase() Determines the equality of two Strings, ignoring case
 length() Returns the number of characters in a String
 replace() Replaces occurrences of a character with a new character
 substring() Returns a part of a String
 toLowerCase() Returns a String with uppercase characters converted
 toString() Returns the value of a String
 toUpperCase() Returns a String with lowercase characters converted
 trim() Removes whitespace from the  start and ends of a String
 split() It splits string by any desired char*/
//Note: String always start indexing from 0 digit.
 

public class Test3 
{
	public static void main(String[] args) 
	{
		String x = "PROMOCODE:18";
		String y = "PROMOCODE:13";
		String z = "promoCODE:13";
		int a = 34;
		int b = 56;		
		
		System.out.println(x.charAt(1));           //R
		System.out.println(x.concat("18"));        //PROMOCODE:1818
		System.out.println(x.equals(y));           //false
		System.out.println(y.equalsIgnoreCase(z)); //True
		System.out.println(x.length());			   //12
		System.out.println(x.replace('P', 'C'));   //CROMOCODE:18
		System.out.println(x.substring(10));       //18
		System.out.println(x.substring(0, 9));     //PROMOCODE
		System.out.println(x.toLowerCase());       //promocode:18
		System.out.println(x.trim()); 
	}

}
