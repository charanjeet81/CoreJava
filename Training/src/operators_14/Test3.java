package operators_14;

class Calculator 
{
	void divide(int a, int b)
	{
		System.out.println("Divide is :"+a/b);  // It gives Quotient.
	}
	void modulus(int a, int b)
	{
		System.out.println("Modulus is :"+a%b); // It gives reminder.
	}	
}

public class Test3
{
public static void main(String[] args) 
{
	Calculator c = new Calculator();
	c.divide(17, 3);
	c.modulus(17, 3);
}

}
