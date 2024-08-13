class Student
{
String name;
int regno;
double tmarks;
Student()
{
name="Unknown";
regno=0;
tmarks=20;
}
Student(String s,int r,double m)
{
name=s;
regno=r;
tmarks=m;
}
void studinfo()
{
System.out.println("Name : "+name);
System.out.println("Register number: "+regno);
System.out.println("Total marks: "+tmarks);
}
double studinfo(int a,int b,int c)
{
tmarks=a+b+c;
return tmarks;
}
public static void main(String ar[])
{
Student s=new Student();
s.studinfo();
Student s1=new Student("ABC",111,45);
s1.studinfo();
System.out.println("Total marks of a student "+s1.name+"is : "+s1.studinfo(90,80,65));
}
}