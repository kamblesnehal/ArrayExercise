package com.array;

public class MaximumMinimum 
{
	public static void main(String[] args) 
	{
		int a[]= {22,34,98,67,50,45};
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
      System.out.print("\t" +a[i]); 
		}
		System.out.print("\n\t Minimum value is:" +a[0]);	
		System.out.print("\n\t Maximum value is:" +a[5]);	

	}

}
