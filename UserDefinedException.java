import java.util.Scanner;
class NegativeAgeException extends Exception
{
	private int mynumber;
	public NegativeAgeException (int mynumber)  
	{ 
		this.mynumber=mynumber; 
	 }
	public String toString() 
	{
	return("Age cannot be negative :  " +mynumber); 
	} 
}

public class UserDefinedException
{
public static void main (String[] args) throws Exception
{
	int number= getnumber();
	if(number< 0) 
	{ 
		throw new NegativeAgeException(number);
	}
	else 
	{
		System.out.println(" Age is : "+ number);  
	}
	System.out.println("Error Free Input");
	 }

	public static int getnumber() 
	{  
        Scanner sc=new Scanner(System.in);
	int age;
	System.out.print("Enter age : " );
	age=sc.nextInt();
	return age;
	}
}

