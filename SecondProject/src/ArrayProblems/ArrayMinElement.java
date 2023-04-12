package ArrayProblems;

import java.util.Scanner;

public class ArrayMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];int max;
		System.out.println("Enter Array elements");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			 a[i]=sc.nextInt();
		}
		max=a[0];
		for(int i=1;i<5;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
       System.out.println("Maximum element " +max);
	}

}
