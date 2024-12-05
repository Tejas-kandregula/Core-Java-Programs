package colliction;

import java.util.*;
class Emplyee
{
	private int id;
	private String name;
	private int age;
	private float sal;
	public Emplyee(int id, String name, int age, float sal)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	@Override
	public String toString() 
	{
		return "Emplyee [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public int getId() 
	{
		return id;
	}
	public float getSal() 
	{
		return sal;
	}
	
}
public class SetterAndGetter {

	public static void main(String[] args) {
		List<Emplyee> li = null;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter 1 for ArrayList");
			System.out.println("Enter 2 for Vector");
			System.out.println("Enter 3 for LinkedList");
			int choice = sc.nextInt();
			switch(choice) 
			{ case 1 : li = new ArrayList<Emplyee>();
						break;
			case 2 : li = new Vector<Emplyee>();
						break;
			case 3 : li = new LinkedList<Emplyee>();
						break;
			default : System.out.println("Enter the correct choice");
			
			}
			
			System.out.println("Enter the count of Employees");
			int c = sc.nextInt();
			for(int i=0;i<c;i++)
			{
			System.out.println("Enter emp id");
			int eid = sc.nextInt();
			System.out.println("Enter emp name");
			String ename = sc.next();
			System.out.println("Enter emp age");
			int eage = sc.nextInt();
			System.out.println("Enter emp sal");
			float esal = sc.nextFloat();
			li.add(new Emplyee(eid,ename,eage,esal));
			}
			for(int i=0;i<li.size();i++)
			{
				Emplyee empp = li.get(i);
				if(empp.getSal()>=10000 && empp.getSal()<=25999)
				{
					System.out.println(empp);
				}
			}
			for(int i=0;i<li.size();i++)
			{
				Emplyee empp = li.get(i);
				if(empp.getAge()>=25 && empp.getSal()==30000)
				{
					System.out.println(empp);
				}
			}
			System.out.println("Press Y to continue");
			System.out.println("Press N to Stop");
			
		} while (sc.next().charAt(0)=='Y');

	}

}
