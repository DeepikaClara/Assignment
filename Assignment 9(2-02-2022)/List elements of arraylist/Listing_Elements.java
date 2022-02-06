package basics2;

import java.util.ArrayList;
import java.util.Iterator;

public class Listing_Elements 
{
public static void main(String args[])
{
	ArrayList<String> school=new ArrayList<String>();
	school.add("Books");
	school.add("Pen");
	school.add("Lunch");
	school.add("Play ground");
	school.add("Teacher");
	school.add("Students");
	Iterator S= school.iterator();
	while(S.hasNext())
	{
	System.out.println(S.next());	
}
}
}
