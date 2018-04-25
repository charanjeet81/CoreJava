package multiThreading_18;
/*Thread based multitasking is best suitable at programetic level using multithreading.
Wherever multitask is there we should implement it using multithread, like in Servlet.
Multithreading is achieved used either extending 'Thread' class or implementing 'Runnable' interface.*/ 
//Only Thread Scheduler decided which Thread to be executed so random outputs come for multithreaded application.


class MyThread1 extends Thread    //Defining Thread.
{
	 public void run()           //Job of the Thread.
	 {
		 for(int i=1; i<=100; i++)
		 {
			 System.out.println("Child Thread.");
		 }		 
	 }
}
public class MTDemo1 
{
	public static void main(String[] args) //main() it self is a thread called by JVM. 
	{
		MyThread1 t = new MyThread1();
		t.start();              //start() in-turn calls run(), and make it as threaded.
		//If directly you will call 't.run()' then it will be invoked as simple method no multithreading.
		for(int i=1; i<=100; i++)
		 {
			 System.out.println("Main Thread.");
		 }
	}
}
