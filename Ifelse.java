import java.util.*;
class Ifelse
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int month;
String season;
System.out.println("Enter month");
month=s.nextInt();
if(month==2||month==3||month==4)
{
season="Summer";
System.out.println("SEASON :"+season);
}
else if(month==5||month==6||month==7)
{
season="Rainy";
System.out.println("SEASON :"+season);
}
else if(month==8||month==9||month==10)
{
season="Spring";
System.out.println("SEASON :"+season);
}
else if(month==11||month==12||month==1)
{
season="Winter";
System.out.println("SEASON :"+season);
}
else
System.out.println("invalid Month");
}
}