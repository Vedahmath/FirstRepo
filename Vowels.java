import java.util.*;
class Vowels
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int count=0;
String st=s.nextLine();
for(int i=0;i<st.length();i++)
{
switch(st.charAt(i))
{
case 'a':
case 'A':System.out.println("Vowel a/A found");
	count++;
	break;
case 'e':
case 'E':System.out.println("Vowel e/E found");
	count++;
	break;
case 'i':
case 'I':System.out.println("Vowel i/I found");
	count++;
	break;
case 'o':
case 'O':System.out.println("Vowel o/O found");
	count++;
	break;
case 'u':
case 'U':System.out.println("Vowel u/U found");
	count++;
	break;
}
}
System.out.println("Total vowel count is: "+count);
}
}