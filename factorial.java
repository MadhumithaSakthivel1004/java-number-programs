package com;

import java.util.Scanner;

public class factorial {
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("enter num: ");
		int num= sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of num : "+fact);
	}

}
