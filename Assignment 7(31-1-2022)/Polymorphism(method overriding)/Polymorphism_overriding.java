package assignments;
class X
{
	void a()//overridden method
	{
		System.out.println("Java Programming Language");
		}
}
class Y extends X
{
	//overriding method 'a'
	void a()
	{
		super.a(); //using super keyword to call parent class method 'a'
		System.out.println("Common English Language");
	}
}
public class Polymorphism_overriding 
{
public static void main(String args[])
{
	Y obj=new Y();
    obj.a();
	
}
}
