package CLA_1;

public class Test3
{
public static void main(String[] x)
{
	int a = Integer.parseInt(x[0]) + Integer.parseInt(x[1]);  //NumberFormatException if non convertible String is there
	System.out.println(a);
}
}