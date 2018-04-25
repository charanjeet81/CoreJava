package networking;

//The Java URLConnection class represents a communication link between the URL and the application. 
//This class can be used to read and write data to the specified resource referred by the URL.
//The Java HttpURLConnection class is http specific URLConnection. It works for HTTP protocol only.
//By the help of HttpURLConnection class, you can information of any HTTP URL such as header information, status code, response code etc.
//The java.net.HttpURLConnection is subclass of URLConnection class.
//Java InetAddress class represents an IP address. The java.net.InetAddress class provides methods to get the IP of any host name for example www.google.com,

//URLDemo.java  
import java.io.*;
import java.net.*;

public class TestURL {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://amazingjavablog.blogspot.com/2014/09/java11-constructors-basic.html");
			System.out.println(url.getDefaultPort());
			System.out.println(url.getUserInfo());
			System.out.println(url.getContent());
			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Host Name: " + url.getHost());
			System.out.println("Port Number: " + url.getPort());
			System.out.println("File Name: " + url.getFile());

		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			URL url = new URL("http://www.javatpoint.com/java-tutorial");
			URLConnection urlcon = url.openConnection();
			InputStream stream = urlcon.getInputStream();
			int i;
			while ((i = stream.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			URL url = new URL("http://www.javatpoint.com/java-tutorial");
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			for (int i = 1; i <= 8; i++) {
				System.out.println(huc.getHeaderFieldKey(i) + " = "
						+ huc.getHeaderField(i));
			}
			huc.disconnect();
		} catch (Exception e) {
			System.out.println(e);
		}
	
		try {
			InetAddress ip = InetAddress.getByName("www.javatpoint.com");
			System.out.println("Local Host: "+ip.getLocalHost());
			System.out.println("Host Name: " + ip.getHostName());
			System.out.println("IP Address: " + ip.getHostAddress());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}