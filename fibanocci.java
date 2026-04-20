package com;

import java.util.Scanner;

public class fibanocci {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter series: ");
		int series=sc.nextInt();
		
		int n1=0, n2=1;
		System.out.println(n1+"\n"+n2+"");
		
		for(int i=1;i<=series-2;i++)
		{
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
		
	}

}
