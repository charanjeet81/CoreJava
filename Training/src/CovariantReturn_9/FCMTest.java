package CovariantReturn_9;
//Constructor can not be final and static, whereas it can be private and protected, but for private constructor you can't create object of it.
//and wont be able to access data members and member function for that class.
//For static methods you do not need any object of class to access attributes of class, but what if, no static method is present.
//Use FCM
//FCM- Factory Class Method is used when constructor is private and no static method is present, then create one static 
//method "m()" which is returning its own object, and with the help of this object you can invoke the data members and member function.

class FCM
{
	private FCM()  //private constructor.
	{}
	
	int a = 9;
	
	static FCM m() //create one static method "m()" which is returning its own object.
	{
		FCM fcm = new FCM();
		return fcm;
	}
	void m1()
	{
		System.out.println("Hi this is m1().");
	}
	void m2()
	{
		System.out.println("Hi this is m2().");
	}
	
}
class FCMTest
{
	// static final FCM fcm = new FCM();

	public static void main(String[] ag)
	{
		//FCM fcm = new FCM(); //can't create object, as its constructor is private.
		//FCM.m1();            //can't call member functions as these are not static.
		//FCM.m2();            //can't call member functions as these are not static.
		FCM obj = FCM.m();     //call that static method, which will return object.
		obj.m1();              //use object to access member functions.
		obj.m2();
	}
}