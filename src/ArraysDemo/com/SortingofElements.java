package ArraysDemo.com;

public class SortingofElements {

	public static void main(String[] args) {
		
		int a[]= {8,10,3,1,5,6,2,6,2,9};
		
		int len=a.length;
		System.out.println(len);
		
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
	
			
			
		}
		
		System.out.println("Sorted elemnets are");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
		
		
		

	}

}
