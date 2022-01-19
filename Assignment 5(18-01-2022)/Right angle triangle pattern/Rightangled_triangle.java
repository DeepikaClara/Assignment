class Rightangled_triangle//pattern
{
public static void main(String args[])
{
int i,j;
for(i=0;i<=6;i++)         //0<=6 T        |1<=6 T               |2<=6 T          
{
int number=1;
for(j=0;j<=i;j++)         //0<=0 T,1<=1 F |0<=1 T,1<=1 T,2<=1 F |0<=2 T,1<=2 T,2<=2 T,3<=2 F
{
System.out.print(number);//1              |12				    |123
number++;                //2           |23                      |234	
}
System.out.println();   //NEXT LINE        |NEXT LINE           |NEXT LINE
}
}
}