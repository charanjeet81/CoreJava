package OverridedMethods_8;
 
//:::::::::::::: R U N T I M  E  P O L Y M O R P H I S M :::::::::::::::://

//There are two types of polymorphism in java:
//	1. compile time polymorphism
//	2. runtime polymorphism.
//	We can perform polymorphism in java by method overloading and method overriding.
//
//If you overload static method in java, it is the example of compile time polymorphism. 
//Here, we will focus on runtime polymorphism in java.
//From the output of the below program it is clear that,
//Method is overridden not the datamembers, so runtime polymorphism can't be achieved by data members.
//Runtime Polymorphism with multilevel inheritance, will happen in same way.
//If you will make the method to be overridden as static, it won't support runtime-polymorphism.
//In that case super-class reference will only refer to its own methods because static method is not going to override.
//A class can be public, final and abstract.
//A class/method can't be final and abstract same time.
/*
class Bank {
	int validity = 5; //Default validity.
	int getRateOfInterest() {
		return 1;
	}
}

class SBI extends Bank {
	int validity = 2; 
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int validity = 3; 
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	int validity = 4; 
	int getRateOfInterest() {
		return 9;
	}
}

abstract class Test6 {
	public static void main(String args[]) {
		Bank b1 = new SBI();
		Bank b2 = new ICICI();
		Bank b3 = new AXIS();
		System.out.println("SBI Rate of Interest: " + b1.getRateOfInterest() + " and validity is "+b1.validity+" years.");
		System.out.println("ICICI Rate of Interest: " + b2.getRateOfInterest() + " and validity is "+b2.validity+" years.");
		System.out.println("AXIS Rate of Interest: " + b3.getRateOfInterest() + " and validity is "+b3.validity+" years.");
	}
}
*/
