# Factory-method-design-pattern
I have provided an example of the Factory Method design pattern in Java. This pattern is a creational design pattern that provides an interface for creating objects, but it allows subclasses to alter the type of objects that will be created. In my example, I have two concrete classes, AndroidDeveloper and WebDeveloper, both implementing the Employee interface. I also have an EmployeeFactory class that provides a method for creating instances of Employee objects based on a given input string.

Here's a breakdown of my code:

1. The employee is an interface with a salary method, which should be implemented by concrete employee classes.

2. AndroidDeveloper and WebDeveloper are two concrete classes that implement the Employee interface. They provide their own implementations of the salary method and print the salary information.

3. EmployeeFactory is a factory class with a static method getEmployee(String empType) that takes a string argument and returns an instance of an employee based on the input string. It uses a simple if-else block to determine which type of employee to create.

4. DeveloperClient is a client class that demonstrates how to use the factory to create Employee instances. It requests both an "Android Developer" and a "Web Developer" and prints their salaries.
