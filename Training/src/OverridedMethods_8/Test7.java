package OverridedMethods_8;

//If you will make the method to be overridden as static, it won't support runtime-polymorphism.
//In that case super-class reference will only refer to its own methods because static method is not going to override.

class Bank {
	int validity = 5; //Default validity.
	static int getRateOfInterest() {
		return 1;
	}
}

class SBI extends Bank {
	int validity = 2; 
	static int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int validity = 3; 
	static int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	int validity = 4; 
	static int getRateOfInterest() {
		return 9;
	}
}

public class Test7 {
	public static void main(String args[]) {
		Bank b1 = new SBI();
		Bank b2 = new ICICI();
		Bank b3 = new AXIS();
		System.out.println("SBI Rate of Interest: " + b1.getRateOfInterest() + " and validity is "+b1.validity+" years.");
		System.out.println("ICICI Rate of Interest: " + b2.getRateOfInterest() + " and validity is "+b2.validity+" years.");
		System.out.println("AXIS Rate of Interest: " + b3.getRateOfInterest() + " and validity is "+b3.validity+" years.");
	}
}