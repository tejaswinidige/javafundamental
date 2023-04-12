package ArrayProblems;
import java.util.Scanner;

public class ArrayAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];int temp;
		System.out.println("Enter Array elements");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++){
			 for(int j=i+1;j<5;j++) {
				 if(a[i]>a[j]) {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
					 
				 }
			 }
		}
			
		System.out.println("Sorted array ascending order");	
		
		for(int i=0;i<5;i++) {
			
			System.out.println(a[i]+" ");
			
		}
		
		

	}

}
