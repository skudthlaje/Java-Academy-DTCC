package assignment_3;


public class DogPound {

    /*
        The DogPound is a warm up exercise!

        This is assignment part 2a
     */

    public static void main (String[] args) throws Exception {
        /*
            Please do not modify the code at this point!
            For the sections you will modify, there will be a "Modify Me" comment
         */
        Dog myDog = new Dog();
        myDog.setName("Fido");

        if(myDog.name != null ) {
            System.out.println("Great the Dog's name is: " + myDog.name);
        }

        // If we print the variable "x" what do you think the value will be?
        String x = myDog.name;
        System.out.println(String.format("The value of variable x is %s", x));

        // If we change the value of the variable "x" will that affect myDog.name?
        x = "Other Name";
        System.out.println(String.format("The value of variable x is %s", x));
        System.out.println(String.format("The value of variable myDog.name is %s", myDog.name));

        String dogsSpeech = myDog.speak();
        if(dogsSpeech != null) {
            System.out.println(String.format("The value of variable dogsSpeech is %s", dogsSpeech));
        }

    }


    public static class Dog {
        /*
            Modify Me
         */
        public int age;
        public String name;

        public Dog() {
            age = -1;
            name = null;
        }

        public void setName(String n) throws Exception {
            /*
                Please finish this method, you want to set the private variable "name" of the
                class Dog to the value of the parameter of the "setName" method.

                An example of variable assignment:

                <data type> <variable name> = <expression>
             */

            throw new Exception("Please implement this function");
        }

        public String speak() {
            /*
                Please finish this method, you want to ensure that your dog speaks
                when you ask them to.
             */

            return null;
        }
    }
}
