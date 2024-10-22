package interface2;
// MULTIPLE INHERITANCE WITH INTERFACE
interface Sample1{
	void test1();
}
interface Sample2{
	void test2();
}
interface Sample3 extends Sample1,Sample2{
	void test3();
}
class Demo implements Sample3{

	@Override
	public void test1() {
		
		System.out.println(" test1 done");
	}

	@Override
	public void test2() {
		
		System.out.println("test2 done");
	}

	@Override
	public void test3() {
		
		System.out.println("test3 done");
		
	}
	
}
public class MainClass4 {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		d1.test1();
		d1.test2();
		d1.test3();
	}

}
