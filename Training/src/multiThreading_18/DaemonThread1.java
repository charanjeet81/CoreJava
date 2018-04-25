package multiThreading_18;
//Daemon threads are those threads which run in background like: garbageCollector.
//You can convert any thread to Daemon Thread using t.setDaemon(true);	
//main-method thread can never be a Daemon thread, gives IllegalThreadStateException
//As soon as you will destroy non-daemon thread, all dependent daemon thread will be destroy.

class MyThread12 extends Thread
{}

public class DaemonThread1 
{
	public static void main(String[] args) 
	{
		//Thread.currentThread().setDaemon(true);   //IllegalThreadStateException
		System.out.println(Thread.currentThread().isDaemon()); //Check daemon for main-thread
		
		MyThread12 t = new MyThread12();      
		System.out.println(t.isDaemon());           //Check daemon for child-thread, false
		t.setDaemon(true);							//making is daemon.
		System.out.println(t.isDaemon());			//Check daemon for child-thread, true
		
		

	}

}
