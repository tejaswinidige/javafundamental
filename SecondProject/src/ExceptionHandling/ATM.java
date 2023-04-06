package ExceptionHandling;
import java.util.Scanner;

class PinVerificationFailed extends Exception{
	static int count=1;
    public static void PinVerifier(String pass){
   	 if(pass.equals("1234")){
   		 System.out.println("Proceding...");
   	 }else{
   		if(count==3){
   			try {
					throw new PinVerificationFailed();
				} catch (PinVerificationFailed e) {
					// TODO Auto-generated catch block
					System.out.println("Card locked for 24 hrs.Contact your bank..");
				}
   		}else{
   			Scanner sc = new Scanner(System.in);
   			System.out.println("Enter the pin..");
   		    String pin = sc.next();
   		    count++;
   		    PinVerifier(pin);

   		}

   	 }
    }

}

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin..");
	    String pin = sc.next();
//	    ATM.PinVerifier(pin);
		
	}

}
