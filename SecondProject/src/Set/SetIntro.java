package Set;

import java.util.HashSet;
import java.util.Set;

public class SetIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		set.add(11);
		set.add(12);
		set.add(11);
		System.out.println(set);
		
		Set<String> set2 = new HashSet<>();
		set2.add("Ajay");
		set2.add("Atul");
		set2.add("Aakash");
		set2.add("null");
		set2.add("null");
		System.out.println(set2);
		System.out.println(set.size());
		System.out.println(set2.contains("Atul"));
		
		String[] newArray = new String[set2.size()];
		set2.toArray(newArray);
		for(int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}
		

	}

}
