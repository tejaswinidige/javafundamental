package Exception;

public class Try_Catch_Finally {
	 public static void m2(){
    	 try{
    		System.out.println("Inside try block"); 
    		System.out.println(12/0);
    	 }catch(Exception e){
    		 System.out.println("Inside catch block");
    	 }finally{
    		System.out.println("Inside finally block"); 
    	 }
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Try_Catch_Finally.m2();

	}

}
