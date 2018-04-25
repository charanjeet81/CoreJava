/*new and instanceof both are operator and keyword.
If any object is instance of any particular class, then it will return true on printing.*/
package INHERITANCE_5;

class Animal
{}
class Reptile extends Animal
{}
class Mammal extends Animal
{}
class Dog extends Mammal
{}

public class Test5 {
	public static void main(String[] args)
	{
		Dog d = new Dog();
		System.out.println(d instanceof Animal);
		System.out.println(d instanceof Mammal);
		//System.out.println(d instanceof Reptile);   //shows compiler error.
	}
}
