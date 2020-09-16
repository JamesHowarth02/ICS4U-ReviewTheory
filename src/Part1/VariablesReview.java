package Part1;

public class VariablesReview {
    public static void main(String[] args) {
        //Primitive Data Types --> Can only done 1 thing; store data.
        
        //Wholenumber.
        int a = 1234567890; // 4 Bytes.
        byte b = 126; // 1 Byte of memory bust be a maximum of 127.
        short c = 12345; // 2 Bytes.
        long d = 123456789123456789L; // 8 Bytes.
        
        //Decimal.
        float ffloat = 45.78F; // 8 bytes.
        double ddouble = 45.78; // 4 bytes.
        
        //2 more primitives.
        boolean bool = false;
        char letter = 'c';
        
        //Srings are [not] primitive.
        //Strings have abilities (methods) / things they do.
        
        String s = "I went to school today.";
        //          01234567891012345678901
        // s. --> Brings up the documentation and methods for a String.
        // 1) Methods have a return type; void returns nothing.
        // 2) Methods may or may not require parameters (data to be sent in)
        // 3) Some methods have more than 1 way to use them: pen.move(x), pen.move(x, y), s.substring(4), s.substring(3, 8);
        
        int len = s.length(); // Much like an array, this will start at 0.
        char l = s.charAt(7);
        String str1 = s.substring(3, 8);
        String str2 = s.substring(4);
      
        System.out.println("Length of \"s\" is: " + len);
        System.out.println("Character at location 7 is " + l);
        System.out.println("Location 3 to 8 is " + str1);
        System.out.println("Location 4 to the end is " + str2);
        
        //Escape codes: \n new line, \t tab, \\, \"
        System.out.println("First\t\tLast\t\tEmail Address");
        System.out.println("C:\\Documents\\Users");
        System.out.println("He went\n\nto the store.");
    }
}
