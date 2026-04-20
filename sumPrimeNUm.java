package com;

import java.util.Scanner;

public class sumPrimeNUm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter start: ");
		int start=sc.nextInt();
		System.out.println(" enter end: ");
		int end=sc.nextInt();
		
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i))
				sum=sum+i;
			
		}
		System.out.println("sum is "+sum);
	}
		
		public static boolean isPrime(int n)
		{
			
			if(n<=1)
				return false;
			else
			{
				for(int i=2;i<=n/2;i++)
				{
					if(n%i==0)
					{
						return false;
						
					}
				}
			}
			return true;
		}

}
