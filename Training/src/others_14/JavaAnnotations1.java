package others_14;

import java.util.ArrayList;
//Annotations in java are used to provide additional information for class, interface, methods or fields,
//so it is an alternative option for XML and java marker interfaces and used by java compiler and JVM.
//Built-In Java Annotations used in java code
//@Override
//@SuppressWarnings
//@Deprecated

@Deprecated
class SuperClasss {
	@SuppressWarnings("unchecked")  
	void myFunctionM() {
		ArrayList<String> list = new ArrayList<String>();  
		list.add("Hello");  
		list.add("Hey");  	
	}

	@Deprecated
	void myFunctionN() {
		System.out.println("hello n");
	}
}

class SubClasss extends SuperClasss
{
	void myFunctionM() {
		System.out.println("hello m");
		
	}

	@Override @Deprecated
	void myFunctionN() {
		System.out.println("hello n");
	}
}

class JavaAnnotations1 {
	public static void main(String args[]) {			  

		SubClasss a = new SubClasss();
		a.myFunctionN();
	}
}