package others_14;
//Enum in java is a data type that contains fixed set of constants-values like; 7 fixed days, 4 directions, juice-glass-size, all browser type.
//The java enum constants are static and final implicitly.
//Enum Points:
//enum improves type safety
//enum can be easily used in switch
//enum can be traversed
//enum can have fields, constructors and methods
//enum may implement many interfaces but cannot extend any class because it internally extends Enum class
//values() method in enum: The java compiler internally adds the values() method when it creates an enum. The values() method returns an array containing all the values of the enum.
//How many .class file below program will generate? => 5(for interface, abstract class, innerEnum, outerEnum, main testing class i.e. Test1)

interface Glass{}

abstract class AbstractGlass{}

enum GlassSize1 { SMALL, MEDIUM, LARGE }  //Enum outside the class.

public class EnumTest1 
{
	GlassSize1 size;
	
	enum GlassSize2 { SMALL, MEDIUM, BIG }//Enum inside the class.
	public static void main(String[] args)
	{
		GlassSize1 g1 = GlassSize1.SMALL;
		System.out.println(g1);
		
		GlassSize2 g2 = GlassSize2.BIG;
		System.out.println(g2);
		
		EnumTest1 t1 = new EnumTest1();
		t1.size = GlassSize1.LARGE;
		System.out.println(t1.size);
	}
}