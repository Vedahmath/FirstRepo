class StringMethodsDemo {
  public static void main(String[] args) {

    String s1 = "Welcome one and All to ";
    String s2 = "Acharya Institutes";
    String s3 = "Acharya Institute of Graduate Studies";
    String s4 = "Acharya Institute of Graduate Studies";
    String s5 = "Master of Computer Applications";
    System.out.println("First String s1: " + s1);
    
    System.out.println("Second String s2: " + s2);
    System.out.println("Second String s3: " + s3);

// join two strings
    String combineString = s1.concat(s2);
    System.out.println("Concatenated String: " + combineString);

// compare first and second strings
    boolean result1 = s3.equals(s4);
    System.out.println("Strings s1 and s2 are equal: " + result1);

// compare first and third strings
    boolean result2 = s3.equals(s5);
    System.out.println("Strings s1 and s3 are equal: " + result2);
   
//startsWith and endsWith methods

    System.out.println("String : " + s5 +" ends with \"ions\"  : " + s5.endsWith("ions"));
    System.out.println("String : " + s5 +"  ends with \"ies\"  : " + s5.endsWith("ies"));
    System.out.println("String : " + s5 +" starts with \"Ach\"  : " +s5.startsWith("Ach"));
    System.out.println("String : " + s5 +" starts with \"Mast\"  : " +s5.startsWith("Mast"));

//charAt() method
    System.out.println(s3.charAt(8));
//change tolowercase and uppercase
    System.out.println(s3.toLowerCase());
    System.out.println(s3.toUpperCase());
    System.out.println(s2.replace('i', 'I'));
 }
}

