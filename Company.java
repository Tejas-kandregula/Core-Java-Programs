package package2;
// Inheritance Program
/* Question: Implement a Class Hierarchy for a Company System
You are tasked with designing a program for a company system that manages employees and their responsibilities. Follow these requirements:

Base Class:
Create a class Person with the following attributes and methods:

Attributes: name, age.
Methods: displayDetails() (displays name and age).
Derived Classes:

Create a class Employee that inherits from Person and adds:

Attributes: employeeId, department.
Methods: Override displayDetails() to include the employee's details.
Create a class Manager that inherits from Employee and adds:

Attribute: teamSize.
Methods: manageTeam() to print the team management action.
Abstract Class:

Create an abstract class Shape with:

Abstract method: calculateArea().
Concrete method: describeShape() that prints "This is a shape."
Create a class Circle that extends Shape and implements:

Attribute: radius.
Method: calculateArea() to compute and return the area of the circle.
Interface:

Define an interface Drawable with a method draw().
Have Circle implement Drawable and define the draw() method.
Final Keyword:

Mark a method in Person as final (e.g., getName() to return the person's name).
Polymorphism:

Use a Person reference to invoke methods on Employee and Manager objects.
Static Method:

Add a static method getCompanyDetails() in the Employee class to print the company name.
Casting:

Demonstrate upcasting (assigning a Manager object to a Person reference) and downcasting (casting the Person reference back to Manager).
Task
Write a Java program implementing this structure. */
import java.util.Scanner;

class Person
{
	 String name;
	 int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayDetails()
	{
		System.out.println(name + age);
	}
	public final String getName()
	{
		return this.name;
	}
	
}
class Employee extends Person
{
	String id,dept;
	public Employee(String name, int age, String id, String dept) {
		super(name, age);
		this.id = id;
		this.dept = dept;
	}
	@Override
	public void displayDetails()
	{
		System.out.println(id + dept);
		
	}
	public static void getCompanyDetails()
	{
		System.out.println("abc corporation ltd");
	}
}
class Manager extends Employee
{
	int teamSize;
	
	public Manager(String name, int age, String id, String dept, int teamSize) {
		super(name, age, id, dept);
		this.teamSize = teamSize;
	}

	public void manageTeam()
	{
		System.out.println(teamSize);
	}
	@Override
    public void displayDetails() {
		 System.out.println("Team Size: " + teamSize);
	}
}
abstract class Shape
{
	abstract public void calculateArea();
	public void describeShape()
	{
		System.out.println("this is shape");
	}
}
class Circle extends Shape implements Drawable
{
	int radius;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	@Override
	public void calculateArea() 
	{
		float area = ((22/7)*(radius)*(radius));
		System.out.println(area);
		
	}
	@Override
	public void draw() {
		System.out.println(radius);
	}
	
}
interface Drawable
{
	public void draw();
}
public class Company {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person("tejas",21);
		p1.displayDetails();
		Employee e1 = new Employee("bob",23,"101","it");
		e1.displayDetails();
		Employee.getCompanyDetails();
		Manager mgr = new Manager("bond",45,"invest","crime",5);
		mgr.displayDetails();
		mgr.manageTeam();
		//polymorphism
		Person p2 = mgr; // upcasting
		p2.displayDetails();
		Manager dc = (Manager) p2; //downcasting
		dc.manageTeam();
		Circle cir = new Circle(5);
		cir.describeShape();
		cir.calculateArea();
		cir.draw();

	}

}
