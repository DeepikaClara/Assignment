package assignments;
abstract class A //abstract class A
{
	abstract void first();//abstract methods- first,second ,third
	abstract void second();
	abstract void third();
	void fourth() //non-abstract method
	{
		System.out.println("FOURTH");
	}
}
class B extends A //inheriting class A to class B
{
	//when extending a abstracting class,
    //its compulsory to call all its abstract methods
	void first()
	{
		System.out.println("FIRST");
	}
	void second()
	{
		System.out.println("SECOND");
	}
	void third()
	{
		System.out.println("THIRD");
	}
}
class C extends A //inheriting class A to class C & calling all its abstract methods
{
	void first()
	{
		System.out.println("FIRST");
	}
	void second()
	{
		System.out.println("SECOND");
	}
	void third()
	{
		System.out.println("THIRD");
	}
}
public class Abstraction {
public static void main(String args[])
{
A a;//creating obj for A 
a=new B();//using class A's obj 'a' to call other classes and its methods 
a.first();
a.third();
a.second();
a=new C();
a.first();
a.third();
a.third();
}
}
