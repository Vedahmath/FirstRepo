class MyFirstException extends Exception {
    public MyFirstException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
// A Class that uses above MyFirstException
public class MainClass {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyFirstException("It is an User Defined Exception ");
        }
        catch (MyFIrstException ex) {
            System.out.println("Caught the Exception");
 
            // Print the message from MyFIrstException object
            System.out.println(ex.getMessage());
        }
    }
}
