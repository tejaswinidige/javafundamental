package Multithreading;


class PrintTable extends Thread{
	public void run(int a) {
		System.out.println("Print Table");
	}
}

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable t1 = new PrintTable();
		PrintTable t2 = new PrintTable();
		
		t1.start();
		t2.start();

	}

}
