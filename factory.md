Factory Pattern

- Creational pattern
- uses SOLID principles

- A factory pattern is used to create instances of different classes of same type. The 'factory' is a place to create different products which have the same features but can be divided into categories. 

- The factory method defines an interface for creating objects but lets subclasses decide which classes to instantiate.

- (A method returns one of several possible classes that share a common super class. The class is chosen at runtime. )
//need to ask about this tomorrow//

Advantages
- Long term flexibility with change
The pattern works as a bridge between multiple classes. If a client makes changes to the application, not all code will have to be re written as the essential behaviour will be held in the factory.
Our code will be easy to change or add to code in the future, when someone decides to add a new class to the code we can simply add the code and extend the factory method.

- Decoupled and more testable design
If code is added to unit tests can be kept as before as all key behaviours are kept in the 'factory'.

- DRY code, it saves having the same code written multiple times

Consistent behaviour within the application
- The classes that need an implementation of the product do not need to know how to construct one. The factory holds all of that information. The decision-making process is abstracted from the subclasses to the factory.


Example from Stack Overflow
- The factory pattern is like a hiring agency. You've got someone that will need a variable number of workers. This person may know some info they need in the people they hire, but that's it.

So, when they need a new employee, they call the hiring agency and tell them what they need. Now, to actually hire someone, you need to know a lot of stuff - benefits, eligibility verification, etc. But the person hiring doesn't need to know any of this - the hiring agency handles all of that.

In the same way, using a Factory allows the consumer to create new objects without having to know the details of how they're created, or what their dependencies are - they only have to give the information they actually want.

