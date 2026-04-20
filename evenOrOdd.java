package com;

import java.util.Scanner;

public class evenOrOdd {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter a num: ");
	int num=sc.nextInt();
			
	/*if(num % 2==0)
		System.out.println(num+ " is even");
	else
		System.out.println(num+" is odd");*/
	
	if(num/2 + num/2 == num)
		System.out.println(num+ " is even");
	else
		System.out.println(num+" is odd"); 
	
	/*if((num & 1)==0)
		System.out.println(num+ " is even");
	else
		System.out.println(num+" is odd");*/
	}
}
