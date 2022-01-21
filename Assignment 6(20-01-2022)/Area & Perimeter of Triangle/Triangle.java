public class Triangle 
{
	int b=3,h=4;
	int area=(b*h)/2;
	int a=3,d=4,c=5;
	int perimeter=(a+d+c)/2;
public static void main(String args[])
{
Triangle B= new Triangle();
System.out.println("Area="+B.area);
System.out.println("Perimeter="+B.perimeter);
}
}