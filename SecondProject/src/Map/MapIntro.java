package Map;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<type of key,type of value>
		Map<Integer,String> map= new HashMap<>();
		
		map.put(101,"Aarya");
		map.put(102,"Sakshi");
		map.put(103,"Teju");
		
		System.out.println(map);
		
		//Traversing map:
		for(Map .Entry<Integer,String>  data:map.entrySet()){
			System.out.println(data.getKey()+" "+data.getValue());
		}
		
		//Accessing the value based on key
		System.out.println(map.get(102));
		
	}

}
