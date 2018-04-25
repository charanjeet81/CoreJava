package exceptionHandling_13;
//Runtime Stack, Activation Record, Stack Frame
public class Test1{

    public static void main(String []args)
    {
       System.out.println("Calling from main() to fxn1().");
       fxn1();  
    }
    public static void fxn1()
    {
       System.out.println("Calling from fxn1() to fxn2().");
       fxn2();
    }
    public static void fxn2()
    {
       System.out.println("In fxn2().");
    }
}
