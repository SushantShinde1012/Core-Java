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
 * 					- several options are there never go for if else , bcoz it reduces readability; go for switch() so readability of code will increase
 * 					- Syntax
 * 							
 * 							switch(x)
 * 							{
 * 								case 1:
 * 										Action 1;
 * 										break;
 * 								case 2:
 * 										Action 2;
 * 										break;
 * 								...
 * 
 * 								default :
 * 											default action;
 * 
 * 
 * 
 * 
 * 							}
 * 
 * 					- Argument to switch
 * 							int, byte, short, char, string, ENUM
 * 					
 * 					- if we take boolean then there are only two cases , then better to go for if else in case of boolean
 * 					
 * 					- long is large range , that much cases we are not required , int range is sufficient
 * 
 * 					- for switch curly braces are mandatory
 * 
 * 					- case & default are optional, without case & default empty switch statement is valid java statement
 * 					
 * 					- if you write a statement without case or default inside switch it will give error
 * 						
 * 							switch(y){
 * 									System.out.println("Hello"); //Not allowed
 * 							}
 * 						
 * 					- Every case value must be constant expression, in below example y gives error becoz it is variable. but if we declare y as final it will work fine
 * 
 * 						int x=10;
 * 						int y=20;
 * 						switch(x){
 * 							
 * 							case 10:
 * 									System.out.println(x);
 * 									break;
 * 							case y:
 * 									System.out.println(20);
 * 									break;
 * 					
 * 						}
 * 
 * 					- Switch() argument and case label (constant expression) both can be expression
 * 
 *					- Every case label should be in the range of  switch argument type; otherwise we will gwt compile time error
 * 
 * 					- Duplicate Case labels are not allowed ; otherwise we will get compile time error
 * 	
 * 							int x=10;
 * 							switch(x){
 * 								case 97:
 * 										sysout(97);
 * 										break;
 * 								case 98:
 * 										syout(98);
 * 										break;
 * 								case 'a':
 * 										sysout('a');
 * 										break;
 *								}
 *					- Here ascii value of a becomes 97 so duplicate cases. It gives error	
 *					- if case matches, all below condition will execute after that until break occurs or end of switch. It is called Fall through
 * 					- it is advantage for multiple cases we can write only one action. (i.e code reusability)
 * 					- default case : 
 * 									1. recommended to use at most once
 * 									2. deafult case can be written in anywhere (Recommended to write last case)
 * 
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
		//-------------------------------------------------------------------------------------------------
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
		
		
		
		
		//------------------------------------------------------------------------------------------------------------------------------------
		//Switch()
		
		int y= 10;
		switch(y) {
		
		}
		
		
		// ANother case
		
		int z=10;
		switch(z+1) {
		case 10:
			System.out.println(" Value :"+10);
			break;
		case 10+20+30:
			System.out.println("Works fine");
			break;
		
		}
		
		// byte with switch 
		
		byte b1=10;
		switch(b1) {
		case 10:
			System.out.println(10);
			break;
		case 100:
			System.out.println(100);
			break;
		// byte rrange is 127 so below case is having error	
		
		/*case 1000:
			System.out.println(1000);
			break;
			*/
		}
		
		
		// if we add 1 to byte it bcomes int so valid case
		
		byte b2=10;
		switch(b2+1) {
		case 10:
			System.out.println(10);
			break;
		case 100:
			System.out.println(100);
			break;
		// byte rrange is 127 so below case is having error	
		
		case 1000:
			System.out.println(1000);
			break;
			
		}
		
	}

}
