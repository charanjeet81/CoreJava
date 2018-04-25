package multiThreading_18;

class MyThread13 extends Thread 
{
	 public void run()
	 {
		 for(int i=1; i<=10; i++)
		 {
			 System.out.println("Child Thread.");
			 try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Execption Caught.");
			}
		 }		 
	 }
}
public class DaemonThread2
{
	public static void main(String[] args)  
	{
		Thread.currentThread().setPriority(3);
		MyThread13 t = new MyThread13();
		t.setPriority(10);
		t.setDaemon(true);
		t.start();              
		System.out.println("End of main, so no more daemon threads.");
	}
}