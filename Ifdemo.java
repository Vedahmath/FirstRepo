 import java.util.*;
class Ifdemo
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your age");
int age=s.nextInt();
if(age>18)
System.out.println("Congrats!!!!! Eligible for voting");
else
System.out.println("Be patiance,not eleigible for vote");
}
}