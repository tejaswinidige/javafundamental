package ExceptionHandling;

public class Query {
	 public static int m1(){
    	 try{
    		int result = 12/0; 
    	 }catch(Exception e){
    		return 2; 
    	 }finally{
    		return 3;
    	 }
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = m1();
        System.out.println(result);

	}

}
