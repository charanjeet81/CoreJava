package fileIO;

/*-The DeflaterOutputStream and InflaterInputStream classes provide mechanism to compress and uncompress the data 
 in the deflate compression format.
 -The PipedInputStream and PipedOutputStream classes can be used to read and write data simultaneously. 
 Both streams are connected with each other using the connect() method of the PipedOutputStream class.
 -Here, we have created two threads t1 and t2. The t1 thread writes the data using the PipedOutputStream object 
 and the t2 thread reads the data from that pipe using the PipedInputStream object. Both the piped stream object 
 are connected with each other.
 *
 */
import java.io.*;

class FileTest16 
{
	public static void main(String args[]) throws Exception 
	{
		final PipedOutputStream pout = new PipedOutputStream();
		final PipedInputStream pin = new PipedInputStream();

		pout.connect(pin);// connecting the streams
		// creating one thread t1 which writes the data
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 65; i <= 90; i++) {
					try {
						pout.write(i);
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		};
		// creating another thread t2 which reads the data
		Thread t2 = new Thread() {
			public void run() {
				try {
					for (int i = 65; i <= 90; i++)
						System.out.println(pin.read());
				} catch (Exception e) {
				}
			}
		};
		// starting both threads
		t1.start();
		t2.start();
	}
}