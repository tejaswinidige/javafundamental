package CollectionList;
import java.util.Vector;

public class VectorIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<>();
		vector.add("Hello");
		vector.add("hi");
		System.out.println(vector);
		vector.add("hi");
		System.out.println(vector);


		vector.add(2, "bye");
		System.out.println(vector);

		System.out.println(vector.get(3));

	}

}
