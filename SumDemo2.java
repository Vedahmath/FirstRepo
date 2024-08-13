import java.util.*;
class SumDemo2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int sum=0;
char ch;
do
{
System.out.println("Enter the number");
int num=s.nextInt();
sum+=num;
System.out.println("Sum is: "+sum);
System.out.println("Do you want to add more");
String st=s.next();
ch=st.charAt(0);
}while(ch!='n');
}
}