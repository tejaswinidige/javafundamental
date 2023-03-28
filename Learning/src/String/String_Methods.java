package String;

public class String_Methods {

	public static void main(String[] args) {
		//charAt():
		String str = "java";
		char ch = str.charAt(0);
		char ch2 = (char) ((char) ch+32);
		System.out.println(ch2);
		System.out.println(ch);
		
		//compareTo:based on unicode value of each char
		String str2 ="java";
		char ch3 = 'j';//74-106=-106+74=-32
		int data = ch3;
		System.out.println(str.compareTo(str2));
		
		String str3 = "java";
		String str4 = "jbva";
		System.out.println(str3.compareTo(str4));
		
		//concat():
		String name1 = "Teju";
		String name2 = "Santosh";
		System.out.println(name1+name2);
		System.out.println(name1.concat(name2));
		
		//contains():
		String text = "We are learninig java";
		System.out.println(text.contains("java"));
		
		//endsWith():
		System.out.println(text.endsWith("java"));
		
		//equals (=):check content of string
		//==:checks memory location
		
		String data1 = "hello";
		String data2 = "hello";
		System.out.println(data1.equals(data2));
		System.out.println(data1==(data2));
		
		String data3 = new String("Hello");
		String data4 = new String("Hello");
		System.out.println(data3.equals(data4));
		System.out.println(data3==(data4));

		System.out.println("Hello" .equals("hello"));
		System.out.println("Hello" .equalsIgnoreCase("hello"));
		
		// split
		String data8 = "We are learninig java";
		String[] arr2 = data8.split(" ");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		//reverse string
		String str8 = "My name is Teju";
		String[] arr3 = str8.split(" ");
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
	}

}
