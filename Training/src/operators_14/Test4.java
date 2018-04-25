package operators_14;

public class Test4 
{
public static void main(String[] args) 
{
	String s = "Java";
	byte b = 8;
	int i = 1;
	System.out.println(s+b+i);  // It will not give output as "Java9", rather output will "Java81", because string give concatenation other data type when "+" is used.
	System.out.println("amazing"+s+b+i); 
	System.out.println(s+(b+i)); 
	
	String u = "123";
	int v = 45;
	System.out.println(u+v);  //string-concatenation
	
	u+=67;
	System.out.println(u);    //concatenation
	
	v+=89;	 
	System.out.println(v);    //addition
		

}

}
