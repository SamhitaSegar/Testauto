package prep1;

import java.util.Arrays;
import java.util.Collections;

public class rearrangeposneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {-1, 2, -3, 4, 5, 6, -7, 8, 9};
 /*Arrays.sort(a);
 int i=0,j=0,temp=0;
 while(i<a.length && j<a.length)
 {
	 if(a[j]<0)
		 j++;
	 else 
	 {
		 temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
		 i=i+2;
		 j++;
	 }
 }
 for(int k=0;k<a.length;k++)
	 System.out.println(a[k]);
	}*/
	//another way
	int k=0,l=0,temp=0;
	while(k<a.length && l<a.length)
	{
		if(a[l]>0)
			l++;
		else
		{
			temp=a[l];
		a[l]=a[k];
		a[k]=temp;
		l++;k++;
		
		}
		
	}
	for(int s=0;s<a.length;s++)
		 System.out.println(a[s]);
		}

}

