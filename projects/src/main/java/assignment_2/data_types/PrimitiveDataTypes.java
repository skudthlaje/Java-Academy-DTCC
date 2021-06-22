package assignment_2.data_types;

public class PrimitiveDataTypes {
    public static void main (String args[]) {


        char c = 'S';
        boolean bool = true;
        byte byt = 0;
        short s= 99;
        int i = 9999;
        long l = 9999999;
        float f = 10000;
        double d= 4584847589743.886;

        double dbl = (double) (i);
        float flt =(float) (f * d);
        int result = (int) (f * d );
        char ch = 'N';
        int chr_i = (int)(ch);
        System.out.println("\n (int) " + f + " X " + d + " =  " + result);
        System.out.println("\n (int) '" + ch + "' is : " + chr_i) ;

    }
}
