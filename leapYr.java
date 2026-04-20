package com;

import java.util.Scanner;

public class leapYr {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter a year: ");
		int yr=sc.nextInt();
		
		if((yr % 400==0) || (yr % 4==0 && yr % 100!=0))
			System.out.println(yr+ " is leap year");
		else
			System.out.println(yr+" is not a leap year");
		
	}

}
