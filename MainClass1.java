package oopsexample;
// JAVA PROGRAM THAT COVERS TOTAL OOPS CONCEPTS
import java.util.*;
interface Shape
{
	void findArea();

}
class Circle implements Shape
{
	private final double pi = 3.14;
	private int radius;
	public Circle(int radius)
	{
		this.radius = radius;
	}
	@Override
	public void findArea()
	{
		double area = pi*radius*radius;
		System.out.println("area of the circle is : "+area);	
	}
	
}
class Rectangle implements Shape
{
	private int length;
	private int  width;
	public Rectangle(int length,int width)
	{
		this.length = length;
		this.width = width;
	}
	public void findArea()
	{
		int area = length*width;
		System.out.println("area of the rectangle is "+area);
	}
}
class Square implements Shape
{
	private int side;
	public Square(int side)
	{
		this.side = side;
	}
	public void findArea()
	{
		int area = side*side;
		System.out.println("area of square is "+area);
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			Shape s1 = null;
			System.out.println("enter 1 for circle");
			System.out.println("enter 2 for rectangle");
			System.out.println("enter 3 for square");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1 : int radius = sc.nextInt();
					 s1 = (Shape)new Circle(radius); 
					break;
			case 2 : int l = sc.nextInt();
					 int w = sc.nextInt();
					 s1 = (Shape)new Rectangle(l,w);
					 break;
			case 3 : int s = sc.nextInt();
					 s1 = (Shape)new Square(s);
			}
			if(s1 !=null)
			{ 
				s1.findArea();
			}
			else
			{
				System.err.println("there is no shape");
			}
			System.out.println("press 1 to continue");
			System.out.println("press 0 to stop");
			}while(sc.nextInt() == 1);

	}

}
