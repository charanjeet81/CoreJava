package multiThreading_18;
//Ideally we should invoke start() which in-turn call run().
class MyRunnable implements Runnable
{
	 public void run()
	 {
		 for(int i=1;i<=10;i++)
		 {
			 System.out.println("run()");
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }		 
	 }
}
public class MTDemo4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		MyRunnable r = new MyRunnable(); //Runnable gives run().
		Thread t = new Thread(r);        //Thread gives start().
		t.start();
		for(int i=1;i<=10;i++)
		 {
			 System.out.println("main()");
			 Thread.sleep(1000);
		 }
	}
}
