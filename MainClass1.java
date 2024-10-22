package interface1;

import java.nio.file.spi.FileSystemProvider;

// Interface implementation
interface Sample{
	public void test();
}
class Demo implements Sample{

	@Override
	public void test() {
		System.out.println("test1 done");
		
	}
	
}

public class MainClass1 {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.test();

	}

}
