package interface1;
// Hierarchical INHERITANCE WITH INTERFACE

interface Sample12{
	void test1();
}
interface Sample22 extends Sample12{
	void test2();
}
interface Sample33 extends Sample12{
	void test3();
}
class Demo3 implements Sample22{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("hi hello");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2 done");
	}
	
}
class Demo4 implements Sample33{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1 done");
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("test3 done");
	}
	
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d1 = new Demo3();
		Demo4 d2 = new Demo4();
		d1.test1();
		d1.test2();
		d2.test1();
		d2.test3();

	}

}
