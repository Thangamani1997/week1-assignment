package automationw1.d1;

import java.util.Arrays;

public class Intersection {
	
	public static void main(String[] args)
	{
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println("Intersection value is" +b[j]);
				}
			}
		}
	}
	

}
