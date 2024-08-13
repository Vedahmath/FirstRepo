class Student
{
int regno;
void getno(int n)
{
regno=n;
}
void dispnumber()
{
System.out.println("Roll number is : "+regno);
}
}
class Test extends Student
{
float p1,p2;
void getmarks(float m1,float m2)
{
p1=m1;
p2=m2;
}
void dispmarks()
{
System.out.println("p1Marks : "+p1);
System.out.println("p2marks : "+p2);
}
}
interface Sports
{
float spwt=6.0f;
void putwt();
}
class Result extends Test implements Sports
{
float tot;
public void putwt()
{
System.out.println("weight "+spwt);
}
void disptotal()
{
tot=p1+p2+spwt;
dispnumber();
dispmarks();
putwt();
System.out.println("Total : "+tot);
}
}
class Hybrid
{
public static void main(String ar[])
{
Result s=new Result();
s.getno(1234);
s.getmarks(56.0f,77.0f);
s.disptotal();
}
}