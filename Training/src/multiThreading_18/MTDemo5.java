package multiThreading_18;

class MyThread5 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		 {
			System.out.println("Child-Thread.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}
}
public class MTDemo5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		MyThread5 t1 = new MyThread5();
		Thread t2 = new Thread(t1);   //But not a good way.
		t2.start();	
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main-Thread.");
			Thread.sleep(1000);
		}
	}
}
