package assignment_3.item_package;

import projects.src.main.java.assignment_3.item_package.Item;

import java.util.ArrayList;



import java.util.ArrayList;

public class driver {
    public static void main (String args []) {
        /*
            This can be where you attempt to test constructing your objects!

            Additionally, you can create a main method in your item class if you so choose.
         */

        // Example construction of root class Object
        //Object o = new Object();

        ArrayList<Item> items = new ArrayList<>();
        // item reps an item in grocery shop

        items.add(new Item("Potato","Produce","varieties : red,yellow, russet, mini or baby etc.",0.93));
        items.add(new Item("Tomato","Produce","varieties: roma, stem, beefsteak, cherri, grape etc.",1.19));
        items.add(new Item("Pasta","International","varieties: macaroni,rotini, ziti,shell,sphagatti etc. ",.90));
        items.add(new Item("Milk","Dairy","varieties : whole, 2%, 1%, skim, lactose-free etc",2.64));
        items.add(new Item("Salt","Condiments","varieties : iodized, table, rock, pink,ice-cream etc.",2.69));

        String str= "Name               Type                   Description                                                     Price/unit($) \n";
        System.out.println("\n Items so far in your list :\n\n " + str);

        // print all the items in the list
        for(int i =0; i<items.size(); i++)
            System.out.println( items.get(i));
    }   // end main
}   // end class driver

