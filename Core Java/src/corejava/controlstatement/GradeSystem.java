package corejava.controlstatement;

public class GradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=65;
		
		if(marks>75) {
			System.out.println("You passed with first classDistinction");
		}else if(marks>60) {
			System.out.println("You passed with first class");
		}else if(marks>35) {
			System.out.println("You passed with second class");
		}else {
			System.out.println("Try Next Year");
		}
	}

}
