package String;

public class StringIntro {

	public static void main(String[] args) {
		//String are immutable
		String str = "JAVA";
		System.out.println(str);
		str.concat("language");//java lang
		System.out.println(str);
		//reassignment
		str = str.concat("language");
		System.out.println(str);
		

	}

}
