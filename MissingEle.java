package automationw1.d1;

import java.util.Arrays;

public class MissingEle {
public static void main(String[] args)
{
	int ele[]= {1,4,3,2,8,6,7};
Arrays.sort(ele);
	int leg=ele.length;
	System.out.println("Array legnth is "+leg);
	int i;
			int max=ele[leg-1];
		System.out.println("largest no in array is " +max);
		for (i=0;i<leg;i++)
		{
			if(ele[i]+1!=ele[i+1])
			{
			System.out.println("missing no is "+(ele[i]+1));
			break;
			}
		}

}
}
