 package multiThreading_18;

/* class MyThread7 extends Thread
 {}
public class MTDemo7 {
	public static void main(String[] args) 
	{
		System.out.println("FOr main-thread : "+Thread.currentThread().getPriority());
		MyThread7 t = new MyThread7();
		t.setPriority(3);
		System.out.println(t.getPriority());
	}
}*/
 class MyThread7 extends Thread   
 {
 	 public void run()           
 	 {
 		 for(int i=1; i<=10; i++)
 		 {
 			 System.out.println("Child Thread.");
 		 }		 
 	 }
 }
 public class MTDemo7 
 {
 	public static void main(String[] args)  
 	{
 		MyThread1 t = new MyThread1();
 		t.setPriority(10);
 		t.start();              
 		for(int i=1; i<=10; i++)
 		 {
 			 System.out.println("Main Thread.");
 		 }
 	}
 }
