//Plain-Old Anonymous Inner class, flavor One : It creates an anonymous Sub-Class
package innerClass_14;



class Popcorn
{
	void pop()
	{
		System.out.println("Popcorn in Super class.");
	}
}

class Food
{
	Popcorn p = new Popcorn(){      //Anonymous Sub Class of Popcorn
		void pop()					//overridden method. 
		{
			System.out.println("Popcorn in anonymous Sub class.");
		}
		void poppy()
		{
			System.out.println("I'm Poppy in anonymous Sub class.");
		}
	};	
}

public class AnonymousTest1 
{
	public static void main(String[] args) 
	{
		Popcorn p1 = new Popcorn();
		p1.pop();
		
		Food f = new Food();
		f.p.pop();
		// f.p.poppy();     // can't access other methods, then how to access ?	
	}
}
