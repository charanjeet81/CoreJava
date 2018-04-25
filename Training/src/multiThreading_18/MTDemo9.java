package multiThreading_18;

class MyThread9 extends Thread   
{
	static Thread th;
	 public void run() //You can't handle exception here, handle in try-catch.    
	 {
		 
		 for(int i=1; i<=60; i++)
		 {
			 System.out.println("Child Thread.");
			 try 
			 {
				 Thread.sleep(1000);
			 } 
			 catch (Exception e) 
			 {
				System.out.println("I got interrupted.");
			 }			 
		 }		 
	 }
}
public class MTDemo9 
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread9 t = new MyThread9();
		t.start();
		
		t.interrupt();   //It is used to interrupt other Thread.
		t.join();        //It throws exception, and make other thread to join.
		
		for(int i=1; i<=10; i++)
		 {
			t.interrupt();
			t.join();
			System.out.println("Main Thread.");
		 }
	}
}