package corejava.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=-12;
		boolean c= true;
		boolean d=false;
		
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);////11 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
	}

}
