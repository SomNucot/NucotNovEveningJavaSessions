package constructordemo.com;



public class ConstructorDemo3 {

		//class variables or gobal variables
		static String com="NUCOT";
		String name;
		int age;
		double salary;
		
		
		
		//hidden const/default const
		public ConstructorDemo3()//0param
		{
			System.out.println("this is default constructor");
			
		}
		
		
		//constructors are used for init the class variables
		//this keyword--->it refer to current class variable
		public ConstructorDemo3(String name,int age,double salary)//3 param
		{
			//this.name-->class variable  --->name---local variable
			this.name=name;
			this.age=age;
			this.salary=salary;
			System.out.println(this.name+" "+this.age+" "+this.salary);

			
		}
		
		//Can we overload the constructors?--> yes
		
		public ConstructorDemo3(String name,int age,double salary,String companyname)//.4 para
		{
			//this.name-->class variable  --->name---local variable
			this.name=name;
			this.age=age;
			this.salary=salary;
			//local varible
			String a=companyname;
			System.out.println();
			System.out.println(this.name+" "+this.age+" "+this.salary+" "+a);

			
		}
		
		
		static void show()
		{
			System.out.println("this is static maethod");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("this is main method");

			ConstructorDemo3 obj1=new ConstructorDemo3();
			ConstructorDemo3 obj2=new ConstructorDemo3("Nucot",10,2000.00);
			ConstructorDemo3 obj3=new ConstructorDemo3("Nucot",10,2000.00,"HP");
			////1.one way of accessing static variable
			System.out.println(com);
			////2.second way of accessing static variable
			System.out.println(ConstructorDemo3.com);
			
			//1.one way of accessing static method
			show();
			//2.second way of accessing static method
			ConstructorDemo3.show();
		}		
			

}
