class Traverse
{
public static void main(String arg[])
{
String s="NationalCollege Basavanagudi";
for(char ch:s.toCharArray())
{
System.out.print(ch+":");
if(ch==' ')
break;
}
}
}