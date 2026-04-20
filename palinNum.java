package com;

import java.util.Scanner;

public class palinNum {
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("enter num: ");
		int num= sc.nextInt();
		
		int temp=num;
		int rev=0;
		int lastdig=0;
		
		while(num>0)
		{
			lastdig=num%10;
			rev=rev*10+lastdig;
			num=num/10;
			
		}
		
		if(rev==temp)
			System.out.println(temp+" num is palindrome");
		else
			System.out.println(temp+" num is not palindrome");
	}

}
