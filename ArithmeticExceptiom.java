package com.java.exceptionAssignment;

public class ArithmeticExceptiom 
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=0;
		
		try
		{
			int z=x/y;
		}
		catch(RuntimeException a)
		{
			System.out.println("Do not divide by 0");
		}
		
		//System.out.println("Program Continue");	
	}

}
