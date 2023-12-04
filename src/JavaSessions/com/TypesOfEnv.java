package JavaSessions.com;

public class TypesOfEnv {

	public static void main(String[] args) {
	
		String env="qa";
		
		switch(env)
		{
		
			case "dev":
				System.out.println("Launch  browser in dev env");
			break;
			
			case "qa":
				System.out.println("Launch browser in test env");
			break;
			
			case "stage":
				System.out.println("Launch browser in stage env");
			break;
				
			case "prod":
				System.out.println("Launch browser in prod env");
			break;
				
			default:
				System.out.println("Please pass vaild env name");
				break;
			
			
		}
		
		System.out.println("Thanks");
		
		
		
		
		
	}

}
