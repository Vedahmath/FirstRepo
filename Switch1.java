import java.util.*;
class Switch1
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("Ener any number");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
switch(i)
{
case 1:
case 2:
case 3:
case 4:
case 5:System.out.println(i+" is less than 6");
       break;

case 6:
case 7:
case 8:
case 9:
case 10:System.out.println(i+" is greater than 5 and less than/equal to 10");
	break;
default:System.out.println(i+" Greater than 10");
}
}
}
}