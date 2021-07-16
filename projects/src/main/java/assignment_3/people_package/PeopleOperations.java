package assignment_3.people_package;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import assignment_3.people_package.Person;
import sun.security.x509.OtherName;

public class PeopleOperations
{
    public static void main (String args [])// throws Exception {
    {
        /*
            Please ensure that you create an ArrayList of Person(s) with at least
            4 members
         */

        // Begin : Shobha's code

        // Get # of people in Person class
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hi there,\n Please enter the # of people (<= 1000) you want in your Person class :");
        int numOfPeopleInPersonClass = userInput.nextInt(); //1000;
        //   Get sorting choice for age
        System.out.println("\n Sort age ascending ? (answer true or false)\n");
        boolean age_isAscending = userInput.nextBoolean();
        //  Get sorting choice for name
        System.out.println("\n Sort name ascending ? (answer true or false)\n");
        boolean name_isAscending = userInput.nextBoolean();

        System.out.println("\n---------------------------------------------------------------\n");
        System.out.println("\n People in your list : \n ");

        int counter = 0;

        // Create an ArrayList of names of few people, say 10, to generate random names
        ArrayList<String> names = new ArrayList<>();

        names.add("Li");
        names.add("SantaC");
        names.add("Joe");
        names.add("AnaBell");
        names.add("Bella");
        names.add("Zack");
        names.add("Michelle");
        names.add("Robinhood");

        ArrayList<Person> people = new ArrayList<Person>();

        while (counter < numOfPeopleInPersonClass)
        {
            Person p = new Person();
            int id = p.getID();
            String personName = names.get(new Random().nextInt(8)); // Randomly select 1 out of given 8 names
            personName = String.format(personName + id ); // Append id to that name which makes the name unique
            //System.out.println("\n New person " + (counter+1) + " : "+ personName);
            int age = ThreadLocalRandom.current().nextInt(1, 100); // Randomly generate age between 1 and 99
            p.setName(personName);
            p.setAge(age);
            people.add(p);
            //System.out.println("--e o person-- (after people.add(...)) " + counter);
            System.out.print("\n  " + (counter + 1) + "  : " + people.get(counter));
            counter++;
        }

        Person youngestPerson = getYoungestPerson(people);
        Person oldestPerson = getOldestPerson(people);
        int averageAge = getAverageAge(people);
        System.out.println("\n\n Youngest Person : " + youngestPerson );// + "\n Details :\n " + "       Name : "+youngestPerson.getName() + "\n        Age : "+ youngestPerson.getAge() + "\n        ID : " + youngestPerson.getID());
        System.out.println("\n Oldest Person : " + oldestPerson ); // + "\n Details :\n " + "       Name : "+oldestPerson.getName() + "\n        Age : "+ oldestPerson.getAge() + "\n        ID : " + oldestPerson.getID());
        System.out.println("\n Average age of this group is : "+ averageAge + " years ");

        ArrayList<Person> sortedByAgeList = getSortedListByAge(people,age_isAscending);

        System.out.println("\n ArrayList of people sorted by age : \n");

        for(Person p : sortedByAgeList)
        {
            System.out.println(p);
        }

        ArrayList<Person> sortedByNameList = getSortedListByName(people,name_isAscending);

        /*

            For the below to work where you can see what you've done, you must have
            done the section 1 recap portion where you override the toString() method of the
            Person class!
        */

        System.out.println("\n ArrayList of people sorted by name : \n");

        for(Person p : sortedByNameList)
        {
            System.out.println(p);
        }



    } // end : main

    public static Person getYoungestPerson(ArrayList<Person> list) // throws Exception
    {
        //throw new Exception("Please implement this method");
        int index = 0;
        if (!list.isEmpty())
        {
            int youngest = list.get(0).getAge();

            for( int i =1; i<list.size() ; i++ )
            {
                int nextPersonAge = list.get(i).getAge();
                if (youngest > nextPersonAge)
                {
                    youngest = nextPersonAge;
                    index = i;
                }
            }
        }
        return list.get(index);
    } // end method getYoungestPerson

    public static Person getOldestPerson(ArrayList<Person> list) //throws Exception {
        //throw new Exception("Please implement this method");
    {
        int index = 0;
        if (!list.isEmpty())
        {
            int oldest = list.get(0).getAge();

            for( int i =1; i<list.size() ; i++ )
            {
                int nextPersonAge = list.get(i).getAge();
                if (oldest < nextPersonAge)
                {
                    oldest = nextPersonAge;
                    index = i;
                }
            }
        }
        return list.get(index);
    }  //  end method getOldestPerson

    public static int getAverageAge(ArrayList<Person> list) //throws Exception {
        //throw new Exception("Please implement this method");
    {
        int avgAge =0;

        if (!list.isEmpty())
        {
            int totalAge = 0;
            int totalNumberOfPeople = list.size();

            for( int i =0; i<totalNumberOfPeople ; i++ )
            {
                totalAge = totalAge+list.get(i).getAge();

            }
            avgAge = totalAge / totalNumberOfPeople;
        }

        return avgAge;
    }   // end method getAverageAge

    public static ArrayList<Person> getSortedListByAge(ArrayList<Person> list,boolean isAscending) // throws Exception {
        //throw new Exception("Please implement this method");
    {

        int youngest;     // youngest in the array ( age )
        int youngestPos ; // youngest person's position in the array

        if (!list.isEmpty())
        {
            for (int i =0; i < list.size(); i++)
            {
                youngest = list.get(i).getAge();
                youngestPos = i;

                int nextPersonAge;

                for (int j = i+1; j < list.size(); j++)
                {
                    nextPersonAge = list.get(j).getAge();
                    if (youngest > nextPersonAge)
                    {
                        youngest = nextPersonAge;
                        youngestPos = j;
                    }
                } // end : for j

                //System.out.println("\n youngest @ = "+ youngestPos + " age = " + youngest);

                Person p = list.get(youngestPos);  // store youngest person in variable p

                list.remove(youngestPos);          // remove youngest person from its current position
                list.add(i, p);                    // add youngest person in i th position

            } // end : for i
        } // end : if (!list.isEmpty)

        if (isAscending)
            return list;
        else                // isAscending = false means descending
        {
            ArrayList<Person> templist = new ArrayList<>();
            int index=0;
            int i = list.size() - 1 ;
            while (index <list.size())
            {
                templist.add(index, list.get(i));
                index++;
                i--;
            }   // end while

            return templist;

        }   // end else isAscending

    }   // end method getSortedListByAge

    public static ArrayList<Person> getSortedListByName(ArrayList<Person> list, boolean isAscending)
    {
        String lexName;
        int lexPos;

        if (!list.isEmpty())
        {
            for (int i =0; i < list.size(); i++)
            {
                lexName = list.get(i).getName();
                lexPos = i;

                String nextName;

                for (int j = i+1; j < list.size(); j++)
                {
                    nextName = list.get(j).getName();
                    if (lexName.compareTo( nextName) > 0 )  // i.e. nextName is alphabetically first
                    {
                        lexName = nextName;
                        lexPos = j;
                    }
                } // end : for j

                //System.out.println("\n youngest @ = "+ youngestPos + " age = " + youngest);

                Person p = list.get(lexPos);  // store youngest person in variable p

                list.remove(lexPos);          // remove youngest person from its current position
                list.add(i, p);                    // add youngest person in i th position

            } // end : for i

        }  // end !list.isEmpty
        if (isAscending)
        {
            return list;

        }  // end if isAscending
        else   // (!isAscending == descending )
        {
            ArrayList<Person> tempList = new ArrayList<>();
            int index=0;
            int i = list.size() - 1 ;
            while (index <list.size())
            {
                tempList.add(index, list.get(i));
                index++;
                i--;
            }   // end while

            return tempList;

        }   // end else : descending ( == !isAscending)

    }   //  end method getSortedListByName

} // end class : PeopleOperations
