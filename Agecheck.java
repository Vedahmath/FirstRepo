import java.util.*;
class Agecheck
{
public static void main(String arg[])
{
Scanner v=new Scanner(System.in);
int age;
System.out.println("Enter age: ");
age=v.nextInt();
if(age>0 && age<18)
System.out.println("JUNIOR");
else if(age>=18 &&age<40)
System.out.println("ADULTS");
else if(age>=40 && age<60)
System.out.println("MID AGE");
else if(age>=60)
System.out.println("SENIOR CITIZEN");
else
System.out.println("Invalid age");
}
}