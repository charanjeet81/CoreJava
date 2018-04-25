package multiThreading_18;
//
class MyThread3 extends Thread
{
	public void start()  //overridden start()
	{
		super.start();
		System.out.println("start method.");
	}
	public void run()
	{
		System.out.println("run method.");
	}	
}
public class MTDemo3 
{
	public static void main(String[] args) 
	{
		MyThread3 t = new MyThread3();
		t.start();
		System.out.println("main method."); //This will never execute first, because is overridden not a thread.
	}
}
