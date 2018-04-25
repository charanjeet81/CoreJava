package multiThreading_18;
//For inter-thread-communication three methods are used :
//wait(): Thread which require updation calls wait().Thread which perform updation calls notify, notifyAll()
//To call these three methods on any object the current thread should lock the object i.e. it should be in synchronised area.
//For calling wait(), thread should immediately remove lock from the object.
//For calling notify(), thread should remove lock from the object but may not immediately.
class MyThread11 extends Thread
{
	int total = 0;
	public void run()
	{		
		synchronized (this) 
		{
			System.out.println("Child thread start execution.");
			for(int i=1;i<=100;i++)
			{
				total = total + i;
			}
			System.out.println("Child thread gives notification.");
			this.notify();
		}
	}
}

public class MTDemo11 
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread11 t = new MyThread11();
		t.start();
		synchronized (t)
		{
			System.out.println("Main thread calling wait().");
			t.wait();
			System.out.println("Main thread got notification.");
			System.out.println(t.total);		
		}
	}
}
