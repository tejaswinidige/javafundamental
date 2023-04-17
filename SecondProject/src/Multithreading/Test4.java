package Multithreading;


class NewThread extends Thread{
//	 public void start(int a){
//	    	System.out.println("Hello");
//	    }
	public void run(){
		System.out.println("Run method executed");
	}
//	public void run(int a){
//		System.out.println("Overloaded run method");
//	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread t1 = new NewThread();
		//t1.start(10);
		t1.start();
		

	}

}
