package basics2;
import java.util.ArrayList;
import java.util.Iterator;
public class Retrieve_arraylist
{
public static void main(String args[])
{
	ArrayList<Character> list2=new ArrayList<Character>();
	list2.add('B');
	list2.add('e');
	
	ArrayList<Character> list= new ArrayList<Character>();
	list.add('K');
	list.add('i');
	list.add('n');
	list.add('d');
	
	System.out.println("Elements of list: "+list);
	System.out.println("Retrieving fourth and first elements: ");
	Character C= list.get(3);
	System.out.println("Fourth element: "+C);
	Character D=list.get(0);
	System.out.println("First element: "+D);
	
	list2.addAll(list);
	System.out.println("joined lists: "+list2);
	ArrayList<String> list3=new ArrayList<String>();
	list3.add("Be");
	list3.add("kind");
	for(Iterator<String> L=list3.iterator();L.hasNext();)
	{
		System.out.print(L.next());
	}
	
}
}
