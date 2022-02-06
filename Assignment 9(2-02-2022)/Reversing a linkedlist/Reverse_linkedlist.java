package basics2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Reverse_linkedlist 
{
public static void main(String args[])
{
	LinkedList<Integer> numbers=new LinkedList<Integer>();
	numbers.add(1);
	numbers.add(2);
	numbers.add(3);
	numbers.add(0, 0); //before index'0', element'0' is inserted
	//for Reversing,
	//1.Iterator: descendingIterator()
	Iterator<Integer> N = numbers.descendingIterator();
	while(N.hasNext())
	{
	System.out.println(N.next());
	}
	System.out.println("--------");
	//2.ListIterator: listIterator(linkedlist's obj.size()
	ListIterator<Integer> M=numbers.listIterator(numbers.size());
	while( M.hasPrevious())
	{
		System.out.println(M.previous());
	}
	
}
}


