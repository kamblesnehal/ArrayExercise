package com.array;

import java.util.Scanner;

public class AdditionOfArray 
{
	public void addition() 
	{
		Scanner Sc=new Scanner(System.in);
		int i;
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,3};
		int c[]=new int [4];
		for(i=0;i<=3;i++)
		{
			c[i]=a[i]+b[i];
			
		}
		for(i=0;i<=3;i++)
		{
			System.out.println(+c[i]);
		}
			
	}
	public static void main(String[] args) 
	{
		AdditionOfArray a =new AdditionOfArray();
		a.addition();
		
		
	}

}
