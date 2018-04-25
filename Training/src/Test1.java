import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Test1 
{
	public static void main(String[] args) 
	{
		List<String> earlierNumbers = new ArrayList<String>();
		List<String> laterNumbers = new ArrayList<String>();
		
		earlierNumbers.add("1");
		earlierNumbers.add("2");
		earlierNumbers.add("4");
		earlierNumbers.add("3");
		earlierNumbers.remove("2");
		
		laterNumbers.addAll(earlierNumbers);
		// laterNumbers = earlierNumbers;   // Different variables refer to the same memory location.
		
		System.out.println(earlierNumbers);
		System.out.println(laterNumbers);
		
		Collections.sort(laterNumbers);
		
		System.out.println(earlierNumbers);
		System.out.println(laterNumbers);
		
		if(earlierNumbers == laterNumbers)
			System.out.println("pass");
		
		// Above mentioned case is not valid for testing because it is sorting itself and we are checking it with itself.
		
	}
}