package multiThreading_18;
//Q. What is object-level-lock and class-level-lock?
//synchronized keyword is used only for method, it provides lock on object and then only one 
//thread can access one object at one time.
//It slows down execution but provides consistency.
class Display
{
	public synchronized void wish(String name) //After removing 'synchronized' will give random output. 
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Good Morning :"+name);
			
			try 
			{
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Exception Handeled.");
			}
		}		
	}	
}
class MyThread extends Thread
{
	Display d;
	String name;
	public MyThread(Display d, String name) 
	{
		this.d = d;
		this.name = name;		
	}
	public void run()
	{
		d.wish(name);
	}
}

public class SyncDemo1 
{
	static Display d = new Display(); //two threads t1, t2 will provide lock on 'd' one at a time.  
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yuvraj");
		t1.start();
		t2.start();
	}
	/* With this way consistency will not achieved.
	static Display d1 = new Display(); 
	static Display d2 = new Display();   
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread(d1, "Dhoni");  //t1 will lock d1
		MyThread t2 = new MyThread(d2, "Yuvraj"); //t2 will lock d2
		t1.start();
		t2.start();
	}*/
}
