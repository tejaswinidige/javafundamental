package Operators;

public class operatorIntro {

	public static void main(String[] args) {
		//Arithmatic
		//Relational
		//logical
		//Bitwise
		//Shift
		//Unary
		//Assignment
		//ternary

		//Arithmaric Operator:
		
		int a=20;
		int b = 20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);//remainder
		System.out.println(a/b);//quotient
		
		//Unary Operator:increment /decrement
		//++ = +1
		
		int c =10;
		int d= c++;
		System.out.println(c+" "+d);
		
		int e =10;
		int f = ++e;
		System.out.println(e +" "+f);
		
		//Relational Operator:
		int x =20;
		int y =30;
		System.out.println(x>y);//false
		System.out.println(x<y);//true
		System.out.println(x==y);//false
		System.out.println(x!=y);//true
		System.out.println(x>=y);//false
		System.out.println(x<=y);//true
		
		//Logical Operator:&& || !
		//use to combine the conditions
		//truth table
		
		int m=10;
		int n=40;
		System.out.println((m>n)&&(m==n));
		System.out.println((m<n)||(m==n));//false || false
		System.out.println(!(m<n));
		
		System.out.println(!(!(m<n) && (m>n)));
		
		//Bitwise Operator:& |
		//it works with the bits
		
		int s =10;//binary 1010
		int t =20;//binary 10100
     System.out.println(s & t);//AND
     System.out.println(s | t);//OR
     System.out.println(s ^ t);//X-OR
     
		
		//Shift operator:
     //left shift:every time value is multiplied by *2^bit = 30 * 2^2 =60
     int j =10;
     System.out.println(j<<1);
     
     //right shift:number /2^bit shift = 30 /2^1 =30/2=15
     System.out.println(j>>1);

     //Asignment operator =  //==comparision
     int j1=10;
     int sum=10;
     sum = sum +10;//sum +=10;//compound statement
     
     //-= *= /= %=
     
     //Ternary : use if else condition
     //condition ? stat1:stat2;
     int num1 =10;
     int num2 =20;
     if(num1>num2) {
    	 System.out.println(num1+" is greater");
     }else {
    	 System.out.println(num2 +" is greater");
     }
     int res = (num1 > num2)? num1:num2;
     
		
		
		
		
	}

}
