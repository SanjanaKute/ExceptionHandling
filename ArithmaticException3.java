package com.java.exceptionAssignment;

import java.util.Scanner;

public class ArithmaticException3 
{
	private static  long id=1234l;
	private static  double balance=2000;
	private double withdraw;
	private double deposite;

	
	static void userinput1(double withdraw) throws InsufficientBalanceException 
	{
		if(withdraw>2000)
		{
			//double remainingBal=balance-withdraw;
			//System.out.println("Remaining balance in your acount is: "+remainingBal);

			throw new InsufficientBalanceException();
		}
		double remainingBal=balance-withdraw;
		System.out.println("Remaining balance in your acount is: "+remainingBal);

	}
	


	static void userinput2(double withdraw) throws IllegalBankTransactionException 
	{
		if(withdraw<0)
		{
			System.out.println("Cant remove negative value");

			throw new IllegalBankTransactionException();
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("CustomerID is: "+id);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		double withdraw=sc.nextInt();

		try{
			
		userinput1 (withdraw);
		}
		catch(InsufficientBalanceException ib)
		{
			System.out.println("insufisient balance");
		}
		
		try{
			userinput2(withdraw);
		}
		catch(IllegalBankTransactionException it)
		{
			try 
				{
					throw new IllegalBankTransactionException();
				} 
				catch (IllegalBankTransactionException e) {
		
			}
		}
	}

}
class InsufficientBalanceException extends Exception
{
	
}
class IllegalBankTransactionException extends Exception
{
	
}