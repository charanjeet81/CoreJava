package generics;


//Class refering to any particular type is known as generic class. Here, we are using 'T' type parameter to 
//create the generic class of specific type.

import java.util.*;

class UserGeneric<T>
{
	T obj;
	public void add(T obj)
	{
		this.obj = obj;
	}
	
	public T get()
	{
		return obj;
	}
}

class JavaGenerics2 
{
	public static void main(String args[]) 
    {
		UserGeneric<String> user = new UserGeneric<String>();
		//user.add(2);
		user.add("String");
		System.out.println(user.get());
	}
}
