package collectionAPI_17;
//ListIterator is most powerful cursor has bi-directional access, and you can add(), remove(), set(), previous()
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.add('A');
		ll.add('B');
		ll.add('C');
		System.out.println(ll);
		
		ListIterator li = ll.listIterator();
		while(li.hasNext())
		{
			Character ch = (Character)li.next();
			if(ch.equals('A'))
				li.remove();
			if(ch.equals('B'))
				li.set("Ball");
			if(ch.equals('C'))
				li.add('D');
		}
		System.out.println(ll);
		
	
	}

}
