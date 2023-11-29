package ClassesandObjectDemo.com;

public class Student {

	
	
	
	public  int getStudentMarks(String studentName)
	{
		
		System.out.println("Getting the marks of the student---->"+ studentName);
		
		int marks=0;
		
		if(studentName.equals("Modi"))
		{
			
			marks=100;	
			
		}
		else if(studentName.equals("Annapurana"))
		{
			marks=90;	
		}
		
		else if(studentName.equals("Adharsh"))
		{
			marks=80;	
		}
		
		else if(studentName.equals("Keerthana"))
		{
			marks=75;	
			
		}
		else
		{
			System.out.println("Please enter valid student name...." + studentName);
		}
		
		
		return marks;
		
	}
	
	
	
	
	public  int getStudentMarksValue(int usn)
	{
		
		System.out.println("Getting the marks of the student---->"+ usn);
		
		int marks=0;
		
		if(usn==123)
		{
			
			marks=100;	
			
		}
		else if(usn==10)
		{
			marks=90;	
		}
		
		else if(usn==25)
		{
			marks=80;	
		}
		
		else if(usn==99)
		{
			marks=75;	
			
		}
		else
		{
			System.out.println("Please enter valid student name...." + usn);
		}
		
		
		return marks;
		
	}
	

	
	public static void main(String[] args) {
		
		Student obj=new Student();
		int result=obj.getStudentMarks("Annapurana");
		System.out.println(result);
		
		
		
		int result2=obj.getStudentMarksValue(123);
		System.out.println(result2);
		

	}

}
