package basics2;

import java.util.Iterator;
import java.util.LinkedList;

public class Reverse_linkedlist 
{
public static void main(String args[])
{
	LinkedList<Integer> numbers=new LinkedList<Integer>();
	numbers.add(1);
	numbers.add(2);
	numbers.add(3);
	numbers.add(0, 0); //before index'0', element'0' is inserted 
	Iterator<Integer> N = numbers.descendingIterator();
	while(N.hasNext())
	{
	System.out.println(N.next());
	
}
}
}