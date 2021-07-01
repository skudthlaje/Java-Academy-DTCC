package assignment_3.people_package;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;

public class PeopleOperations {
    public static void main (String args []) throws ExecutionControl.NotImplementedException {
        /*
            Please ensure that you create an ArrayList of Person(s) with at least
            4 members
         */


        ArrayList<Person> people = new ArrayList<Person>();
        Person youngestPerson = getYoungestPerson(people);
        Person oldestPerson = getOldestPerson(people);
        ArrayList<Person> sortedByAgeList = getSortedListByAge(people);
        ArrayList<Person> sortedByNameList = getSortedListByName(people, false);


        /*
            For the below to work where you can see what you've done, you must have
            done the section 1 recap portion where you override the toString() method of the
            Person class!
         */

        for(Person p : sortedByAgeList) {
            System.out.println(p);
        }

        for(Person p : sortedByNameList) {
            System.out.println(p);
        }
    }

    public static Person getYoungestPerson(ArrayList<Person> list) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Please implement this method");
    }

    public static Person getOldestPerson(ArrayList<Person> list) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Please implement this method");
    }

    public static ArrayList<Person> getSortedListByAge(ArrayList<Person> list) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Please implement this method");
    }

    public static ArrayList<Person> getSortedListByName(ArrayList<Person> list, boolean isAscending) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Please implement this method");
    }

}
