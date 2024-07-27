package automationw1.d1;

public class Primeno {
	public static void main(String[] args) {
		int count=0,m=12;
		int i,j=m/2; 
		
		if(m==0||m==1)
		{
			System.out.println(m+"is not a prime no" );
			
		}
		else 
		{
			for(i=2;i<=j;i++)
			{
				if(m%i==0)
				{
					System.out.println(m+" is not prime number");  
				count=1;
				break;
								
				}
			}
		if(count==0)
		{
			System.out.println(m+" is prime number");
		}
		
		}
		
		
	}
	}

