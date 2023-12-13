package abstractdemo.com;

public abstract class ApplicationPage {
	

	//cannot create object for  abstract class
	//unimplemented methods
	abstract public void titlePage();
	
	abstract public void currentUrlOfPage();
	
	abstract public void companyLogo();
	
	//implemented methods
	
	void CompanyName()
	{
		System.out.println("Nucot");
	}
	
	void VPOfCompany()
	{
		System.out.println("ABC");
	}
	
	
	
	
	
	

}
