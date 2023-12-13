package abstractdemo.com;

public class TestingAbstractDemo {

	public static void main(String[] args) {
		

		//ApplicationPage obj=new ApplicationPage();
		
		LoginPage obj1=new LoginPage();
		obj1.companyLogo();
		obj1.CompanyName();
		obj1.currentUrlOfPage();
		obj1.titlePage();
		obj1.VPOfCompany();
		obj1.show();
		
		
		//child class object can be referred by the parent abstract class ref variable
		
		
		ApplicationPage obj2=new LoginPage();
		obj2.companyLogo();
		obj2.CompanyName();
		obj2.currentUrlOfPage();
		obj2.titlePage();
		obj2.VPOfCompany();
		//obj2.show();
		
		
		
		
		
	}

}
