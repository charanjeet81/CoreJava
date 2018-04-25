import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class MathhTest 
{
	int a, b;
	
	public MathhTest(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	@Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2, 3 },
	         { 6, 4 },
	         { 19, 7 },
	         { 22, 3 },
	         { 23, 9 }
	      });
	   }

	@Test
	public void testing()
	{
		new Mathh().sum(a, b);
	}
	
	
	
}
