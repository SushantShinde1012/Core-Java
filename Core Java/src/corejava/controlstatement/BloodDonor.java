package corejava.controlstatement;

public class BloodDonor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		int weight=55;
		if(age>=18) {
			if(weight>50) {
				System.out.println("Blood Donor is eligible to donate");
			}
		}else {
			System.out.println("You cannot donate blood");
		}
	}

}
