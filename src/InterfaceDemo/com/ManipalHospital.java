package InterfaceDemo.com;

public class ManipalHospital implements IndianMedical,USMedical,UKMedical{
	
	
	//IndianMedical
	@Override
	public void generalServices() 
	{
		System.out.println("generalServices");
	}

	//IndianMedical
	@Override
	public void dentalServices() {
		
		System.out.println("dentalServices");
	}

	//IndianMedical
	@Override
	public void physioServices() {
		
		System.out.println("physioServices");
	}

	
	//USMedical
	@Override
	public void neuroServices() {
		
		System.out.println("neuroServices");
		
	}

	//USMedical
	@Override
	public void emergencyServices() {
		
		System.out.println("emergencyServices");
		
		
	}

	//UKMedical
	@Override
	public void cardioServices() {
		
		System.out.println("cardioServices");
		
	}

	//UKMedical
	@Override
	public void pediaServices() {
		
		System.out.println("pediaServices");
		
	}
	
	
	
	public void medicalClaimOption()
	{
		System.out.println("medicalClaimOption");

	}
	
	
	
	
	
	
	

}
