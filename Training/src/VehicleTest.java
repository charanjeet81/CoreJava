abstract class Vehicle
{
	// abstract wheels();
}

class Car
{
	int height=100;
	int weight=1500;
	void wheels()
	{
		System.out.println("It has four wheels.");
	}
	void carColor()
	{
		System.out.println("It is your choice.");
	}
}

class Scooter
{
	int height=60;
	int weight=150;
	void wheels()
	{
		System.out.println("It has two wheels");
	}
	void scooterColor()
	{
		System.out.println("It is your choice.");
	}
}

public class VehicleTest 
{
public static void main(String[] args)
	{
		Car car = new Car();
		car.wheels();
		car.carColor();
		System.out.println("Car's height is = "+car.height+" centimeters.");
		
		Scooter sctr = new Scooter();
		sctr.wheels();
		sctr.scooterColor();
		System.out.println("Scoooter's weight is = "+sctr.weight+" kilograms.");
	}
}
