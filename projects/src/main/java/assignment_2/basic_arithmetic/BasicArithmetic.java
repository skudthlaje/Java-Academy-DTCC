package assignment_2.basic_arithmetic;

public class BasicArithmetic {

    /*
        Your goal here is to understand the basic mathematical operators
        work within Java
     */
    public static void main (String args[]) {

        System.out.println(String.format("Addition Asserts Correctly: %b", add(1, 1) == 2));
        System.out.println(String.format("Subtraction Asserts Correctly: %b", subtract(3 , 2) == 1));
        System.out.println(String.format("Multiplication Asserts Correctly: %b", multiply(5, 5) == 25));

        /*
            Pro Tip for division & remainder (modulo):
            x divided by y:

               3__ (result of division)
            3 | 10
                -9
               ---
                 1 left over (remainder)
         */

        System.out.println(String.format("Division Asserts Correctly: %b", divide(3, 10) == 3));
        System.out.println(String.format("Remainder Asserts Correctly: %b",remainder(3, 10) == 1));

        /*
            Complete uncomment and complete this assert.

            I want you to try to figure it out mentally, remember PEMDAS (https://en.wikipedia.org/wiki/Order_of_operations)

            For Java specific PEMDAS: (https://introcs.cs.princeton.edu/java/11precedence/)

            but, it's code so you can always "cheat" ;)
         */

         //System.out.println(String.format("Special Asserts Correctly: %b", (10 * 10 + (1 + 3 * ( 5 - 2 ) / 3) + 1 * 2 - 1 * 3) == 1))
         System.out.println(String.format("Special Asserts Correctly: %b", (10 * 10 + (1 + 3 * ( 5 - 2 ) / 3) + 1 * 2 - 1 * 3) == 103));
    }

    public static int add(int x, int y)
    {
        return (x+y); //0;
    }

    public static int subtract(int x, int y)
    {
        return (x-y); //0;
    }

    public static int multiply(int x, int y)
    {
        return (x*y); // 0;
    }

    public static int divide(int x, int y)
    {
        return (y/x); //0;
    }

    public static int remainder(int x, int y)
    {
        return (y%x);  //0;
    }
}
