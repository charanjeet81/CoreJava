package innerClass_14;
// Anonymous defined: Anonymous inner class.
interface FourWheeler
{
	void oil();	
}
class Car
{
    void engine(FourWheeler fw){          //passing reference of interface with incomplete method.
    	fw.oil();
    } 	
}



public class AnonymousTest3 
{
	public static void main(String[] args)
	{
		Car c = new Car();
		c.engine(new FourWheeler() {     // Have to implement interface with it's methods.
			public void oil() {
				System.out.println("It uses Petrol or Diesle as fuel.");			
			}
		});

	}

}
