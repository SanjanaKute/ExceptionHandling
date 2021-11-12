package com.java.exceptionAssignment;

import java.util.Scanner;

public class ArithmaticException2
{
	static void userinput(int a,int b) throws UnsupportedOperationException 
	{
		if(b==0)
		{
			throw new UnsupportedOperationException("Exception occured");
		}
		int c=a/b;
		System.out.println("Remainder is: "+c);
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		
		try{
			userinput(a,b);
		}
		catch(UnsupportedOperationException uo)
		{
			uo= new UnsupportedOperationException();
			System.out.println(uo);
			//System.out.println("Can't divide by 0");
		}

	}

}
