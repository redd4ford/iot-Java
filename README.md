### laboratory-works-Java-2020
this is a repo for all laboratory works I coded on Java as a part of my educational process at LPNU IoT 1st course.
======================================================================================================================================
# lab 1 : class usage
crete a console program that operates with objects  of the *Helicopter class*, which contains: 5 private fields; 2 protected fields; static int field; getters and setters; constructor with 4 parameters and constructor with all parameters (use *this()* to avoid code copypasting). override *toString()* method. add *resetValues()* method which changes values of all fields. add *printStatic()* method which returns the value of the static field. in *main()* method create 3 objects of the class, print them, print the static field, and add a do-while cycle in which 4 empty objects are created and saved to an array; them print them as well.

# lab 2 : UML diagrams
draw a UML diagram using draw.io for *ConstructionGoods class*. use all the main principles of OOP. add an extra ConstructionGoodsManager class which implements sort- and find- methods, e.g. *sortByWeight()* and *sortByWidth()*, *findCheaperThan()* etc. sorting may be ascending and descending.

# lab 3 : unit testing
create a maven project. code all the construction goods subclasses in accordance with the UML diagram created as a part of lab 2. use unit testing to call sorting methods (currently empty). edit the code in accordance with *Google style code convention*.

# lab 4 : inner classes usage and cleaning the code
implement sorting methods using comparators made as: *a static inner class*; *an inner class*; *an anonymous inner class*; *lambda expression*. edit the code with *PMD*, *SpotBugs*, and *Checkstyle plugins*, and in accordance with *Google style code convention*.

# lab 5 : writing information on objects to a CSV file
implement writing information on objects to a CSV file. you should use a new *Writer class* with *writeToFile()* method. use *try-with-resources*. also add *getHeaders()* and *toCSV()* methods to all your classes. call these methods from tests. edit the code with *PMD*, *SpotBugs*, and *Checkstyle plugins*, and in accordance with *Google style code convention*.

# lab 7 : migrating to spring boot and REST
create a *REST service* for one of the classes created in lab 3 with *CRUD operations (Get/Post/Put/Delete)* implementation. *GET* with id in URL-request should return specific object with this id; *GET* without any path variable should return all the objects. expand the class with id field. edit the code with *PMD*, *SpotBugs*, and *Checkstyle plugins*, and in accordance with *Google style code convention*.

# lab 8 : connection of the PostgreSQL database
implement saving the object of one of the lab 3 classes in the table of a database using *Spring Boot* and *Spring Data*. re-write *CRUD operations methods* so that saving and reading the data is done using the database. add *Controller*, *Repository*, and *Service classes*. configure the database connection via *application.properties* file. edit the code with *PMD*, *SpotBugs*, and *Checkstyle plugins*, and in accordance with *Google style code convention*.

# lab 9 (bonus) : hibernate mappings
add 2 additional classes for your application. *ManyToMany relationship* should be established with the first class and *ManyToOne* should be established with the second class. add *Controllers*, *Repositories*, and *Services* for these classes. test REST-methods with *Postman*. edit the code with *PMD*, *SpotBugs*, and *Checkstyle plugins*, and in accordance with *Google style code convention*.
