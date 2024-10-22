package interface1;

interface Sample1{
	void test1();
}
interface Sample2 extends Sample1{
	void test2();
}
interface Sample3 extends Sample2{
	void test3();
}
class Demo1 implements Sample3{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Test1 done");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("Test2 done");
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("Test3 done");
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1 = new Demo1();
		d1.test1();
		d1.test2();
		d1.test3();

	}

}
