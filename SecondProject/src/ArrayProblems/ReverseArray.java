package ArrayProblems;

public class ReverseArray {
	public static void Reverse(int a[]) {
		System.out.println("Array element");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("Reverse array element");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			
		}
	}
	

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5};
		Reverse(a);
		
		

}
}
 