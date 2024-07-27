package automationw1.d1;

public class Fibno {
	public static void main(String[] args) {
		int range=20;
		int i=0,j=1,k;
		System.out.println(i);
	    System.out.println(j);
		for (k=2; k<=range;k++)
		{
			k=i+j;
			System.out.println(k);
			
			i=j;
			j=k;
			
			
		}
			
	}

}
