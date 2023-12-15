package EncapsulationDemo.com;

public class EncapsulationConcept {

	
	//Encapsulation---Hide data
	
	//Encapsulation refers to the binding the data and methods inside a single class.
		private int atmpin=123456;
	
	

		public int getAtmpin() 
		{
				return atmpin;
		}


		public void setAtmpin(int atmpin)
		{
			this.atmpin = atmpin;
		}







	public static void main(String[] args) {
		
		EncapsulationConcept obj =new EncapsulationConcept();
		int aa=obj.atmpin;
		System.out.println(aa);

	}

}
