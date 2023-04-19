package GarbageCollection;

public class Test3 {
	String obj_name;
    Test3(String obj_name){
    	this.obj_name = obj_name;
    }

    protected void finalize(){
    	System.out.println(this.obj_name+" is fit for gc");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t1 = new Test3("ObjC");
		t1 = null;
		System.gc();

		

	}

}
