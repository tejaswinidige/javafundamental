package ExceptionHandling;
import java.io.IOException;


class Custom extends Throwable{

}

public class ThrowsExample {
	public static void m1() throws Custom {
    	if(true){
    		throw new Custom();
    	}
    }

	public static void main(String[] args) throws Custom {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		m1();

	}

}
