package assignment_2.scoping;

public class VariableScope {
    public static void main (String args[]) {
        example_1();

        // Question 1, does i exist at this point?
        // If so can you uncomment this and the code will compile?
        // System.out.println(i);

        if(true) {
            int i = 1; //0;
        }
        // Question 2, does i exist at this point?
        // If so can you uncomment this and the code will compile?
        //System.out.println(i);
    }

    public static void example_1(){
        int i = 0;
        System.out.println("i=" + i);
    }
}
