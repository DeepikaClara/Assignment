package assignments;
class X1
{
	//Method overloading:same method name doing different functions
	//here,inorder to print **** & #### in overloading,
	//i'm passing different arguments
	void a(int a)
	{
		System.out.println("****************");
	}
	void a(int a,int b)
	{
		System.out.println("");
		System.out.println("#################");
	}
}
public class Polymorphism_overloading {
public static void main(String args[])
{
X1 obj=new X1();
obj.a(2);
obj.a(2,2);
}
}
