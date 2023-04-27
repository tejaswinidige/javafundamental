package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
public static List<Integer> getEvenList(List<Integer> list){
    	
	    // Collection ->stream() ->intermediate ->terminal
	    List<Integer> evenList =list.stream()
	    		               .filter(x->x%2==0)
	    		               .collect(Collectors.toList());
	    return evenList;
	      
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {21,22,23,24,25,26};
		List<Integer> list = new ArrayList<>();
		for(int item:arr){
			list.add(item);
		}
		
		System.out.println("Before process");
		System.out.println(list);
        
		System.out.println("After process");
		for(Integer obj:getEvenList(list)){
			System.out.print(obj+" ");
		}

	}

}
