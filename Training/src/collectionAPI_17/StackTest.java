package collectionAPI_17;

import java.util.Stack;

/*Stack is for LIFO; Last In First Out
 * Stack is the child of the Vector Class.
 * Stack methods : push(), pop(), empty(), search(), peek()
 * */
public class StackTest 
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push('A');
		s.push('B');
		s.push('C');
		s.push(5);
		System.out.println("Display Stack :"+s);
		s.pop();              //will remove top most element.
		System.out.println("Display Stack after one 'pop()' :"+s);
		System.out.println("Index of 'A' :"+s.search('A'));  //3, If you search any other element then it will give '-1'.
		System.out.println("Is Empty ? :"+s.empty());
		

	}

}
