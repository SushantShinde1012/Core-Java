package com.core;

/*Flow Control
 *  - Describes the order , in which statements will be executed at run time
 *  - There are three types
 * 
 * 		1. Selection Statements
 * 
 * 			- Several options are there among that one is executed.
 * 				a. if - else
 * 					
 * 					- syntax
 * 
 * 						if(boolean condition b){
 * 							Action if b is true
 * 						}
 * 						else{
 * 							Action if b is false
 * 						}
 * 
 * 					- argument to if statement must be boolean type, if we are trying to provide any other type then we will get compile time error.
 * 					- else is optional
 * 					- curly braces also optional ; but we can write only one statement (No declarative statement is allowed)
 * 					- note : semicolon is valid java statement which is also known as empty statement
 * 				
 * 				b. switch()
 * 
 * 		2. Iterative Statements
 * 			- Group of statement is executed iteratively
 * 				a. while loop
 * 				b. do-- while()
 * 				c. for loop
 * 				d. for each loop
 * 		
 * 		3. Control Transfer statement
 * 			- To transfer the control to one place to another
 *  			a. break
 *  			b. continue
 *  			c. return
 *  			d. try catch finally
 *  			e. assert
 * 
 * 
 * */
public class FlowControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if possibilities
		
	/*
		int x= 0;
		if(x) {
			System.out.println("Hello");
		}else {
			System.out.println("tets");
		}
		 - It gives compile time error as if only takes boolean
		 error : Type mismatch: cannot convert from int to boolean
	*/
		int x=10;
		if(x==20) {
			System.out.println("Hello");
		}else {
			System.out.println("Hi");
		}
		
		
		boolean b=true;
		if(b=false) {
			System.out.println("Hello ");
		}else {
			System.out.println("Hi");
		}
		
		if(true);// valid - it is called empty 
	
	/* Invalid
		 * 	becoz without curly braces only one statement is allowed but that's must not declarative statement
		 
		if(true)
			int x=10;
	*/
	}

}
