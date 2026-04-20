package com;

import java.util.Scanner;

public class countNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num: ");
		int num=sc.nextInt();
		
		int count=0;
		
		while(num!=0)
		{
			
			num=num/10;
			count++;
		}
		System.out.println("count of the num is: "+count);
	}

}
