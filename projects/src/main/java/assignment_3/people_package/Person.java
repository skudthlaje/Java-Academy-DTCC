package assignment_3.people_package;
/*
    This is the class you need to work on
    If you were to create a class from scratch, please remember that the name of the class should match
    the name of the file the class resides in. (this is more of a convention thing)

    Reference:
    1) https://stackoverflow.com/questions/1841847/can-i-compile-a-java-file-with-a-different-name-than-the-class
 */
import java.util.*;
import java.lang.String;

public class Person
{
    private String name; //="A";
    private int age; // = 0;
    private int ID = new Random().nextInt(1001); // randomly generated in the Person class , default value

    Person()
    {

    }
    public Person(String name, int age) //, int id)
    {
        this.name = name;
        this.age = age;
        //this.ID = new Random().nextInt(1001); ; //should be between 0 and 1000
    }

    public void setName(String name)
    {
        //Random r = new Random();
        //int i= r.nextInt(1001);
        this.name = name;
    }
    public void setAge(int age)
    {
        if ( age < 1 && age > 99)
            System.out.println("Invalid age ! \n");
        else
            this.age = age;
    }

    /*
    public void setID(int id)
    {
        if ( id <0 && id > 1000)
            System.out.println("Invalid ID ! \n");
        else
            this.ID = id; //r.nextInt(1001);
    }*/

    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public int getID()
    {
        return this.ID;
    }

    /* Print this person's information and return it too */
    @Override
    public String toString()
    {
        String str= new String();
        //System.out.println("super.toString() : " + super.toString());
        str = "\n        Name : " + this.name + "\n        Age : " + this.age + "\n        ID : " + this.ID;
        //System.out.print("\n Hi : " + str); //super.toString() +
        return str;
    }

} // end : class Person




