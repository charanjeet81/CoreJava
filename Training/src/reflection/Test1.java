package reflection;

import java.lang.reflect.Method;

//Java Reflection is a process of examining or modifying the run time behavior of a class at run time.
//The java.lang.Class class performs mainly two tasks:
//1. provides methods to get the metadata of a class at run time.
//2. provides methods to examine and change the run time behavior of a class.

//How to get the object of Class class?
//1. Simple.class.newInstance();
//2. Class.forName("Simple").newInstance();
//3. Object obj = "Hello";
//   Class c = obj.getClass();
//   System.out.println(c.toString());

/*The newInstance() method of Class class and Constructor class is used to create a new instance of the class.
The newInstance() method of Class class can invoke zero-argument constructor whereas newInstance() method of Constructor class can invoke any number of arguments. So Constructor class is preferred over Class class.
*/

class Simple {
	void message() {
		System.out.println("Hello Java");
	}
}

public class Test1 {
	public static void main(String args[]) {
		try {
			Class c = Class.forName("reflection.Simple");  //Always use FQCN
			Simple s = (Simple) c.newInstance();
			s.message();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
