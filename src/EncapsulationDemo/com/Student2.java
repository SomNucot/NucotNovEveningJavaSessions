package EncapsulationDemo.com;

public class Student2 {

	public static void main(String[] args) {
		Student obj=new Student();
		//String s=obj.name="abc";
		//System.out.println(s);
	
		obj.setAddress("Bangalore");
		obj.setName("Modi");
		obj.setUsn(123);
		
		String s=obj.getAddress();
		System.out.println(s);
		String ss=obj.getName();
		System.out.println(ss);
		int sss=obj.getUsn();
		System.out.println(sss);

	}

}
