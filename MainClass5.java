package interface2;
//
//Single level inheritance
interface Sample11{
	void test1();
}
interface Sample22 extends Sample11{
	void test2();
}
class Demo11 implements Sample22{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1 done");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2 done");
	}
	
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo11 d1 = new Demo11();
		d1.test1();
		d1.test2();

	}

}
