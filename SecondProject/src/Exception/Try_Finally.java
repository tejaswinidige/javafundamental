package Exception;

public class Try_Finally {
	public static void m1(){
		try{
			//System.out.println("Inside try-block");
			System.out.println(12/0);
		}finally{
			System.out.println("Inside finally block");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Try_Finally.m1();

	}

}
