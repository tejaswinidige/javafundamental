	package ArrayProblems;

import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int min;
		System.out.println("Enter array element");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		min=a[0];
		for(int i=1;i<5;i++) {
			if(a[i]>min) {
				min=a[i];
			}
		}
		
		
		

	}

}
