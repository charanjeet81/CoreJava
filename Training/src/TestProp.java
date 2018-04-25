

//whata
public class TestProp 
{
	public static void main(String[] args) 
	{
		java.util.Properties p = System.getProperties();
		p.list(System.out);
		
		System.out.println(System.getProperty("user.name"));
	}
}
