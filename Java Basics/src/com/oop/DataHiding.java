package com.oop;
/**
 * Data Hiding :
 * 
 * 		- Outside person can't access our internal data directly ; after authentication only he/she can access data
 * 
 * 		- After providing proper user name and password we can access our gmail inbox
 * 
 * 		- e.g. Bank Account
 * 
 * 		- To Achieve data hiding we declare all data members as private
 * 
 * 		- Advantages
 * 
 * 				- Security
 * 
 * 		- Note : It is highly recommended to declare data members as private
 * 				
 */
public class DataHiding {
	
	// Data Hiding
	private double balance;
	
	public double getBalance() {
		// do validation
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
