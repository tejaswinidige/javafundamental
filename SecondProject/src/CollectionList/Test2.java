package CollectionList;
import java.util.ArrayList;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Name = new ArrayList<String>();
		Name.add("Aniket");
		Name.add("Ankush");
		Name.add("Santosh");
		Name.add("Rohit");
		
		System.out.println(Name);
		Name.add("Tushar");
		System.out.println(Name);
		Name.add(2,"Tejaswini");
		System.out.println(Name);
		Name.add(0,"Arun");
		System.out.println(Name);
		Name.remove(2);
		System.out.println(Name);
		Name.set(1,"Aasha");
		System.out.println(Name);
		System.out.println(Name.get(2));
		System.out.println(Name);
		Name.clear();
		System.out.println(Name);
		

	}

}
