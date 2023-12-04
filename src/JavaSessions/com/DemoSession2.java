package JavaSessions.com;

public class DemoSession2 {

	public static void main(String[] args) {
	
		//2.Non-Primitive data type:String
		
	//	Any thing(group of characters) which is enclosed with in double quotes is called String
		
		String s="Welcome to Nucot";
		System.out.println(s);
		String ss="Bangalore";
		System.out.println(ss);
		
		int a=10;
		int b=20;
		int c=a+b;//+-->addition
		System.out.println(c);
		
		//String Concatenation
		String sss=s+ss;//+--->Concatenation
		System.out.println(sss);
		
		System.out.println(s+ss);
		System.out.println(a+b);
		System.out.println(a+b+s+ss);
		System.out.println(s+ss+a+b);
		System.out.println(s+ss+(a+b));
		System.out.println(a+b+s+ss+a+b);
		System.out.println(a+b+s+ss+(a+b));
		System.out.println(s+ss+a+b+s+ss+a+b);
		
		
		float f=1.0f;
		float ff=22.000f;
		
		System.out.println(f+ff+s+ss);
		System.out.println(f+ff+s+ss);
		System.out.println(s+ss+f+ff);
		System.out.println(s+ss+(f+ff));
		System.out.println(f+ff+s+ss+f+ff);
		System.out.println(f+ff+s+ss+(f+ff));
		System.out.println(s+ss+f+ff+s+ss+f+ff);
		
		
		
		char c1='a';
		char c2='b';
		char c3=' ';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1+c3);//97+32=129
		System.out.println(c1+c2);
		System.out.println(c1+c2+s+ss);
		System.out.println(c1+c2+s+ss);
		System.out.println(s+ss+c1+c2);
		System.out.println(s+ss+(c1+c2));
		System.out.println(f+ff+s+ss+c1+c2);
		System.out.println(f+ff+s+ss+(f+ff)+c1+c2);
		System.out.println(s+ss+f+ff+s+ss+f+ff+c1+c2);
		
		
		
		
		
		
		
	}

}
