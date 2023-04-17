package Multithreading;

class Custom implements Runnable{
	@Override
	public void run() {
		System.out.println("Run excute");
	}
}


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Custom c1 = new Custom();
		Custom c2 = new Custom();
		Thread th = new Thread();
		Thread th1 = new Thread();
		th.start();
		th1.start();

	}

}
