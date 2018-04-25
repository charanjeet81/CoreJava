
package multiThreading_18;
//Methos for preventing thread's execution : yield(), join(), sleep()
//yield() will give chance to other to execute.
class MyThread8 extends Thread
{
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		 {
			System.out.println("Child-Thread.");
		 }
	}	
}
public class MTDemo8 
{
	public static void main(String[] args) 
	{
		Thread.yield();
		for(int i=1;i<=10;i++)
		 {
			System.out.println("Main-Thread.");
		 }
		MyThread8 t = new MyThread8();
		t.start();
	}

}
