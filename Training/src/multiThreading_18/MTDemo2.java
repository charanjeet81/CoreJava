package multiThreading_18;
/*If you are not extending Thread class then it will not implement multithreading.
 1. It register with Thread Sheduler.
 2. It provides run()
It is highly recommended to override run(), otherwise it will give no output.
You can overload run(), but start() will call only non-parameterised.
If you will override(not recommended) start(), then it will not call run().

*/
class MyThread2 extends Thread
{
	public void run()	
	{
		System.out.println("no-arg.");
	}
	public void run(int i)	
	{
		System.out.println("with-arg.");
	}
}

public class MTDemo2 
{
	public static void main(String[] args) 
	{
		MyThread2 t = new MyThread2();
		t.start();   //It will invoke run().
		t.run();
		t.run(8);
	}
}
