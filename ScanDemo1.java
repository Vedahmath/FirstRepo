import java.util.*;
class ScanDemo1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your name");
String name=s.nextLine();
System.out.println("Enter your age");
int age=s.nextInt();
System.out.println("Enter your percentage");
double perc=s.nextDouble();
System.out.println("Enter your grade");
float grad=s.nextFloat();
System.out.println("Name is: " +name);
System.out.println("Age: "+age);
System.out.println("Percentage: "+perc);
System.out.println("Grade: "+grad);
}
} 