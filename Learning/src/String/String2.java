package String;
//JAVA = java //convert uppercase to lower case without using
//lower case

public class String2 {
	public static void LowerCase(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int data = ch +32;
			str1 = str1+(char)data;
		}
	}

	public static void main(String[] args) {
		String text = "JAVA";
		LowerCase(text);
		
		

	}

}
