package Multithreading;


class Demo extends Thread{
	public void run() {//Running
		System.out.println("Hello thread");
		try {
			Thread.sleep(1000);//Wait
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After sleep");
	}
}

public class LifeCycleIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();//Runnable
		d.start();

	}

}
