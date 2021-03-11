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
 * 
 * 				a. while loop
 * 
 * 					- If we don't know number of iterations in advance then go for while loop
 * 					
 * 					- while iterating over result set we always go for while loop
 * 					
 * 					- Syntax
 * 							while(b){
 * 										Action;
 * 							}
 * 					- The argument to while should be boolean type, if any other type then we will get compile time error.
 * 
 * 					- while(1){
 * 							sysout("Hello");
 * 						}
 * 
 * 					- Gives error as incompatible type found int required boolean
 * 
 * 					- curly braces are optional , without curly braces we can write only one statement(except declarative statement)
 * 
 * 					- while(true); // It is valid statement
 * 
 * 					- Note : 
 * 
 * 
 * 				b. do-- while()
 * 
 * 					- difference between while and do--while
 * 		
 * 					- In Case of while loop body may be a chance to execute zero times
 * 
 * 					- If we want to execute loop body at least one time then go for do--while
 * 
 * 					- syntax
 * 				
 * 							do{
 * 								action; // executed at once
 * 
 * 							} while(condition);
 * 
 * 					- semicolon is mandatory
 * 
 * 					- curly braces are optional, without curly braces only one statement is allowed (except declarative statement)
 * 
 * 				c. for loop
 * 
 * 					- If you know number of iteration in advance go for for loop
 * 					
 * 					- Most commonly used loop
 * 
 * 					- first initialization is executed
 * 
 * 					- syntax
 * 
 * 							for(initialization;condition;incr/decr){
 * 									loop body;
 * 							}
 * 
 * 					- then condition section
 * 					- after that loop body
 * 					- then increment / decrement
 * 
 * 					- curly braces are optional; we can add only one statement without curly braces (except declarative statement)
 * 
 * 					- valid condition
 * 						
 * 						1. for(int i=0;true;i++)
 * 								sysout("Hello");
 * 
 * 						2. for(int i=0;i<10;i++);
 * 
 * 					- Invalid
 * 				
 * 						1. for(int i=0;i<10;i++)
 * 								int p=10;
 * 
 * 					-> Initialization section
 * 
 * 						- executed only once in lifecycle of for
 * 	
 * 						- we can declare multiple variables at initialization sectio
 * 
 * 						- e.g for(int i=0,j=0;i<10;i++);
 * 
 * 						- in initialization section we can declare any number of variables but of same type 
 * 		
 * 						- e.g.(int i=0 , String s="sush";i<10;i++); // it will give error
 * 
 * 						- In initializaton section we can take any valid java statement
 * 
 * 						- for (sysout("Hello");i<10;i++){
 * 
 * 										sysout("Hi");
 * 							}
 * 
 * 					-> Condition Section
 * 
 * 						- You can take any valid java expression but it should be boolean type
 * 
 * 						- this part is optional; if we do not put any condition compiler by default consider it as true and loop goes on infinite
 * 
 * 						- e.g. for(int i=o;;i++){
 * 								System.out.println("hello");
 * 							}
 * 
 * 					-> Increment / Decrement section
 * 
 * 						- Any valid java statement can be here in section
 * 	
 * 						- 
 * 
 * 						- int i=0;
 * 
 * 							for(Sysout("Hello");i<3;Sysout("Hi")){
 * 								i++;
 * 							}
 * 
 * 					-> Each section we can take independent statement
 * 
 * 					-> all three sections are optional; it will be infinite loop
 * 
 * 						for(;;){
 * 							sysout("Hello"); 
 * 						}
 * 
 * 					-> for(;;); // This is  also valid , it will be infinite
 * 
 * 					-> Unreachability
 * 
 * 					1. Invalid becoz loops goes infinite; and statement after for remains unreachable
 * 						for(int i=0;true;i++){
 * 
 * 							sysout("Hello");
 * 						}
 * 						System.out.println("Hi");
 * 
 * 					2. Invalid bcoz loop body will be unreachable so compile time error
 * 						for(int i=0;false;i++){
 * 
 * 							sysout("Hello");
 * 						}
 * 						System.out.println("Hi");
 * 						
 * 					3. Invalid , Condition by default is true so statement after for becomes unreachable and loop goes infinite
 * 						for(int i=0;;i++){
 * 
 * 							sysout("Hello");
 * 						}
 * 						System.out.println("Hi");
 * 
 * 					4. Valid ; for normal variable value takes place at run time
 * 						int a=10, b=20;
 * 						for(int i=0;a<b;i++){
 * 
 * 							sysout("Hello");
 * 						}
 * 						System.out.println("Hi");
 * 
 * 					5.valid
 * 						int a=10, b=20;
 * 						for(int i=0;a>b;i++){
 * 
 * 							sysout("Hello");
 * 						}
 * 						System.out.println("Hi");
 * 
 * 					6. invlid; value assigned at compile time for final variables so condition becomes false and loop body becomes unreachable
 * 
 * 						final int a=10, b=20;
 * 						for(int i=0;a>b;i++){
 * 
 * 							sysout("Hello");
 * 						}
 * 						System.out.println("Hi");
 * 
 * 
 * 				d. for each loop
 * 
 * 					- Also known as enhanced for loop
 * 
 * 					- This loop is used to retrieve objects from Arrays and collection
 * 
 * 					- It is limited for arrays and collections ; we cannot use it for general purpose
 * 
 * 					- Examples
 * 
 * 					1. Print Elements of 1D array
 * 
 * 						int [] arr ={10,20,30};
 * 						
 * 						//With Normal formal
 * 						for(int i=0;i<arr.length;i++){
 * 
 * 							Sysout(arr[i]);
 * 
 * 						}
 * 
 * 						// for Each loop
 * 
 * 						for(int x:arr){
 * 							Sysout(x);
 * 						}
 * 		
 * 					2. Print elements of 2D Array
 * 
 * 						int [] [] arr1={{10,20,30},{40,50}}
 * 						
 * 						// for loop
 * 						for(int i=0;i<arr1.length;i++){
 * 							for(int j=0; j<arr1[i].length;j++){
 * 								sysout(arr1[i][j]);
 * 							}
 * 						}
 * 
 * 						// for each
 * 						for(int [] e:arr1){
 * 							for(int e1:e){
 * 
 * 							sysout(e1);
 * 							}
 * 						}
 * 			
 * 					3. print elements of 3D Array
 * 
 * 						for (int[][] x1 : arr3){
 * 
 * 							for(int [] x2 : x1){
 * 
 * 								for(int x3 : x2){
 * 
 * 									System.out.println(x3);
 * 								}
 * 			
 * 							}
 * 					
 * 						}
 * 
 * 					
 * 
 * 		3. Control Transfer statement
 * 			- To transfer the control to one place to another
 *  			a. break
 *  
 *  				- we use break inside switch, to stop fall through
 *  					
 *  					int x=0; 
 *  					switch(x)
 *  					{
 *  						case 0:
 *  								System.out.println("Hello");
 *  						case 1:
 *  								Sysout(1);
 *  								break
 *  						case 2:
 *  								Sysout(2);
 *  						default:
 *  								sysout("default");
 *  					} 
 *  
 *  				- In switch all the cases after the matching case will be executed until break occur or end of switch
 *  
 *  				- Inside loops we can use break
 *  				
 *  					for(int i=0;i<10;i++){
 *  
 *  						if(i==5)
 *  							break;
 *  
 *  						System.out.println(i);
 *  					}
 *  							
 *  
 *  				- Inside label block , very rare it is used
 *  					
 *  						class Test {
 *  
 *  								public static void main(String [] args){
 *  		
 *  									int x=10;
 *  									l:
 *  									{
 *  										Sysout("Begain");
 *  											if (x==10)
 *  												break l;
 *  										Sysout("End");
 *  									}
 *  									Sysout("Hello");
 *  								}
 *  							}
 *  					
 *  				- Above are the only places where we can use break; if we use at any other place we will get compile time error
 *  						
 *  					
 *  			b. continue
 *  
 *  				- To skip current iteration and continue for next iteration
 *  
 *  				- we can use continue only inside loops
 *  
 *  				- e.g.
 *  					for(int i=0; i<10;i++){
 *  						if(i%2==0
 *  							continue;
 *  						Syout(i);
 *  					}
 *  
 *  				- if we are using anywhere else we will get compile time error saying , continue outside of loop
 *  
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
		
		//------------------------------------------------------------------------------------------------------------------
		
		// While
		
		
		
	/*	Case 1 : Invalid
	 * 			bcoz condition is true , loop  keeps on executing so ouside statement is unreachable, so it is invalid
	 * 
	 * 
		while(true) {
			System.out.println("hello");
		}
		System.out.println("Hi");
		
	*/
	
	/*Case 2:
	 * 		condition is false so code inside loop is      unreachable so error
	 * 
		while(false) {
			System.out.println("hello");
		}
		System.out.println("Hi");
		
	*/
		
		/* 
		 * m and n are normal variables(for normal variable value is considered at runtime only) , so there values are going to change , so it executes fine. if we add final to variables it also gives error. because every final variable is replaced by its value at compile time only
		 * */
		int m=10, n=20;
		while(m<n) {
			System.out.println("Hello");//goes infinite hello
		}
		System.out.println("Hi");
		
		
		while(m>n) {
			System.out.println("Hello");
		}
		System.out.println("hi");
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		// do---while
		
		//Case 1 : Valid
		/*do
			System.out.println("Hello");
		while(true);
		*/
		// Case 2: Invalid
		/*
		do
			int x=10;
		while(true);
		*/ 
		
		//-------------------------------------------------------------------------------------------------------------------
		
		// for loop
		
		for(int i=0;i<10;i++) {
			
		}
		
		int i=0;
		for (System.out.println("Hello");i<10;i++){
			 
			 System.out.println("Hi");
			 						}
		
		//---------------------------------------------------------------------------------------------------------------------------
		
		// For Each loop
		int [] arr ={10,20,30};
		 					
		 						//With Normal formal
		 						for(int j=0;i<arr.length;j++){
		 
		 						System.out.println(arr[j]);
		 
								}
		
								// for Each loop
		 
		  						for(int x1:arr){
		  							System.out.println(x1);
		  						}
		
		
	}

}
