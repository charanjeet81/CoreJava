package generics;

import java.util.*;

/*
The ? (question mark) symbol represents wildcard element. It means any type. If we write <? extends Number>, 
it means any child class of Number e.g. Integer, Float, double etc. Now we can call the method of Number class 
through any child class object.*/
abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape 
{
	private int a;
	private int b;
	
	Rectangle(int a, int b)
	{
		this.a = a;
		this.b = b; 
	}
	
	void draw() {
		System.out.println("Drawing Rectangle: "+ (a*b));
	}
}

class Circle extends Shape 
{
	private int r;
	
	Circle(int r)
	{
		this.r = r;
	}
	
	void draw() {
		System.out.println("Drawing Circle: "+(3.14*r*r));
	}
}

class JavaGenerics4 
{
	// creating a method that accepts only child class of Shape
	public static void drawShapes(List<? extends Shape> lists) {
		for (Shape s : lists) {
			s.draw();// calling method of Shape class by child class instance
		}
	}

	public static void main(String args[]) 
	{
		List<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle(3, 4));
		list1.add(new Rectangle(5, 8));

		List<Circle> list2 = new ArrayList<Circle>();
		list2.add(new Circle(12));
		list2.add(new Circle(14));

		drawShapes(list1);
		drawShapes(list2);
	}
}