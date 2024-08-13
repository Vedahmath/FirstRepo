import java.util.*;
class Occ
{
public static void main(String ar[])
{
int count=0;
System.out.println("Enter a sstring");
Scanner s=new Scanner(System.in);
String name=s.nextLine().toLowerCase();
System.out.println("Enter the character to be searched:");
String st=s.next().toLowerCase();;
char ch=st.charAt(0);
System.out.println("Entered string Is:"+name);
int n=name.length();
System.out.println("Length of a string is: "+n);
for(int i=0;i<name.length();i++)
{
if(name.charAt(i)==ch)
{
count=count+1;
System.out.println("Char '"+ch+"' is found at :"+(i+1));
}
}
if(count>0)
System.out.println("Char '"+ch+"' is found "+count+"times");
else
System.out.println("Char "+ch+" is not found ");
}
}
