# Assignment 3 - "Proper" Object Orientation

### Pepp Talk

If you're rusty this assignment may jump around in difficulty rapidly, but don't worry.

All the resources you'll need to succeed are in the `Resources` section at the
end of this `ReadMe`.

May the force be with you!

# Section 1
## Section 1a - Warm Up

Let's take a trip to the `DogPound`! 

Quite literally,
we're going to be modifying a class named `Dog` and 
implementing some functionality that our previous 
programmers left out. 

<b>Section Instructions</b>:
- Please <b>do not</b> modify any of the code with the <i>scope</i> of the <i>function</i> `public static void main`
- Please <b> do </b> modify the code where specified, specifically in the `setName` and `speak` functions

When you believe you are finished, please attempt to execute the main method and your
points will be displayed.

### Section 1a - Troubleshooting

- I can't run the main method!

Please ensure that your project is set up correctly in your IDE (contact us
if you need help with this, but hopefully assignment 1 should have you prepared)

- I'm not sure what to change for this section!

We're always looking for ways to make assignment instructions more clear,
please feel free to contact us for any questions about the assignment


## Section 1b - Are You A People Person?

Now that you've gotten through the warmup, let's take it up a notch!

Under the `assigment_3` directory (within the same folder as the people package)
class.

<b>Section Instructions</b>:

Create:

A <b>class</b> named `Person` with several <b> class attributes </b>

- A <b> name </b>
- An <b> age </b>
- A <i> randomly generated </i> <b> ID </b> number between `0` and `1000` 

## Section 1c - Encapsulating Your Person
Let's `encapsulate` our Person by hiding those attributes.

Additionally, let's create "getter" and "setter" methods if you 
haven't already.

# Section 1 - Recap

By this point we should have a Person class created that is contains
a few attributes that are well encapsulated!

The last thing we want to do is `override` the object's `toString()`
method and print out the attributes we have created.

The output should look something like if we attempt to 
`System.out.println(p)` and p is our person object.
```
Name : Person's Name
Age : Person's Age
ID : Person's ID
```
(Please note that it does not have to be exactly in the above format,
the gist is that you correctly present the attributes via overriding 
the `toString()` method)

# Section 2

## Section 2a - Summary Statistics

<b>Section Instructions</b>:
- Let's use our previously created `Person` class to construct a 
few objects, with randomly generated ages between 1 and 99
- Let's add those objects to an ArrayList<Person>
- Lastly let's get the maximum aged person, the minimum aged person, and the 
average age of a Person in our ArrayList.

### Section 2a - FAQ

- How do I create an ArrayList?

ArrayList<T> arrayListVariableName = new ArrayList<>();

- How do I construct an object?

You must use the object's constructor, for example `new Person()`

- How do I add items into an ArrayList?

`arrayListVariableName.add( the thing you want to add )`

    
## Section 2b

We're going to piggy back off of Section 2b and do more operations
on our list of Person.

<b>Section Instructions</b>:

- Please create a function to sort the list of Person alphabetically, by name
- Please create a function to sort the list of Person by age and ensure that the function contains a parameter to denote whether the sort is ascending or descending

## Section 2 - Recap

By this point you should have had some fun learning how to sort a collection, great job.

In addition, you should have had an opportunity to read "someone else's code" and
understand where to make changes, this is a key skill in the workforce. 

Where, a large amount of code is "legacy" meaning originally developed some time before you arrived.

As a software engineer your role will be to with sometimes very little context
be able to debug code (we have more on this in later assignments), understand new
concepts and coding styles, and still deliver on assigned work.

# Section 3 - Itemization (Warm Down)

Let's make an item!

But, first let's think about what makes an item, an item.

Items, in the context of a `shop` have things like a:

- price
- description
- name
- type

<b> Section Instructions </b>

- Create an class within the `item_package` named `Item`
- Ensure that it has the attributes above
- Ensure that those attributes are encapsulated
- Ensure that those attributes are only available via the object's "API"

<b> Pro Tip:</b> if you were asked in an interview "What are the four pillars
of object oriented programming?"

You may answer:

"Encapsulation, Abstraction, Inheritance & Polymorphism"

This section (and section 1) specifically hits on two of the pillars 
`encapsulation` and `abstraction`.

Please try to keep this in mind as we move forward and once 
you finish this section, congratulations on completing your second assignment!


# Resources

- https://algs4.cs.princeton.edu/11model/ (Java Language Basics)
- https://en.wikibooks.org/wiki/Java_Programming/Classes,_Objects_and_Types (Objects)
- https://en.wikibooks.org/wiki/Java_Programming (Java Language)

Please feel free to use anything relevant you may come across in your research as well.

