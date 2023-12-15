package EncapsulationDemo.com;

public class Student {

	
	private String name;
	private int usn;
	private String address;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public int getUsn() {
		return usn;
	}

	public void setUsn(int usn) {
		this.usn = usn;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public static void main(String[] args) {
		Student obj=new Student();

	}

}
