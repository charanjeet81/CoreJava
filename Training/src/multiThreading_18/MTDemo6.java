package multiThreading_18;


class MyThread6 extends Thread
{
	public void run()
	{
		System.out.println("Child-Thread-Name -> "+Thread.currentThread().getName()+", ID -> "+Thread.currentThread().getId());
		Thread.currentThread().setName("Children");
		System.out.println("Child-Thread-Name-Setting -> "+Thread.currentThread().getName()+", ID -> "+Thread.currentThread().getId());
	}
} 
public class MTDemo6 
{
	public static void main(String[] args) 
	{
		MyThread6 t = new MyThread6();
		t.start();	
		System.out.println("Main-Thread-Name -> "+Thread.currentThread().getName()+", ID -> "+Thread.currentThread().getId());
		Thread.currentThread().setName("Parent");
		System.out.println("Main-Thread-Name-Setting -> "+Thread.currentThread().getName()+", ID -> "+Thread.currentThread().getId());
	}
}