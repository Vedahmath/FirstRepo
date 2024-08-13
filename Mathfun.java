import java.util.*;
class Mathfun
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the valuee of n: ");
double n=s.nextDouble();
System.out.println("Float Absolute value of "+n+" is : "+Math.abs(n));
System.out.println("Ceil value of "+n+" is : "+Math.ceil(n));
System.out.println("Floor value of "+n+" is : "+Math.floor(n));
System.out.println("Exponential value of "+n+" is : "+Math.exp(n));
System.out.println("Lg value of "+n+" is : "+Math.log(n));
System.out.println("Log value (Base 10) of "+n+" is : "+Math.log10(n));
System.out.println("Sine value of "+n+" is : "+Math.sin(n));
System.out.println("Cosine value of "+n+" is : "+Math.cos(n));
System.out.println("Degrees value of "+n+" is : "+Math.toDegrees(n));
System.out.println("Radians value of "+n+" is : "+Math.toRadians(n));
System.out.println("Square root value of "+n+" is : "+Math.sqrt(n));
}
}