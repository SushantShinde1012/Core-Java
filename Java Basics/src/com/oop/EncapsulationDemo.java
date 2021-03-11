package com.oop;
/*
 * Encapsulation :
 * 	
 * 		- Process of binding data members and corresponding behavior/methods into single unit is called as Encapsulation
 * 
 * 		- Every Java class is Example of Encapsulation
 * 
 * 		- Encapsulation = Data hiding + Abstraction
 * 
 */
class Person {
	
	  private String name; // private data members  = restricted access

	  // Getter / method/ behavior
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	  
	  
	}



public class EncapsulationDemo {
	
	 public static void main(String[] args) {
		    Person myObj = new Person();
		//    myObj.name = "John";  // error
		 //   System.out.println(myObj.name); // error 
		    myObj.setName("Sushant");
		   System.out.println( myObj.getName());
		    
	 }

}
