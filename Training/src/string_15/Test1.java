package string_15;

public class Test1 
{
	public static void main(String[] args) 
	{
		//int aptNo = (int )(Math.random() * 1000 + 1);
		//System.out.println(aptNo);
		
		String s1 = "ABC";
		String s2 = s1;
		System.out.println(s1==s2); //true; both are referring to same string in string-pool.
        
		s1.concat("PQR");           //concating but not referring to any one
        System.out.println(s1);                //ABC
        
        System.out.println(s1.concat("PQR"));  //ABCPQR
        
		s2 = s2.concat("XYZ");
        System.out.println(s2);                //ABCXYZ
	}
}
// Check how many are eligible for gc();