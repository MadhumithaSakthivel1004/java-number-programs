package com;
import java.util.*;

public class swapNum {
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("enter a: ");
		int a= sc.nextInt();
		System.out.println("enter b: ");
		int b=sc.nextInt();	
		
		/*int temp=a;
		a=b;
		b=temp;
		
		a=a+b;
		b=a-b;
		a=a-b;*/
		
		 a = a ^ b;  // Step 1: a becomes (a ^ b)
	     b = a ^ b;  // Step 2: b becomes (a ^ b) ^ b = a
	     a = a ^ b;  // Step 3: a becomes (a ^ b) ^ a = b
		
		System.out.println("a after swap: "+a);
		System.out.println("b after swap: "+b);
		
		
		
	}

}
