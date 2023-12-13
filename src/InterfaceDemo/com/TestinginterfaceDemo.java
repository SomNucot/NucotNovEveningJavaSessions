package InterfaceDemo.com;

public class TestinginterfaceDemo {

	public static void main(String[] args) {
		
		
		//IndianMedical obj=new IndianMedical();
		//USMedical obj1=new USMedical();
		
		
		ManipalHospital obj11=new ManipalHospital();
		obj11.generalServices();
		obj11.physioServices();
		obj11.dentalServices();
		
		obj11.neuroServices();
		obj11.emergencyServices();
		
		
		obj11.pediaServices();
		obj11.cardioServices();
		
		
		
		
		//Top casting :child class object can be referred by  parent ref variable
		
		
		
		
		IndianMedical obj111=new ManipalHospital();
		
		obj111.generalServices();
		obj111.physioServices();
		obj111.dentalServices();
		
		//obj111.neuroServices();
		//obj111.emergencyServices();
		
		
		//obj111.pediaServices();
		//obj111.cardioServices();
		
		//obj111.medicalClaimOption();
		
		
		
		
		
		
		USMedical obj112=new ManipalHospital();
		//obj112.generalServices();
		//obj11.physioServices();
		obj11.dentalServices();
		
		obj11.neuroServices();
		obj11.emergencyServices();
		
		
		obj11.pediaServices();
		obj11.cardioServices();
		
		
		
		

	}

}
