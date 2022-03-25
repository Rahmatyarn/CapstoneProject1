package BankProject;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address sample1 = new Address("6201 Leesburg Pike", " Ste 216 ", "Falls Church", "VA", "22044");
		Address sample2 = new Address("6201 Leesburg Pike", " Ste 216 ", "Falls Church", "VA", "22044");
				System.out.println(sample1);
				System.out.println(sample2);
				System.out.println(sample1.equals(sample2));
	}

}
