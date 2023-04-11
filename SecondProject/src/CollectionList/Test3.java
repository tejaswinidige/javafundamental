package CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int id;
	String name;
	
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		return this.id+" "+this.name;
	}
}

class StudentById implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return student1.id - student2.id;
	}
	
}



public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(102,"Vijay");
		Student s2 = new Student(101,"Rakesh");
		Student s3 = new Student(103,"Vikram");
		
		List<Student> list = new ArrayList<>();
		list.add(s3);
		list.add(s2);
		list.add(s1);
		System.out.println(list);
		System.out.println("After Sorting by Id");
		Collections.sort(list,new StudentById());
		System.out.println(list);

	}

}
