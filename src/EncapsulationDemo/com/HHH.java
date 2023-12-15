package EncapsulationDemo.com;

public class HHH {

	public static void main(String[] args) {
		EncapsulationConcept obj=new EncapsulationConcept();
		//int aaa=obj.atmpin=12345667788;
		//System.out.println(aaa);
		
		obj.setAtmpin(12334);
		int nnn=obj.getAtmpin();
		System.out.println(nnn);

	}

}
